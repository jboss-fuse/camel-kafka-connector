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
package org.apache.camel.kafkaconnector.consul;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelConsulSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_CONSUL_PATH_API_ENDPOINT_CONF = "camel.sink.path.apiEndpoint";
    public static final String CAMEL_SINK_CONSUL_PATH_API_ENDPOINT_DOC = "The API endpoint";
    public static final String CAMEL_SINK_CONSUL_PATH_API_ENDPOINT_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_CONNECT_TIMEOUT_CONF = "camel.sink.endpoint.connectTimeout";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_CONNECT_TIMEOUT_DOC = "Connect timeout for OkHttpClient";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_CONNECT_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_CONNECT_TIMEOUT_MILLIS_CONF = "camel.sink.endpoint.connectTimeoutMillis";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_CONNECT_TIMEOUT_MILLIS_DOC = "Connect timeout for OkHttpClient. Deprecation note: Use connectTimeout instead";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_CONNECT_TIMEOUT_MILLIS_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_CONSUL_CLIENT_CONF = "camel.sink.endpoint.consulClient";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_CONSUL_CLIENT_DOC = "Reference to a com.orbitz.consul.Consul in the registry.";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_CONSUL_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_KEY_CONF = "camel.sink.endpoint.key";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_KEY_DOC = "The default key. Can be overridden by CamelConsulKey";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_PING_INSTANCE_CONF = "camel.sink.endpoint.pingInstance";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_PING_INSTANCE_DOC = "Configure if the AgentClient should attempt a ping before returning the Consul instance";
    public static final Boolean CAMEL_SINK_CONSUL_ENDPOINT_PING_INSTANCE_DEFAULT = true;
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_READ_TIMEOUT_CONF = "camel.sink.endpoint.readTimeout";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_READ_TIMEOUT_DOC = "Read timeout for OkHttpClient";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_READ_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_READ_TIMEOUT_MILLIS_CONF = "camel.sink.endpoint.readTimeoutMillis";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_READ_TIMEOUT_MILLIS_DOC = "Read timeout for OkHttpClient. Deprecation note: Use readTimeout instead";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_READ_TIMEOUT_MILLIS_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_TAGS_CONF = "camel.sink.endpoint.tags";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_TAGS_DOC = "Set tags. You can separate multiple tags by comma.";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_TAGS_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_URL_CONF = "camel.sink.endpoint.url";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_URL_DOC = "The Consul agent URL";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_URL_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_WRITE_TIMEOUT_CONF = "camel.sink.endpoint.writeTimeout";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_WRITE_TIMEOUT_DOC = "Write timeout for OkHttpClient";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_WRITE_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_WRITE_TIMEOUT_MILLIS_CONF = "camel.sink.endpoint.writeTimeoutMillis";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_WRITE_TIMEOUT_MILLIS_DOC = "Write timeout for OkHttpClient. Deprecation note: Use writeTimeout instead";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_WRITE_TIMEOUT_MILLIS_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_ACTION_CONF = "camel.sink.endpoint.action";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_ACTION_DOC = "The default action. Can be overridden by CamelConsulAction";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_ACTION_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_CONSUL_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_VALUE_AS_STRING_CONF = "camel.sink.endpoint.valueAsString";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_VALUE_AS_STRING_DOC = "Default to transform values retrieved from Consul i.e. on KV endpoint to string.";
    public static final Boolean CAMEL_SINK_CONSUL_ENDPOINT_VALUE_AS_STRING_DEFAULT = false;
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_CONSISTENCY_MODE_CONF = "camel.sink.endpoint.consistencyMode";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_CONSISTENCY_MODE_DOC = "The consistencyMode used for queries, default ConsistencyMode.DEFAULT One of: [DEFAULT] [STALE] [CONSISTENT]";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_CONSISTENCY_MODE_DEFAULT = "DEFAULT";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_DATACENTER_CONF = "camel.sink.endpoint.datacenter";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_DATACENTER_DOC = "The data center";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_DATACENTER_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_NEAR_NODE_CONF = "camel.sink.endpoint.nearNode";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_NEAR_NODE_DOC = "The near node to use for queries.";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_NEAR_NODE_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_NODE_META_CONF = "camel.sink.endpoint.nodeMeta";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_NODE_META_DOC = "The note meta-data to use for queries.";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_NODE_META_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_CONSUL_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_ACL_TOKEN_CONF = "camel.sink.endpoint.aclToken";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_ACL_TOKEN_DOC = "Sets the ACL token to be used with Consul";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_ACL_TOKEN_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_PASSWORD_CONF = "camel.sink.endpoint.password";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_PASSWORD_DOC = "Sets the password to be used for basic authentication";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF = "camel.sink.endpoint.sslContextParameters";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC = "SSL configuration using an org.apache.camel.support.jsse.SSLContextParameters instance.";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_USER_NAME_CONF = "camel.sink.endpoint.userName";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_USER_NAME_DOC = "Sets the username to be used for basic authentication";
    public static final String CAMEL_SINK_CONSUL_ENDPOINT_USER_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_COMPONENT_CONNECT_TIMEOUT_CONF = "camel.component.consul.connectTimeout";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_CONNECT_TIMEOUT_DOC = "Connect timeout for OkHttpClient";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_CONNECT_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_COMPONENT_CONNECT_TIMEOUT_MILLIS_CONF = "camel.component.consul.connectTimeoutMillis";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_CONNECT_TIMEOUT_MILLIS_DOC = "Connect timeout for OkHttpClient. Deprecation note: Use connectTimeout instead";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_CONNECT_TIMEOUT_MILLIS_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_COMPONENT_CONSUL_CLIENT_CONF = "camel.component.consul.consulClient";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_CONSUL_CLIENT_DOC = "Reference to a com.orbitz.consul.Consul in the registry.";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_CONSUL_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_COMPONENT_KEY_CONF = "camel.component.consul.key";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_KEY_DOC = "The default key. Can be overridden by CamelConsulKey";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_COMPONENT_PING_INSTANCE_CONF = "camel.component.consul.pingInstance";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_PING_INSTANCE_DOC = "Configure if the AgentClient should attempt a ping before returning the Consul instance";
    public static final Boolean CAMEL_SINK_CONSUL_COMPONENT_PING_INSTANCE_DEFAULT = true;
    public static final String CAMEL_SINK_CONSUL_COMPONENT_READ_TIMEOUT_CONF = "camel.component.consul.readTimeout";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_READ_TIMEOUT_DOC = "Read timeout for OkHttpClient";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_READ_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_COMPONENT_READ_TIMEOUT_MILLIS_CONF = "camel.component.consul.readTimeoutMillis";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_READ_TIMEOUT_MILLIS_DOC = "Read timeout for OkHttpClient. Deprecation note: Use readTimeout instead";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_READ_TIMEOUT_MILLIS_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_COMPONENT_TAGS_CONF = "camel.component.consul.tags";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_TAGS_DOC = "Set tags. You can separate multiple tags by comma.";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_TAGS_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_COMPONENT_URL_CONF = "camel.component.consul.url";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_URL_DOC = "The Consul agent URL";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_URL_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_COMPONENT_WRITE_TIMEOUT_CONF = "camel.component.consul.writeTimeout";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_WRITE_TIMEOUT_DOC = "Write timeout for OkHttpClient";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_WRITE_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_COMPONENT_WRITE_TIMEOUT_MILLIS_CONF = "camel.component.consul.writeTimeoutMillis";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_WRITE_TIMEOUT_MILLIS_DOC = "Write timeout for OkHttpClient. Deprecation note: Use writeTimeout instead";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_WRITE_TIMEOUT_MILLIS_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_COMPONENT_ACTION_CONF = "camel.component.consul.action";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_ACTION_DOC = "The default action. Can be overridden by CamelConsulAction";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_ACTION_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.consul.lazyStartProducer";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_CONSUL_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_CONSUL_COMPONENT_VALUE_AS_STRING_CONF = "camel.component.consul.valueAsString";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_VALUE_AS_STRING_DOC = "Default to transform values retrieved from Consul i.e. on KV endpoint to string.";
    public static final Boolean CAMEL_SINK_CONSUL_COMPONENT_VALUE_AS_STRING_DEFAULT = false;
    public static final String CAMEL_SINK_CONSUL_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.consul.autowiredEnabled";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_CONSUL_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_CONSUL_COMPONENT_CONFIGURATION_CONF = "camel.component.consul.configuration";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_CONFIGURATION_DOC = "Consul configuration";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_COMPONENT_CONSISTENCY_MODE_CONF = "camel.component.consul.consistencyMode";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_CONSISTENCY_MODE_DOC = "The consistencyMode used for queries, default ConsistencyMode.DEFAULT One of: [DEFAULT] [STALE] [CONSISTENT]";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_CONSISTENCY_MODE_DEFAULT = "DEFAULT";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_DATACENTER_CONF = "camel.component.consul.datacenter";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_DATACENTER_DOC = "The data center";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_DATACENTER_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_COMPONENT_NEAR_NODE_CONF = "camel.component.consul.nearNode";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_NEAR_NODE_DOC = "The near node to use for queries.";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_NEAR_NODE_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_COMPONENT_NODE_META_CONF = "camel.component.consul.nodeMeta";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_NODE_META_DOC = "The note meta-data to use for queries.";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_NODE_META_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_COMPONENT_ACL_TOKEN_CONF = "camel.component.consul.aclToken";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_ACL_TOKEN_DOC = "Sets the ACL token to be used with Consul";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_ACL_TOKEN_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_COMPONENT_PASSWORD_CONF = "camel.component.consul.password";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_PASSWORD_DOC = "Sets the password to be used for basic authentication";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.consul.sslContextParameters";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC = "SSL configuration using an org.apache.camel.support.jsse.SSLContextParameters instance.";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_CONSUL_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.consul.useGlobalSslContextParameters";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC = "Enable usage of global SSL context parameters.";
    public static final Boolean CAMEL_SINK_CONSUL_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT = false;
    public static final String CAMEL_SINK_CONSUL_COMPONENT_USER_NAME_CONF = "camel.component.consul.userName";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_USER_NAME_DOC = "Sets the username to be used for basic authentication";
    public static final String CAMEL_SINK_CONSUL_COMPONENT_USER_NAME_DEFAULT = null;

    public CamelConsulSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelConsulSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_CONSUL_PATH_API_ENDPOINT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_PATH_API_ENDPOINT_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_CONSUL_PATH_API_ENDPOINT_DOC);
        conf.define(CAMEL_SINK_CONSUL_ENDPOINT_CONNECT_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_ENDPOINT_CONNECT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_ENDPOINT_CONNECT_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_CONSUL_ENDPOINT_CONNECT_TIMEOUT_MILLIS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_ENDPOINT_CONNECT_TIMEOUT_MILLIS_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SINK_CONSUL_ENDPOINT_CONNECT_TIMEOUT_MILLIS_DOC);
        conf.define(CAMEL_SINK_CONSUL_ENDPOINT_CONSUL_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_ENDPOINT_CONSUL_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_ENDPOINT_CONSUL_CLIENT_DOC);
        conf.define(CAMEL_SINK_CONSUL_ENDPOINT_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_ENDPOINT_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_ENDPOINT_KEY_DOC);
        conf.define(CAMEL_SINK_CONSUL_ENDPOINT_PING_INSTANCE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CONSUL_ENDPOINT_PING_INSTANCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_ENDPOINT_PING_INSTANCE_DOC);
        conf.define(CAMEL_SINK_CONSUL_ENDPOINT_READ_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_ENDPOINT_READ_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_ENDPOINT_READ_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_CONSUL_ENDPOINT_READ_TIMEOUT_MILLIS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_ENDPOINT_READ_TIMEOUT_MILLIS_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SINK_CONSUL_ENDPOINT_READ_TIMEOUT_MILLIS_DOC);
        conf.define(CAMEL_SINK_CONSUL_ENDPOINT_TAGS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_ENDPOINT_TAGS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_ENDPOINT_TAGS_DOC);
        conf.define(CAMEL_SINK_CONSUL_ENDPOINT_URL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_ENDPOINT_URL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_ENDPOINT_URL_DOC);
        conf.define(CAMEL_SINK_CONSUL_ENDPOINT_WRITE_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_ENDPOINT_WRITE_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_ENDPOINT_WRITE_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_CONSUL_ENDPOINT_WRITE_TIMEOUT_MILLIS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_ENDPOINT_WRITE_TIMEOUT_MILLIS_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SINK_CONSUL_ENDPOINT_WRITE_TIMEOUT_MILLIS_DOC);
        conf.define(CAMEL_SINK_CONSUL_ENDPOINT_ACTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_ENDPOINT_ACTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_ENDPOINT_ACTION_DOC);
        conf.define(CAMEL_SINK_CONSUL_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CONSUL_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_CONSUL_ENDPOINT_VALUE_AS_STRING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CONSUL_ENDPOINT_VALUE_AS_STRING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_ENDPOINT_VALUE_AS_STRING_DOC);
        conf.define(CAMEL_SINK_CONSUL_ENDPOINT_CONSISTENCY_MODE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_ENDPOINT_CONSISTENCY_MODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_ENDPOINT_CONSISTENCY_MODE_DOC);
        conf.define(CAMEL_SINK_CONSUL_ENDPOINT_DATACENTER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_ENDPOINT_DATACENTER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_ENDPOINT_DATACENTER_DOC);
        conf.define(CAMEL_SINK_CONSUL_ENDPOINT_NEAR_NODE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_ENDPOINT_NEAR_NODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_ENDPOINT_NEAR_NODE_DOC);
        conf.define(CAMEL_SINK_CONSUL_ENDPOINT_NODE_META_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_ENDPOINT_NODE_META_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_ENDPOINT_NODE_META_DOC);
        conf.define(CAMEL_SINK_CONSUL_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CONSUL_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_CONSUL_ENDPOINT_ACL_TOKEN_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_CONSUL_ENDPOINT_ACL_TOKEN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_ENDPOINT_ACL_TOKEN_DOC);
        conf.define(CAMEL_SINK_CONSUL_ENDPOINT_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_CONSUL_ENDPOINT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_ENDPOINT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_CONSUL_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_CONSUL_ENDPOINT_USER_NAME_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_CONSUL_ENDPOINT_USER_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_ENDPOINT_USER_NAME_DOC);
        conf.define(CAMEL_SINK_CONSUL_COMPONENT_CONNECT_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_COMPONENT_CONNECT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_COMPONENT_CONNECT_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_CONSUL_COMPONENT_CONNECT_TIMEOUT_MILLIS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_COMPONENT_CONNECT_TIMEOUT_MILLIS_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SINK_CONSUL_COMPONENT_CONNECT_TIMEOUT_MILLIS_DOC);
        conf.define(CAMEL_SINK_CONSUL_COMPONENT_CONSUL_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_COMPONENT_CONSUL_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_COMPONENT_CONSUL_CLIENT_DOC);
        conf.define(CAMEL_SINK_CONSUL_COMPONENT_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_COMPONENT_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_COMPONENT_KEY_DOC);
        conf.define(CAMEL_SINK_CONSUL_COMPONENT_PING_INSTANCE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CONSUL_COMPONENT_PING_INSTANCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_COMPONENT_PING_INSTANCE_DOC);
        conf.define(CAMEL_SINK_CONSUL_COMPONENT_READ_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_COMPONENT_READ_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_COMPONENT_READ_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_CONSUL_COMPONENT_READ_TIMEOUT_MILLIS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_COMPONENT_READ_TIMEOUT_MILLIS_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SINK_CONSUL_COMPONENT_READ_TIMEOUT_MILLIS_DOC);
        conf.define(CAMEL_SINK_CONSUL_COMPONENT_TAGS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_COMPONENT_TAGS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_COMPONENT_TAGS_DOC);
        conf.define(CAMEL_SINK_CONSUL_COMPONENT_URL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_COMPONENT_URL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_COMPONENT_URL_DOC);
        conf.define(CAMEL_SINK_CONSUL_COMPONENT_WRITE_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_COMPONENT_WRITE_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_COMPONENT_WRITE_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_CONSUL_COMPONENT_WRITE_TIMEOUT_MILLIS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_COMPONENT_WRITE_TIMEOUT_MILLIS_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SINK_CONSUL_COMPONENT_WRITE_TIMEOUT_MILLIS_DOC);
        conf.define(CAMEL_SINK_CONSUL_COMPONENT_ACTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_COMPONENT_ACTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_COMPONENT_ACTION_DOC);
        conf.define(CAMEL_SINK_CONSUL_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CONSUL_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_CONSUL_COMPONENT_VALUE_AS_STRING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CONSUL_COMPONENT_VALUE_AS_STRING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_COMPONENT_VALUE_AS_STRING_DOC);
        conf.define(CAMEL_SINK_CONSUL_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CONSUL_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SINK_CONSUL_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_CONSUL_COMPONENT_CONSISTENCY_MODE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_COMPONENT_CONSISTENCY_MODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_COMPONENT_CONSISTENCY_MODE_DOC);
        conf.define(CAMEL_SINK_CONSUL_COMPONENT_DATACENTER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_COMPONENT_DATACENTER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_COMPONENT_DATACENTER_DOC);
        conf.define(CAMEL_SINK_CONSUL_COMPONENT_NEAR_NODE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_COMPONENT_NEAR_NODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_COMPONENT_NEAR_NODE_DOC);
        conf.define(CAMEL_SINK_CONSUL_COMPONENT_NODE_META_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_COMPONENT_NODE_META_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_COMPONENT_NODE_META_DOC);
        conf.define(CAMEL_SINK_CONSUL_COMPONENT_ACL_TOKEN_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_CONSUL_COMPONENT_ACL_TOKEN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_COMPONENT_ACL_TOKEN_DOC);
        conf.define(CAMEL_SINK_CONSUL_COMPONENT_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_CONSUL_COMPONENT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_COMPONENT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_CONSUL_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONSUL_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_CONSUL_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CONSUL_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_CONSUL_COMPONENT_USER_NAME_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_CONSUL_COMPONENT_USER_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONSUL_COMPONENT_USER_NAME_DOC);
        return conf;
    }
}