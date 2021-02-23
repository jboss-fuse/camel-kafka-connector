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
package org.apache.camel.kafkaconnector.graphql;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelGraphqlSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_GRAPHQL_PATH_HTTP_URI_CONF = "camel.sink.path.httpUri";
    public static final String CAMEL_SINK_GRAPHQL_PATH_HTTP_URI_DOC = "The GraphQL server URI.";
    public static final String CAMEL_SINK_GRAPHQL_PATH_HTTP_URI_DEFAULT = null;
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_GRAPHQL_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_OPERATION_NAME_CONF = "camel.sink.endpoint.operationName";
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_OPERATION_NAME_DOC = "The query or mutation name.";
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_OPERATION_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_PROXY_HOST_CONF = "camel.sink.endpoint.proxyHost";
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_PROXY_HOST_DOC = "The proxy host in the format hostname:port.";
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_PROXY_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_QUERY_CONF = "camel.sink.endpoint.query";
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_QUERY_DOC = "The query text.";
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_QUERY_DEFAULT = null;
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_QUERY_FILE_CONF = "camel.sink.endpoint.queryFile";
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_QUERY_FILE_DOC = "The query file name located in the classpath.";
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_QUERY_FILE_DEFAULT = null;
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_VARIABLES_CONF = "camel.sink.endpoint.variables";
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_VARIABLES_DOC = "The JsonObject instance containing the operation variables.";
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_VARIABLES_DEFAULT = null;
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_GRAPHQL_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_ACCESS_TOKEN_CONF = "camel.sink.endpoint.accessToken";
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_ACCESS_TOKEN_DOC = "The access token sent in the Authorization header.";
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_ACCESS_TOKEN_DEFAULT = null;
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_JWT_AUTHORIZATION_TYPE_CONF = "camel.sink.endpoint.jwtAuthorizationType";
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_JWT_AUTHORIZATION_TYPE_DOC = "The JWT Authorization type. Default is Bearer.";
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_JWT_AUTHORIZATION_TYPE_DEFAULT = "Bearer";
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_PASSWORD_CONF = "camel.sink.endpoint.password";
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_PASSWORD_DOC = "The password for Basic authentication.";
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_USERNAME_CONF = "camel.sink.endpoint.username";
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_USERNAME_DOC = "The username for Basic authentication.";
    public static final String CAMEL_SINK_GRAPHQL_ENDPOINT_USERNAME_DEFAULT = null;
    public static final String CAMEL_SINK_GRAPHQL_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.graphql.lazyStartProducer";
    public static final String CAMEL_SINK_GRAPHQL_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_GRAPHQL_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_GRAPHQL_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.graphql.autowiredEnabled";
    public static final String CAMEL_SINK_GRAPHQL_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_GRAPHQL_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;

    public CamelGraphqlSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelGraphqlSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_GRAPHQL_PATH_HTTP_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GRAPHQL_PATH_HTTP_URI_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_GRAPHQL_PATH_HTTP_URI_DOC);
        conf.define(CAMEL_SINK_GRAPHQL_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_GRAPHQL_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRAPHQL_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_GRAPHQL_ENDPOINT_OPERATION_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GRAPHQL_ENDPOINT_OPERATION_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRAPHQL_ENDPOINT_OPERATION_NAME_DOC);
        conf.define(CAMEL_SINK_GRAPHQL_ENDPOINT_PROXY_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GRAPHQL_ENDPOINT_PROXY_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRAPHQL_ENDPOINT_PROXY_HOST_DOC);
        conf.define(CAMEL_SINK_GRAPHQL_ENDPOINT_QUERY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GRAPHQL_ENDPOINT_QUERY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRAPHQL_ENDPOINT_QUERY_DOC);
        conf.define(CAMEL_SINK_GRAPHQL_ENDPOINT_QUERY_FILE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GRAPHQL_ENDPOINT_QUERY_FILE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRAPHQL_ENDPOINT_QUERY_FILE_DOC);
        conf.define(CAMEL_SINK_GRAPHQL_ENDPOINT_VARIABLES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GRAPHQL_ENDPOINT_VARIABLES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRAPHQL_ENDPOINT_VARIABLES_DOC);
        conf.define(CAMEL_SINK_GRAPHQL_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_GRAPHQL_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRAPHQL_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_GRAPHQL_ENDPOINT_ACCESS_TOKEN_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_GRAPHQL_ENDPOINT_ACCESS_TOKEN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRAPHQL_ENDPOINT_ACCESS_TOKEN_DOC);
        conf.define(CAMEL_SINK_GRAPHQL_ENDPOINT_JWT_AUTHORIZATION_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GRAPHQL_ENDPOINT_JWT_AUTHORIZATION_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRAPHQL_ENDPOINT_JWT_AUTHORIZATION_TYPE_DOC);
        conf.define(CAMEL_SINK_GRAPHQL_ENDPOINT_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_GRAPHQL_ENDPOINT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRAPHQL_ENDPOINT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_GRAPHQL_ENDPOINT_USERNAME_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_GRAPHQL_ENDPOINT_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRAPHQL_ENDPOINT_USERNAME_DOC);
        conf.define(CAMEL_SINK_GRAPHQL_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_GRAPHQL_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRAPHQL_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_GRAPHQL_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_GRAPHQL_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRAPHQL_COMPONENT_AUTOWIRED_ENABLED_DOC);
        return conf;
    }
}