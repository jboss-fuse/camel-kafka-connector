/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.camel.kafkaconnector.jdbc.services;

import java.sql.SQLException;

import org.apache.camel.kafkaconnector.jdbc.client.DatabaseClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testcontainers.containers.JdbcDatabaseContainer;
import org.testcontainers.containers.PostgreSQLContainer;

public class JDBCLocalContainerService implements JDBCService {
    private static final Logger LOG = LoggerFactory.getLogger(JDBCLocalContainerService.class);

    private static JdbcDatabaseContainer container;

    public JDBCLocalContainerService() {
        container = new PostgreSQLContainer()
                .withDatabaseName("camel")
                .withUsername("ckc")
                .withPassword("ckcDevel123")
                .withInitScript("schema.sql")
                .withStartupTimeoutSeconds(60);

        container.start();

        System.setProperty("jdbc.url", container.getJdbcUrl());
    }

    @Override
    public DatabaseClient getClient() throws SQLException {
        return new DatabaseClient(container.getJdbcUrl());
    }

    @Override
    public void initialize() {
        LOG.info("Database instance available via JDBC url {}", container.getJdbcUrl());
    }

    @Override
    public void shutdown() {
        LOG.info("Stopping the database instance");
        container.stop();
    }
}
