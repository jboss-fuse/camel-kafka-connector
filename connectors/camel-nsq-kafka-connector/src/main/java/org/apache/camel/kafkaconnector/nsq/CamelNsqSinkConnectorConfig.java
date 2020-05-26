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
package org.apache.camel.kafkaconnector.nsq;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelNsqSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_NSQ_PATH_TOPIC_CONF = "camel.sink.path.topic";
    public static final String CAMEL_SINK_NSQ_PATH_TOPIC_DOC = "The NSQ topic";
    public static final String CAMEL_SINK_NSQ_PATH_TOPIC_DEFAULT = null;
    public static final String CAMEL_SINK_NSQ_ENDPOINT_SERVERS_CONF = "camel.sink.endpoint.servers";
    public static final String CAMEL_SINK_NSQ_ENDPOINT_SERVERS_DOC = "The hostnames of one or more nsqlookupd servers (consumer) or nsqd servers (producer).";
    public static final String CAMEL_SINK_NSQ_ENDPOINT_SERVERS_DEFAULT = null;
    public static final String CAMEL_SINK_NSQ_ENDPOINT_USER_AGENT_CONF = "camel.sink.endpoint.userAgent";
    public static final String CAMEL_SINK_NSQ_ENDPOINT_USER_AGENT_DOC = "A String to identify the kind of client";
    public static final String CAMEL_SINK_NSQ_ENDPOINT_USER_AGENT_DEFAULT = null;
    public static final String CAMEL_SINK_NSQ_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_NSQ_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_NSQ_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_NSQ_ENDPOINT_PORT_CONF = "camel.sink.endpoint.port";
    public static final String CAMEL_SINK_NSQ_ENDPOINT_PORT_DOC = "The port of the nsqd server";
    public static final Integer CAMEL_SINK_NSQ_ENDPOINT_PORT_DEFAULT = 4150;
    public static final String CAMEL_SINK_NSQ_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_NSQ_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_NSQ_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_NSQ_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_NSQ_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_NSQ_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_NSQ_ENDPOINT_SECURE_CONF = "camel.sink.endpoint.secure";
    public static final String CAMEL_SINK_NSQ_ENDPOINT_SECURE_DOC = "Set secure option indicating TLS is required";
    public static final Boolean CAMEL_SINK_NSQ_ENDPOINT_SECURE_DEFAULT = false;
    public static final String CAMEL_SINK_NSQ_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF = "camel.sink.endpoint.sslContextParameters";
    public static final String CAMEL_SINK_NSQ_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC = "To configure security using SSLContextParameters";
    public static final String CAMEL_SINK_NSQ_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_NSQ_COMPONENT_SERVERS_CONF = "camel.component.nsq.servers";
    public static final String CAMEL_SINK_NSQ_COMPONENT_SERVERS_DOC = "The hostnames of one or more nsqlookupd servers (consumer) or nsqd servers (producer).";
    public static final String CAMEL_SINK_NSQ_COMPONENT_SERVERS_DEFAULT = null;
    public static final String CAMEL_SINK_NSQ_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.nsq.lazyStartProducer";
    public static final String CAMEL_SINK_NSQ_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_NSQ_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_NSQ_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.nsq.basicPropertyBinding";
    public static final String CAMEL_SINK_NSQ_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_NSQ_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_NSQ_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.nsq.useGlobalSslContextParameters";
    public static final String CAMEL_SINK_NSQ_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC = "Enable usage of global SSL context parameters.";
    public static final Boolean CAMEL_SINK_NSQ_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT = false;

    public CamelNsqSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelNsqSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_NSQ_PATH_TOPIC_CONF, ConfigDef.Type.STRING, CAMEL_SINK_NSQ_PATH_TOPIC_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_NSQ_PATH_TOPIC_DOC);
        conf.define(CAMEL_SINK_NSQ_ENDPOINT_SERVERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_NSQ_ENDPOINT_SERVERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NSQ_ENDPOINT_SERVERS_DOC);
        conf.define(CAMEL_SINK_NSQ_ENDPOINT_USER_AGENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_NSQ_ENDPOINT_USER_AGENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NSQ_ENDPOINT_USER_AGENT_DOC);
        conf.define(CAMEL_SINK_NSQ_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NSQ_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NSQ_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_NSQ_ENDPOINT_PORT_CONF, ConfigDef.Type.INT, CAMEL_SINK_NSQ_ENDPOINT_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NSQ_ENDPOINT_PORT_DOC);
        conf.define(CAMEL_SINK_NSQ_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NSQ_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NSQ_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_NSQ_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NSQ_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NSQ_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_NSQ_ENDPOINT_SECURE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NSQ_ENDPOINT_SECURE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NSQ_ENDPOINT_SECURE_DOC);
        conf.define(CAMEL_SINK_NSQ_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_NSQ_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NSQ_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_NSQ_COMPONENT_SERVERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_NSQ_COMPONENT_SERVERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NSQ_COMPONENT_SERVERS_DOC);
        conf.define(CAMEL_SINK_NSQ_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NSQ_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NSQ_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_NSQ_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NSQ_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NSQ_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_NSQ_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NSQ_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NSQ_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC);
        return conf;
    }
}