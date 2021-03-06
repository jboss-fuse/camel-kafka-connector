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

package org.apache.camel.kafkaconnector.aws.v2.services;

import java.util.Properties;
import java.util.function.Supplier;


import org.apache.camel.kafkaconnector.aws.common.AWSConfigs;
import org.apache.camel.kafkaconnector.aws.common.services.AWSService;
import org.apache.camel.kafkaconnector.aws.v2.common.TestAWSCredentialsProvider;
import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.regions.Region;

public class AWSRemoteService<T> implements AWSService<T> {
    private static final AwsCredentialsProvider CREDENTIALS_PROVIDER = new TestAWSCredentialsProvider();
    private Supplier<T> remoteClientSupplier;

    public AWSRemoteService(Supplier<T> remoteClientSupplier) {
        this.remoteClientSupplier = remoteClientSupplier;
    }


    @Override
    public T getClient() {
        return remoteClientSupplier.get();
    }

    @Override
    public Properties getConnectionProperties() {
        Properties properties = new Properties();

        AwsCredentials credentials = CREDENTIALS_PROVIDER.resolveCredentials();

        properties.put(AWSConfigs.ACCESS_KEY, credentials.accessKeyId());
        properties.put(AWSConfigs.SECRET_KEY, credentials.secretAccessKey());
        properties.put(AWSConfigs.REGION, Region.US_EAST_1.toString());

        return properties;
    }

    @Override
    public void initialize() {

    }

    @Override
    public void shutdown() {

    }
}
