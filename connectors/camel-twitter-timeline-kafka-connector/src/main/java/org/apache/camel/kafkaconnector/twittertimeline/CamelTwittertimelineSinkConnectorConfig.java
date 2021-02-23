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
package org.apache.camel.kafkaconnector.twittertimeline;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelTwittertimelineSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_TWITTERTIMELINE_PATH_TIMELINE_TYPE_CONF = "camel.sink.path.timelineType";
    public static final String CAMEL_SINK_TWITTERTIMELINE_PATH_TIMELINE_TYPE_DOC = "The timeline type to produce/consume. One of: [PUBLIC] [HOME] [USER] [MENTIONS] [RETWEETSOFME] [UNKNOWN]";
    public static final String CAMEL_SINK_TWITTERTIMELINE_PATH_TIMELINE_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_USER_CONF = "camel.sink.endpoint.user";
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_USER_DOC = "The username when using timelineType=user";
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_USER_DEFAULT = null;
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_HOST_CONF = "camel.sink.endpoint.httpProxyHost";
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_HOST_DOC = "The http proxy host which can be used for the camel-twitter. Can also be configured on the TwitterComponent level instead.";
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_PASSWORD_CONF = "camel.sink.endpoint.httpProxyPassword";
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_PASSWORD_DOC = "The http proxy password which can be used for the camel-twitter. Can also be configured on the TwitterComponent level instead.";
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_PORT_CONF = "camel.sink.endpoint.httpProxyPort";
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_PORT_DOC = "The http proxy port which can be used for the camel-twitter. Can also be configured on the TwitterComponent level instead.";
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_USER_CONF = "camel.sink.endpoint.httpProxyUser";
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_USER_DOC = "The http proxy user which can be used for the camel-twitter. Can also be configured on the TwitterComponent level instead.";
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_USER_DEFAULT = null;
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_ACCESS_TOKEN_CONF = "camel.sink.endpoint.accessToken";
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_ACCESS_TOKEN_DOC = "The access token. Can also be configured on the TwitterComponent level instead.";
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_ACCESS_TOKEN_DEFAULT = null;
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_ACCESS_TOKEN_SECRET_CONF = "camel.sink.endpoint.accessTokenSecret";
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_ACCESS_TOKEN_SECRET_DOC = "The access secret. Can also be configured on the TwitterComponent level instead.";
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_ACCESS_TOKEN_SECRET_DEFAULT = null;
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_CONSUMER_KEY_CONF = "camel.sink.endpoint.consumerKey";
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_CONSUMER_KEY_DOC = "The consumer key. Can also be configured on the TwitterComponent level instead.";
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_CONSUMER_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_CONSUMER_SECRET_CONF = "camel.sink.endpoint.consumerSecret";
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_CONSUMER_SECRET_DOC = "The consumer secret. Can also be configured on the TwitterComponent level instead.";
    public static final String CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_CONSUMER_SECRET_DEFAULT = null;
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.twitter-timeline.lazyStartProducer";
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_TWITTERTIMELINE_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.twitter-timeline.autowiredEnabled";
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_TWITTERTIMELINE_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_HOST_CONF = "camel.component.twitter-timeline.httpProxyHost";
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_HOST_DOC = "The http proxy host which can be used for the camel-twitter.";
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_PASSWORD_CONF = "camel.component.twitter-timeline.httpProxyPassword";
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_PASSWORD_DOC = "The http proxy password which can be used for the camel-twitter.";
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_PORT_CONF = "camel.component.twitter-timeline.httpProxyPort";
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_PORT_DOC = "The http proxy port which can be used for the camel-twitter.";
    public static final Integer CAMEL_SINK_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_USER_CONF = "camel.component.twitter-timeline.httpProxyUser";
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_USER_DOC = "The http proxy user which can be used for the camel-twitter.";
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_USER_DEFAULT = null;
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_ACCESS_TOKEN_CONF = "camel.component.twitter-timeline.accessToken";
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_ACCESS_TOKEN_DOC = "The access token";
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_ACCESS_TOKEN_DEFAULT = null;
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_ACCESS_TOKEN_SECRET_CONF = "camel.component.twitter-timeline.accessTokenSecret";
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_ACCESS_TOKEN_SECRET_DOC = "The access token secret";
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_ACCESS_TOKEN_SECRET_DEFAULT = null;
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_CONSUMER_KEY_CONF = "camel.component.twitter-timeline.consumerKey";
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_CONSUMER_KEY_DOC = "The consumer key";
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_CONSUMER_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_CONSUMER_SECRET_CONF = "camel.component.twitter-timeline.consumerSecret";
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_CONSUMER_SECRET_DOC = "The consumer secret";
    public static final String CAMEL_SINK_TWITTERTIMELINE_COMPONENT_CONSUMER_SECRET_DEFAULT = null;

    public CamelTwittertimelineSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelTwittertimelineSinkConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_TWITTERTIMELINE_PATH_TIMELINE_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TWITTERTIMELINE_PATH_TIMELINE_TYPE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_TWITTERTIMELINE_PATH_TIMELINE_TYPE_DOC);
        conf.define(CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_USER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_USER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_USER_DOC);
        conf.define(CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_HOST_DOC);
        conf.define(CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_PASSWORD_DOC);
        conf.define(CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_PORT_DOC);
        conf.define(CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_USER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_USER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_USER_DOC);
        conf.define(CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_ACCESS_TOKEN_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_ACCESS_TOKEN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_ACCESS_TOKEN_DOC);
        conf.define(CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_ACCESS_TOKEN_SECRET_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_ACCESS_TOKEN_SECRET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_ACCESS_TOKEN_SECRET_DOC);
        conf.define(CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_CONSUMER_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_CONSUMER_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_CONSUMER_KEY_DOC);
        conf.define(CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_CONSUMER_SECRET_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_CONSUMER_SECRET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWITTERTIMELINE_ENDPOINT_CONSUMER_SECRET_DOC);
        conf.define(CAMEL_SINK_TWITTERTIMELINE_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_TWITTERTIMELINE_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWITTERTIMELINE_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_TWITTERTIMELINE_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_TWITTERTIMELINE_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWITTERTIMELINE_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SINK_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_HOST_DOC);
        conf.define(CAMEL_SINK_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_PASSWORD_DOC);
        conf.define(CAMEL_SINK_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_PORT_CONF, ConfigDef.Type.INT, CAMEL_SINK_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_PORT_DOC);
        conf.define(CAMEL_SINK_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_USER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_USER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_USER_DOC);
        conf.define(CAMEL_SINK_TWITTERTIMELINE_COMPONENT_ACCESS_TOKEN_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_TWITTERTIMELINE_COMPONENT_ACCESS_TOKEN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWITTERTIMELINE_COMPONENT_ACCESS_TOKEN_DOC);
        conf.define(CAMEL_SINK_TWITTERTIMELINE_COMPONENT_ACCESS_TOKEN_SECRET_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_TWITTERTIMELINE_COMPONENT_ACCESS_TOKEN_SECRET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWITTERTIMELINE_COMPONENT_ACCESS_TOKEN_SECRET_DOC);
        conf.define(CAMEL_SINK_TWITTERTIMELINE_COMPONENT_CONSUMER_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_TWITTERTIMELINE_COMPONENT_CONSUMER_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWITTERTIMELINE_COMPONENT_CONSUMER_KEY_DOC);
        conf.define(CAMEL_SINK_TWITTERTIMELINE_COMPONENT_CONSUMER_SECRET_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_TWITTERTIMELINE_COMPONENT_CONSUMER_SECRET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TWITTERTIMELINE_COMPONENT_CONSUMER_SECRET_DOC);
        return conf;
    }
}