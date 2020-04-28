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
package org.apache.camel.kafkaconnector.pgevent;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelPgeventSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_PGEVENT_PATH_HOST_CONF = "camel.source.path.host";
    public static final String CAMEL_SOURCE_PGEVENT_PATH_HOST_DOC = "To connect using hostname and port to the database.";
    public static final String CAMEL_SOURCE_PGEVENT_PATH_HOST_DEFAULT = "localhost";
    public static final String CAMEL_SOURCE_PGEVENT_PATH_PORT_CONF = "camel.source.path.port";
    public static final String CAMEL_SOURCE_PGEVENT_PATH_PORT_DOC = "To connect using hostname and port to the database.";
    public static final String CAMEL_SOURCE_PGEVENT_PATH_PORT_DEFAULT = "5432";
    public static final String CAMEL_SOURCE_PGEVENT_PATH_DATABASE_CONF = "camel.source.path.database";
    public static final String CAMEL_SOURCE_PGEVENT_PATH_DATABASE_DOC = "The database name";
    public static final String CAMEL_SOURCE_PGEVENT_PATH_DATABASE_DEFAULT = null;
    public static final String CAMEL_SOURCE_PGEVENT_PATH_CHANNEL_CONF = "camel.source.path.channel";
    public static final String CAMEL_SOURCE_PGEVENT_PATH_CHANNEL_DOC = "The channel name";
    public static final String CAMEL_SOURCE_PGEVENT_PATH_CHANNEL_DEFAULT = null;
    public static final String CAMEL_SOURCE_PGEVENT_ENDPOINT_DATASOURCE_CONF = "camel.source.endpoint.datasource";
    public static final String CAMEL_SOURCE_PGEVENT_ENDPOINT_DATASOURCE_DOC = "To connect using the given javax.sql.DataSource instead of using hostname and port.";
    public static final String CAMEL_SOURCE_PGEVENT_ENDPOINT_DATASOURCE_DEFAULT = null;
    public static final String CAMEL_SOURCE_PGEVENT_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_PGEVENT_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_PGEVENT_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_PGEVENT_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_PGEVENT_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_PGEVENT_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_PGEVENT_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_PGEVENT_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_PGEVENT_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_PGEVENT_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_PGEVENT_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_PGEVENT_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_PGEVENT_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_PGEVENT_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_PGEVENT_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_PGEVENT_ENDPOINT_PASS_CONF = "camel.source.endpoint.pass";
    public static final String CAMEL_SOURCE_PGEVENT_ENDPOINT_PASS_DOC = "Password for login";
    public static final String CAMEL_SOURCE_PGEVENT_ENDPOINT_PASS_DEFAULT = null;
    public static final String CAMEL_SOURCE_PGEVENT_ENDPOINT_USER_CONF = "camel.source.endpoint.user";
    public static final String CAMEL_SOURCE_PGEVENT_ENDPOINT_USER_DOC = "Username for login";
    public static final String CAMEL_SOURCE_PGEVENT_ENDPOINT_USER_DEFAULT = "postgres";
    public static final String CAMEL_SOURCE_PGEVENT_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.pgevent.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_PGEVENT_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_PGEVENT_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_PGEVENT_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.pgevent.basicPropertyBinding";
    public static final String CAMEL_SOURCE_PGEVENT_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_PGEVENT_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelPgeventSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelPgeventSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_PGEVENT_PATH_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PGEVENT_PATH_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PGEVENT_PATH_HOST_DOC);
        conf.define(CAMEL_SOURCE_PGEVENT_PATH_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PGEVENT_PATH_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PGEVENT_PATH_PORT_DOC);
        conf.define(CAMEL_SOURCE_PGEVENT_PATH_DATABASE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PGEVENT_PATH_DATABASE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_PGEVENT_PATH_DATABASE_DOC);
        conf.define(CAMEL_SOURCE_PGEVENT_PATH_CHANNEL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PGEVENT_PATH_CHANNEL_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_PGEVENT_PATH_CHANNEL_DOC);
        conf.define(CAMEL_SOURCE_PGEVENT_ENDPOINT_DATASOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PGEVENT_ENDPOINT_DATASOURCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PGEVENT_ENDPOINT_DATASOURCE_DOC);
        conf.define(CAMEL_SOURCE_PGEVENT_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_PGEVENT_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PGEVENT_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_PGEVENT_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PGEVENT_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PGEVENT_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_PGEVENT_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PGEVENT_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PGEVENT_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_PGEVENT_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_PGEVENT_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PGEVENT_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_PGEVENT_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_PGEVENT_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PGEVENT_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_PGEVENT_ENDPOINT_PASS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PGEVENT_ENDPOINT_PASS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PGEVENT_ENDPOINT_PASS_DOC);
        conf.define(CAMEL_SOURCE_PGEVENT_ENDPOINT_USER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_PGEVENT_ENDPOINT_USER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PGEVENT_ENDPOINT_USER_DOC);
        conf.define(CAMEL_SOURCE_PGEVENT_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_PGEVENT_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PGEVENT_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_PGEVENT_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_PGEVENT_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_PGEVENT_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}