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
package org.apache.camel.kafkaconnector.yammer;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelYammerSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_YAMMER_PATH_FUNCTION_CONF = "camel.sink.path.function";
    public static final String CAMEL_SINK_YAMMER_PATH_FUNCTION_DOC = "The function to use One of: [MESSAGES] [MY_FEED] [ALGO] [FOLLOWING] [SENT] [PRIVATE] [RECEIVED] [USERS] [CURRENT]";
    public static final String CAMEL_SINK_YAMMER_PATH_FUNCTION_DEFAULT = null;
    public static final String CAMEL_SINK_YAMMER_ENDPOINT_USE_JSON_CONF = "camel.sink.endpoint.useJson";
    public static final String CAMEL_SINK_YAMMER_ENDPOINT_USE_JSON_DOC = "Set to true if you want to use raw JSON rather than converting to POJOs.";
    public static final Boolean CAMEL_SINK_YAMMER_ENDPOINT_USE_JSON_DEFAULT = false;
    public static final String CAMEL_SINK_YAMMER_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_YAMMER_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_YAMMER_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_YAMMER_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_YAMMER_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_YAMMER_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_YAMMER_ENDPOINT_REQUESTOR_CONF = "camel.sink.endpoint.requestor";
    public static final String CAMEL_SINK_YAMMER_ENDPOINT_REQUESTOR_DOC = "To use a specific requester to communicate with Yammer.";
    public static final String CAMEL_SINK_YAMMER_ENDPOINT_REQUESTOR_DEFAULT = null;
    public static final String CAMEL_SINK_YAMMER_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_YAMMER_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_YAMMER_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_YAMMER_ENDPOINT_ACCESS_TOKEN_CONF = "camel.sink.endpoint.accessToken";
    public static final String CAMEL_SINK_YAMMER_ENDPOINT_ACCESS_TOKEN_DOC = "The access token";
    public static final String CAMEL_SINK_YAMMER_ENDPOINT_ACCESS_TOKEN_DEFAULT = null;
    public static final String CAMEL_SINK_YAMMER_ENDPOINT_CONSUMER_KEY_CONF = "camel.sink.endpoint.consumerKey";
    public static final String CAMEL_SINK_YAMMER_ENDPOINT_CONSUMER_KEY_DOC = "The consumer key";
    public static final String CAMEL_SINK_YAMMER_ENDPOINT_CONSUMER_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_YAMMER_ENDPOINT_CONSUMER_SECRET_CONF = "camel.sink.endpoint.consumerSecret";
    public static final String CAMEL_SINK_YAMMER_ENDPOINT_CONSUMER_SECRET_DOC = "The consumer secret";
    public static final String CAMEL_SINK_YAMMER_ENDPOINT_CONSUMER_SECRET_DEFAULT = null;
    public static final String CAMEL_SINK_YAMMER_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.yammer.lazyStartProducer";
    public static final String CAMEL_SINK_YAMMER_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_YAMMER_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_YAMMER_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.yammer.basicPropertyBinding";
    public static final String CAMEL_SINK_YAMMER_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_YAMMER_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_YAMMER_COMPONENT_CONFIG_CONF = "camel.component.yammer.config";
    public static final String CAMEL_SINK_YAMMER_COMPONENT_CONFIG_DOC = "To use a shared yammer configuration";
    public static final String CAMEL_SINK_YAMMER_COMPONENT_CONFIG_DEFAULT = null;
    public static final String CAMEL_SINK_YAMMER_COMPONENT_REQUESTOR_CONF = "camel.component.yammer.requestor";
    public static final String CAMEL_SINK_YAMMER_COMPONENT_REQUESTOR_DOC = "To use a specific requester to communicate with Yammer.";
    public static final String CAMEL_SINK_YAMMER_COMPONENT_REQUESTOR_DEFAULT = null;
    public static final String CAMEL_SINK_YAMMER_COMPONENT_ACCESS_TOKEN_CONF = "camel.component.yammer.accessToken";
    public static final String CAMEL_SINK_YAMMER_COMPONENT_ACCESS_TOKEN_DOC = "The access token";
    public static final String CAMEL_SINK_YAMMER_COMPONENT_ACCESS_TOKEN_DEFAULT = null;
    public static final String CAMEL_SINK_YAMMER_COMPONENT_CONSUMER_KEY_CONF = "camel.component.yammer.consumerKey";
    public static final String CAMEL_SINK_YAMMER_COMPONENT_CONSUMER_KEY_DOC = "The consumer key";
    public static final String CAMEL_SINK_YAMMER_COMPONENT_CONSUMER_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_YAMMER_COMPONENT_CONSUMER_SECRET_CONF = "camel.component.yammer.consumerSecret";
    public static final String CAMEL_SINK_YAMMER_COMPONENT_CONSUMER_SECRET_DOC = "The consumer secret";
    public static final String CAMEL_SINK_YAMMER_COMPONENT_CONSUMER_SECRET_DEFAULT = null;

    public CamelYammerSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelYammerSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_YAMMER_PATH_FUNCTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_YAMMER_PATH_FUNCTION_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_YAMMER_PATH_FUNCTION_DOC);
        conf.define(CAMEL_SINK_YAMMER_ENDPOINT_USE_JSON_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_YAMMER_ENDPOINT_USE_JSON_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_YAMMER_ENDPOINT_USE_JSON_DOC);
        conf.define(CAMEL_SINK_YAMMER_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_YAMMER_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_YAMMER_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_YAMMER_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_YAMMER_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_YAMMER_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_YAMMER_ENDPOINT_REQUESTOR_CONF, ConfigDef.Type.STRING, CAMEL_SINK_YAMMER_ENDPOINT_REQUESTOR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_YAMMER_ENDPOINT_REQUESTOR_DOC);
        conf.define(CAMEL_SINK_YAMMER_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_YAMMER_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_YAMMER_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_YAMMER_ENDPOINT_ACCESS_TOKEN_CONF, ConfigDef.Type.STRING, CAMEL_SINK_YAMMER_ENDPOINT_ACCESS_TOKEN_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_YAMMER_ENDPOINT_ACCESS_TOKEN_DOC);
        conf.define(CAMEL_SINK_YAMMER_ENDPOINT_CONSUMER_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_YAMMER_ENDPOINT_CONSUMER_KEY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_YAMMER_ENDPOINT_CONSUMER_KEY_DOC);
        conf.define(CAMEL_SINK_YAMMER_ENDPOINT_CONSUMER_SECRET_CONF, ConfigDef.Type.STRING, CAMEL_SINK_YAMMER_ENDPOINT_CONSUMER_SECRET_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_YAMMER_ENDPOINT_CONSUMER_SECRET_DOC);
        conf.define(CAMEL_SINK_YAMMER_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_YAMMER_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_YAMMER_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_YAMMER_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_YAMMER_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_YAMMER_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_YAMMER_COMPONENT_CONFIG_CONF, ConfigDef.Type.STRING, CAMEL_SINK_YAMMER_COMPONENT_CONFIG_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_YAMMER_COMPONENT_CONFIG_DOC);
        conf.define(CAMEL_SINK_YAMMER_COMPONENT_REQUESTOR_CONF, ConfigDef.Type.STRING, CAMEL_SINK_YAMMER_COMPONENT_REQUESTOR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_YAMMER_COMPONENT_REQUESTOR_DOC);
        conf.define(CAMEL_SINK_YAMMER_COMPONENT_ACCESS_TOKEN_CONF, ConfigDef.Type.STRING, CAMEL_SINK_YAMMER_COMPONENT_ACCESS_TOKEN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_YAMMER_COMPONENT_ACCESS_TOKEN_DOC);
        conf.define(CAMEL_SINK_YAMMER_COMPONENT_CONSUMER_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_YAMMER_COMPONENT_CONSUMER_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_YAMMER_COMPONENT_CONSUMER_KEY_DOC);
        conf.define(CAMEL_SINK_YAMMER_COMPONENT_CONSUMER_SECRET_CONF, ConfigDef.Type.STRING, CAMEL_SINK_YAMMER_COMPONENT_CONSUMER_SECRET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_YAMMER_COMPONENT_CONSUMER_SECRET_DOC);
        return conf;
    }
}