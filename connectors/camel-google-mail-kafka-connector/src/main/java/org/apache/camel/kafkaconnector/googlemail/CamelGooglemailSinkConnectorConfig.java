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
package org.apache.camel.kafkaconnector.googlemail;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelGooglemailSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_GOOGLEMAIL_PATH_API_NAME_CONF = "camel.sink.path.apiName";
    public static final String CAMEL_SINK_GOOGLEMAIL_PATH_API_NAME_DOC = "What kind of operation to perform One of: [THREADS] [MESSAGES] [ATTACHMENTS] [LABELS] [HISTORY] [DRAFTS] [USERS]";
    public static final String CAMEL_SINK_GOOGLEMAIL_PATH_API_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEMAIL_PATH_METHOD_NAME_CONF = "camel.sink.path.methodName";
    public static final String CAMEL_SINK_GOOGLEMAIL_PATH_METHOD_NAME_DOC = "What sub operation to use for the selected operation One of: [attachments] [create] [delete] [get] [getProfile] [gmailImport] [insert] [list] [modify] [patch] [send] [trash] [untrash] [update]";
    public static final String CAMEL_SINK_GOOGLEMAIL_PATH_METHOD_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEMAIL_ENDPOINT_ACCESS_TOKEN_CONF = "camel.sink.endpoint.accessToken";
    public static final String CAMEL_SINK_GOOGLEMAIL_ENDPOINT_ACCESS_TOKEN_DOC = "OAuth 2 access token. This typically expires after an hour so refreshToken is recommended for long term usage.";
    public static final String CAMEL_SINK_GOOGLEMAIL_ENDPOINT_ACCESS_TOKEN_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEMAIL_ENDPOINT_APPLICATION_NAME_CONF = "camel.sink.endpoint.applicationName";
    public static final String CAMEL_SINK_GOOGLEMAIL_ENDPOINT_APPLICATION_NAME_DOC = "Google mail application name. Example would be camel-google-mail/1.0";
    public static final String CAMEL_SINK_GOOGLEMAIL_ENDPOINT_APPLICATION_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEMAIL_ENDPOINT_CLIENT_ID_CONF = "camel.sink.endpoint.clientId";
    public static final String CAMEL_SINK_GOOGLEMAIL_ENDPOINT_CLIENT_ID_DOC = "Client ID of the mail application";
    public static final String CAMEL_SINK_GOOGLEMAIL_ENDPOINT_CLIENT_ID_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEMAIL_ENDPOINT_CLIENT_SECRET_CONF = "camel.sink.endpoint.clientSecret";
    public static final String CAMEL_SINK_GOOGLEMAIL_ENDPOINT_CLIENT_SECRET_DOC = "Client secret of the mail application";
    public static final String CAMEL_SINK_GOOGLEMAIL_ENDPOINT_CLIENT_SECRET_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEMAIL_ENDPOINT_IN_BODY_CONF = "camel.sink.endpoint.inBody";
    public static final String CAMEL_SINK_GOOGLEMAIL_ENDPOINT_IN_BODY_DOC = "Sets the name of a parameter to be passed in the exchange In Body";
    public static final String CAMEL_SINK_GOOGLEMAIL_ENDPOINT_IN_BODY_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEMAIL_ENDPOINT_REFRESH_TOKEN_CONF = "camel.sink.endpoint.refreshToken";
    public static final String CAMEL_SINK_GOOGLEMAIL_ENDPOINT_REFRESH_TOKEN_DOC = "OAuth 2 refresh token. Using this, the Google Calendar component can obtain a new accessToken whenever the current one expires - a necessity if the application is long-lived.";
    public static final String CAMEL_SINK_GOOGLEMAIL_ENDPOINT_REFRESH_TOKEN_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEMAIL_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_GOOGLEMAIL_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_GOOGLEMAIL_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_GOOGLEMAIL_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_GOOGLEMAIL_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_GOOGLEMAIL_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_GOOGLEMAIL_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_GOOGLEMAIL_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_GOOGLEMAIL_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_GOOGLEMAIL_COMPONENT_CONFIGURATION_CONF = "camel.component.google-mail.configuration";
    public static final String CAMEL_SINK_GOOGLEMAIL_COMPONENT_CONFIGURATION_DOC = "To use the shared configuration";
    public static final String CAMEL_SINK_GOOGLEMAIL_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEMAIL_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.google-mail.lazyStartProducer";
    public static final String CAMEL_SINK_GOOGLEMAIL_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_GOOGLEMAIL_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_GOOGLEMAIL_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.google-mail.basicPropertyBinding";
    public static final String CAMEL_SINK_GOOGLEMAIL_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_GOOGLEMAIL_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_GOOGLEMAIL_COMPONENT_CLIENT_FACTORY_CONF = "camel.component.google-mail.clientFactory";
    public static final String CAMEL_SINK_GOOGLEMAIL_COMPONENT_CLIENT_FACTORY_DOC = "To use the GoogleCalendarClientFactory as factory for creating the client. Will by default use BatchGoogleMailClientFactory";
    public static final String CAMEL_SINK_GOOGLEMAIL_COMPONENT_CLIENT_FACTORY_DEFAULT = null;

    public CamelGooglemailSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelGooglemailSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_GOOGLEMAIL_PATH_API_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEMAIL_PATH_API_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_GOOGLEMAIL_PATH_API_NAME_DOC);
        conf.define(CAMEL_SINK_GOOGLEMAIL_PATH_METHOD_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEMAIL_PATH_METHOD_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_GOOGLEMAIL_PATH_METHOD_NAME_DOC);
        conf.define(CAMEL_SINK_GOOGLEMAIL_ENDPOINT_ACCESS_TOKEN_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEMAIL_ENDPOINT_ACCESS_TOKEN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEMAIL_ENDPOINT_ACCESS_TOKEN_DOC);
        conf.define(CAMEL_SINK_GOOGLEMAIL_ENDPOINT_APPLICATION_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEMAIL_ENDPOINT_APPLICATION_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEMAIL_ENDPOINT_APPLICATION_NAME_DOC);
        conf.define(CAMEL_SINK_GOOGLEMAIL_ENDPOINT_CLIENT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEMAIL_ENDPOINT_CLIENT_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEMAIL_ENDPOINT_CLIENT_ID_DOC);
        conf.define(CAMEL_SINK_GOOGLEMAIL_ENDPOINT_CLIENT_SECRET_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEMAIL_ENDPOINT_CLIENT_SECRET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEMAIL_ENDPOINT_CLIENT_SECRET_DOC);
        conf.define(CAMEL_SINK_GOOGLEMAIL_ENDPOINT_IN_BODY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEMAIL_ENDPOINT_IN_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEMAIL_ENDPOINT_IN_BODY_DOC);
        conf.define(CAMEL_SINK_GOOGLEMAIL_ENDPOINT_REFRESH_TOKEN_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEMAIL_ENDPOINT_REFRESH_TOKEN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEMAIL_ENDPOINT_REFRESH_TOKEN_DOC);
        conf.define(CAMEL_SINK_GOOGLEMAIL_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_GOOGLEMAIL_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEMAIL_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_GOOGLEMAIL_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_GOOGLEMAIL_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEMAIL_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_GOOGLEMAIL_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_GOOGLEMAIL_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEMAIL_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_GOOGLEMAIL_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEMAIL_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEMAIL_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_GOOGLEMAIL_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_GOOGLEMAIL_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEMAIL_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_GOOGLEMAIL_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_GOOGLEMAIL_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEMAIL_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_GOOGLEMAIL_COMPONENT_CLIENT_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEMAIL_COMPONENT_CLIENT_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEMAIL_COMPONENT_CLIENT_FACTORY_DOC);
        return conf;
    }
}