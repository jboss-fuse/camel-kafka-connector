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
package org.apache.camel.kafkaconnector.elytron;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelElytronSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_ELYTRON_PATH_HTTP_URICONF = "camel.source.path.httpURI";
    public static final String CAMEL_SOURCE_ELYTRON_PATH_HTTP_URIDOC = "The url of the HTTP endpoint to use.";
    public static final String CAMEL_SOURCE_ELYTRON_PATH_HTTP_URIDEFAULT = null;
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_ALLOWED_ROLES_CONF = "camel.source.endpoint.allowedRoles";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_ALLOWED_ROLES_DOC = "Comma separated list of allowed roles.";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_ALLOWED_ROLES_DEFAULT = null;
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_USE_STREAMING_CONF = "camel.source.endpoint.useStreaming";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_USE_STREAMING_DOC = "For HTTP endpoint: if true, text and binary messages will be wrapped as java.io.InputStream before they are passed to an Exchange; otherwise they will be passed as byte. For WebSocket endpoint: if true, text and binary messages will be wrapped as java.io.Reader and java.io.InputStream respectively before they are passed to an Exchange; otherwise they will be passed as String and byte respectively.";
    public static final Boolean CAMEL_SOURCE_ELYTRON_ENDPOINT_USE_STREAMING_DEFAULT = false;
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_ACCESS_LOG_CONF = "camel.source.endpoint.accessLog";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_ACCESS_LOG_DOC = "Whether or not the consumer should write access log";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_ACCESS_LOG_DEFAULT = "false";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_ELYTRON_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_HTTP_METHOD_RESTRICT_CONF = "camel.source.endpoint.httpMethodRestrict";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_HTTP_METHOD_RESTRICT_DOC = "Used to only allow consuming if the HttpMethod matches, such as GET/POST/PUT etc. Multiple methods can be specified separated by comma.";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_HTTP_METHOD_RESTRICT_DEFAULT = null;
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_MATCH_ON_URI_PREFIX_CONF = "camel.source.endpoint.matchOnUriPrefix";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_MATCH_ON_URI_PREFIX_DOC = "Whether or not the consumer should try to find a target consumer by matching the URI prefix if no exact match is found.";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_MATCH_ON_URI_PREFIX_DEFAULT = "false";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_MUTE_EXCEPTION_CONF = "camel.source.endpoint.muteException";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_MUTE_EXCEPTION_DOC = "If enabled and an Exchange failed processing on the consumer side the response's body won't contain the exception's stack trace.";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_MUTE_EXCEPTION_DEFAULT = "false";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_OPTIONS_ENABLED_CONF = "camel.source.endpoint.optionsEnabled";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_OPTIONS_ENABLED_DOC = "Specifies whether to enable HTTP OPTIONS for this Servlet consumer. By default OPTIONS is turned off.";
    public static final Boolean CAMEL_SOURCE_ELYTRON_ENDPOINT_OPTIONS_ENABLED_DEFAULT = false;
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_HANDLERS_CONF = "camel.source.endpoint.handlers";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_HANDLERS_DOC = "Specifies a comma-delimited set of io.undertow.server.HttpHandler instances to lookup in your Registry. These handlers are added to the Undertow handler chain (for example, to add security). Important: You can not use different handlers with different Undertow endpoints using the same port number. The handlers is associated to the port number. If you need different handlers, then use different port numbers.";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_HANDLERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_ACCESS_LOG_RECEIVER_CONF = "camel.source.endpoint.accessLogReceiver";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_ACCESS_LOG_RECEIVER_DOC = "Which Undertow AccessLogReciever should be used Will use JBossLoggingAccessLogReceiver if not specifid";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_ACCESS_LOG_RECEIVER_DEFAULT = null;
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_ELYTRON_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_HEADER_FILTER_STRATEGY_CONF = "camel.source.endpoint.headerFilterStrategy";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_HEADER_FILTER_STRATEGY_DOC = "To use a custom HeaderFilterStrategy to filter header to and from Camel message.";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_ELYTRON_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_UNDERTOW_HTTP_BINDING_CONF = "camel.source.endpoint.undertowHttpBinding";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_UNDERTOW_HTTP_BINDING_DOC = "To use a custom UndertowHttpBinding to control the mapping between Camel message and undertow.";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_UNDERTOW_HTTP_BINDING_DEFAULT = null;
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_FIRE_WEB_SOCKET_CHANNEL_EVENTS_CONF = "camel.source.endpoint.fireWebSocketChannelEvents";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_FIRE_WEB_SOCKET_CHANNEL_EVENTS_DOC = "if true, the consumer will post notifications to the route when a new WebSocket peer connects, disconnects, etc. See UndertowConstants.EVENT_TYPE and EventType.";
    public static final Boolean CAMEL_SOURCE_ELYTRON_ENDPOINT_FIRE_WEB_SOCKET_CHANNEL_EVENTS_DEFAULT = false;
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF = "camel.source.endpoint.sslContextParameters";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC = "To configure security using SSLContextParameters";
    public static final String CAMEL_SOURCE_ELYTRON_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.elytron.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_ELYTRON_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_MUTE_EXCEPTION_CONF = "camel.component.elytron.muteException";
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_MUTE_EXCEPTION_DOC = "If enabled and an Exchange failed processing on the consumer side the response's body won't contain the exception's stack trace.";
    public static final Boolean CAMEL_SOURCE_ELYTRON_COMPONENT_MUTE_EXCEPTION_DEFAULT = false;
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.elytron.basicPropertyBinding";
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_ELYTRON_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_ELYTRON_PROVIDER_CONF = "camel.component.elytron.elytronProvider";
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_ELYTRON_PROVIDER_DOC = "Elytron security provider, has to support mechanism from parameter mechanismName.";
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_ELYTRON_PROVIDER_DEFAULT = "instance of WildFlyElytronHttpBearerProvider";
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_HOST_OPTIONS_CONF = "camel.component.elytron.hostOptions";
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_HOST_OPTIONS_DOC = "To configure common options, such as thread pools";
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_HOST_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_MECHANISM_NAME_CONF = "camel.component.elytron.mechanismName";
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_MECHANISM_NAME_DOC = "Name of the mechanism, which will be used for selection of authentication mechanism.";
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_MECHANISM_NAME_DEFAULT = "BEARER_TOKEN";
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_SECURITY_DOMAIN_BUILDER_CONF = "camel.component.elytron.securityDomainBuilder";
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_SECURITY_DOMAIN_BUILDER_DOC = "Definition of Builder, which will be used for creation of security domain.";
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_SECURITY_DOMAIN_BUILDER_DEFAULT = null;
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_UNDERTOW_HTTP_BINDING_CONF = "camel.component.elytron.undertowHttpBinding";
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_UNDERTOW_HTTP_BINDING_DOC = "To use a custom HttpBinding to control the mapping between Camel message and HttpClient.";
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_UNDERTOW_HTTP_BINDING_DEFAULT = null;
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.elytron.sslContextParameters";
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC = "To configure security using SSLContextParameters";
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.elytron.useGlobalSslContextParameters";
    public static final String CAMEL_SOURCE_ELYTRON_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC = "Enable usage of global SSL context parameters.";
    public static final Boolean CAMEL_SOURCE_ELYTRON_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT = false;

    public CamelElytronSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelElytronSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_ELYTRON_PATH_HTTP_URICONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ELYTRON_PATH_HTTP_URIDEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_ELYTRON_PATH_HTTP_URIDOC);
        conf.define(CAMEL_SOURCE_ELYTRON_ENDPOINT_ALLOWED_ROLES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ELYTRON_ENDPOINT_ALLOWED_ROLES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_ENDPOINT_ALLOWED_ROLES_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_ENDPOINT_USE_STREAMING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ELYTRON_ENDPOINT_USE_STREAMING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_ENDPOINT_USE_STREAMING_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_ENDPOINT_ACCESS_LOG_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ELYTRON_ENDPOINT_ACCESS_LOG_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_ENDPOINT_ACCESS_LOG_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ELYTRON_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_ENDPOINT_HTTP_METHOD_RESTRICT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ELYTRON_ENDPOINT_HTTP_METHOD_RESTRICT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_ENDPOINT_HTTP_METHOD_RESTRICT_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_ENDPOINT_MATCH_ON_URI_PREFIX_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ELYTRON_ENDPOINT_MATCH_ON_URI_PREFIX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_ENDPOINT_MATCH_ON_URI_PREFIX_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_ENDPOINT_MUTE_EXCEPTION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ELYTRON_ENDPOINT_MUTE_EXCEPTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_ENDPOINT_MUTE_EXCEPTION_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_ENDPOINT_OPTIONS_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ELYTRON_ENDPOINT_OPTIONS_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_ENDPOINT_OPTIONS_ENABLED_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ELYTRON_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ELYTRON_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_ENDPOINT_HANDLERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ELYTRON_ENDPOINT_HANDLERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_ENDPOINT_HANDLERS_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_ENDPOINT_ACCESS_LOG_RECEIVER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ELYTRON_ENDPOINT_ACCESS_LOG_RECEIVER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_ENDPOINT_ACCESS_LOG_RECEIVER_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ELYTRON_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_ENDPOINT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ELYTRON_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_ENDPOINT_HEADER_FILTER_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ELYTRON_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_ENDPOINT_UNDERTOW_HTTP_BINDING_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ELYTRON_ENDPOINT_UNDERTOW_HTTP_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_ENDPOINT_UNDERTOW_HTTP_BINDING_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_ENDPOINT_FIRE_WEB_SOCKET_CHANNEL_EVENTS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ELYTRON_ENDPOINT_FIRE_WEB_SOCKET_CHANNEL_EVENTS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_ENDPOINT_FIRE_WEB_SOCKET_CHANNEL_EVENTS_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ELYTRON_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ELYTRON_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_COMPONENT_MUTE_EXCEPTION_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ELYTRON_COMPONENT_MUTE_EXCEPTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_COMPONENT_MUTE_EXCEPTION_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ELYTRON_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_COMPONENT_ELYTRON_PROVIDER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ELYTRON_COMPONENT_ELYTRON_PROVIDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_COMPONENT_ELYTRON_PROVIDER_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_COMPONENT_HOST_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ELYTRON_COMPONENT_HOST_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_COMPONENT_HOST_OPTIONS_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_COMPONENT_MECHANISM_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ELYTRON_COMPONENT_MECHANISM_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_COMPONENT_MECHANISM_NAME_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_COMPONENT_SECURITY_DOMAIN_BUILDER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ELYTRON_COMPONENT_SECURITY_DOMAIN_BUILDER_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_ELYTRON_COMPONENT_SECURITY_DOMAIN_BUILDER_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_COMPONENT_UNDERTOW_HTTP_BINDING_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ELYTRON_COMPONENT_UNDERTOW_HTTP_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_COMPONENT_UNDERTOW_HTTP_BINDING_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ELYTRON_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_ELYTRON_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ELYTRON_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELYTRON_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC);
        return conf;
    }
}