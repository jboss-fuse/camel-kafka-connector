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
package org.apache.camel.kafkaconnector.cxfrs;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelCxfrsSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_CXFRS_PATH_BEAN_ID_CONF = "camel.source.path.beanId";
    public static final String CAMEL_SOURCE_CXFRS_PATH_BEAN_ID_DOC = "To lookup an existing configured CxfRsEndpoint. Must used bean: as prefix.";
    public static final String CAMEL_SOURCE_CXFRS_PATH_BEAN_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_CXFRS_PATH_ADDRESS_CONF = "camel.source.path.address";
    public static final String CAMEL_SOURCE_CXFRS_PATH_ADDRESS_DOC = "The service publish address.";
    public static final String CAMEL_SOURCE_CXFRS_PATH_ADDRESS_DEFAULT = null;
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_FEATURES_CONF = "camel.source.endpoint.features";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_FEATURES_DOC = "Set the feature list to the CxfRs endpoint.";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_FEATURES_DEFAULT = null;
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_LOGGING_FEATURE_ENABLED_CONF = "camel.source.endpoint.loggingFeatureEnabled";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_LOGGING_FEATURE_ENABLED_DOC = "This option enables CXF Logging Feature which writes inbound and outbound REST messages to log.";
    public static final Boolean CAMEL_SOURCE_CXFRS_ENDPOINT_LOGGING_FEATURE_ENABLED_DEFAULT = false;
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_LOGGING_SIZE_LIMIT_CONF = "camel.source.endpoint.loggingSizeLimit";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_LOGGING_SIZE_LIMIT_DOC = "To limit the total size of number of bytes the logger will output when logging feature has been enabled.";
    public static final Integer CAMEL_SOURCE_CXFRS_ENDPOINT_LOGGING_SIZE_LIMIT_DEFAULT = null;
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_MODEL_REF_CONF = "camel.source.endpoint.modelRef";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_MODEL_REF_DOC = "This option is used to specify the model file which is useful for the resource class without annotation. When using this option, then the service class can be omitted, to emulate document-only endpoints";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_MODEL_REF_DEFAULT = null;
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_PROVIDERS_CONF = "camel.source.endpoint.providers";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_PROVIDERS_DOC = "Set custom JAX-RS provider(s) list to the CxfRs endpoint. You can specify a string with a list of providers to lookup in the registy separated by comma.";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_PROVIDERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_RESOURCE_CLASSES_CONF = "camel.source.endpoint.resourceClasses";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_RESOURCE_CLASSES_DOC = "The resource classes which you want to export as REST service. Multiple classes can be separated by comma.";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_RESOURCE_CLASSES_DEFAULT = null;
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_SCHEMA_LOCATIONS_CONF = "camel.source.endpoint.schemaLocations";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_SCHEMA_LOCATIONS_DOC = "Sets the locations of the schema(s) which can be used to validate the incoming XML or JAXB-driven JSON.";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_SCHEMA_LOCATIONS_DEFAULT = null;
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_SKIP_FAULT_LOGGING_CONF = "camel.source.endpoint.skipFaultLogging";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_SKIP_FAULT_LOGGING_DOC = "This option controls whether the PhaseInterceptorChain skips logging the Fault that it catches.";
    public static final Boolean CAMEL_SOURCE_CXFRS_ENDPOINT_SKIP_FAULT_LOGGING_DEFAULT = false;
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_BINDING_STYLE_CONF = "camel.source.endpoint.bindingStyle";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_BINDING_STYLE_DOC = "Sets how requests and responses will be mapped to/from Camel. Two values are possible: SimpleConsumer: This binding style processes request parameters, multiparts, etc. and maps them to IN headers, IN attachments and to the message body. It aims to eliminate low-level processing of org.apache.cxf.message.MessageContentsList. It also also adds more flexibility and simplicity to the response mapping. Only available for consumers. Default: The default style. For consumers this passes on a MessageContentsList to the route, requiring low-level processing in the route. This is the traditional binding style, which simply dumps the org.apache.cxf.message.MessageContentsList coming in from the CXF stack onto the IN message body. The user is then responsible for processing it according to the contract defined by the JAX-RS method signature. Custom: allows you to specify a custom binding through the binding option. One of: [SimpleConsumer] [Default] [Custom]";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_BINDING_STYLE_DEFAULT = "Default";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_CXFRS_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_PUBLISHED_ENDPOINT_URL_CONF = "camel.source.endpoint.publishedEndpointUrl";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_PUBLISHED_ENDPOINT_URL_DOC = "This option can override the endpointUrl that published from the WADL which can be accessed with resource address url plus _wadl";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_PUBLISHED_ENDPOINT_URL_DEFAULT = null;
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_SERVICE_BEANS_CONF = "camel.source.endpoint.serviceBeans";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_SERVICE_BEANS_DOC = "The service beans (the bean ids to lookup in the registry) which you want to export as REST service. Multiple beans can be separated by comma";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_SERVICE_BEANS_DEFAULT = null;
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_CXFRS_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_BINDING_CONF = "camel.source.endpoint.binding";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_BINDING_DOC = "To use a custom CxfBinding to control the binding between Camel Message and CXF Message.";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_BINDING_DEFAULT = null;
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_BUS_CONF = "camel.source.endpoint.bus";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_BUS_DOC = "To use a custom configured CXF Bus.";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_BUS_DEFAULT = null;
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_CONTINUATION_TIMEOUT_CONF = "camel.source.endpoint.continuationTimeout";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_CONTINUATION_TIMEOUT_DOC = "This option is used to set the CXF continuation timeout which could be used in CxfConsumer by default when the CXF server is using Jetty or Servlet transport.";
    public static final Long CAMEL_SOURCE_CXFRS_ENDPOINT_CONTINUATION_TIMEOUT_DEFAULT = 30000L;
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_CXF_RS_CONFIGURER_CONF = "camel.source.endpoint.cxfRsConfigurer";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_CXF_RS_CONFIGURER_DOC = "This option could apply the implementation of org.apache.camel.component.cxf.jaxrs.CxfRsEndpointConfigurer which supports to configure the CXF endpoint in programmatic way. User can configure the CXF server and client by implementing configure{Server/Client} method of CxfEndpointConfigurer.";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_CXF_RS_CONFIGURER_DEFAULT = null;
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_DEFAULT_BUS_CONF = "camel.source.endpoint.defaultBus";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_DEFAULT_BUS_DOC = "Will set the default bus when CXF endpoint create a bus by itself";
    public static final Boolean CAMEL_SOURCE_CXFRS_ENDPOINT_DEFAULT_BUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_HEADER_FILTER_STRATEGY_CONF = "camel.source.endpoint.headerFilterStrategy";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_HEADER_FILTER_STRATEGY_DOC = "To use a custom HeaderFilterStrategy to filter header to and from Camel message.";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_PERFORM_INVOCATION_CONF = "camel.source.endpoint.performInvocation";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_PERFORM_INVOCATION_DOC = "When the option is true, Camel will perform the invocation of the resource class instance and put the response object into the exchange for further processing.";
    public static final Boolean CAMEL_SOURCE_CXFRS_ENDPOINT_PERFORM_INVOCATION_DEFAULT = false;
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_PROPAGATE_CONTEXTS_CONF = "camel.source.endpoint.propagateContexts";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_PROPAGATE_CONTEXTS_DOC = "When the option is true, JAXRS UriInfo, HttpHeaders, Request and SecurityContext contexts will be available to custom CXFRS processors as typed Camel exchange properties. These contexts can be used to analyze the current requests using JAX-RS API.";
    public static final Boolean CAMEL_SOURCE_CXFRS_ENDPOINT_PROPAGATE_CONTEXTS_DEFAULT = false;
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_CXFRS_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_CXFRS_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_CXFRS_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.cxfrs.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_CXFRS_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_CXFRS_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_CXFRS_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.cxfrs.basicPropertyBinding";
    public static final String CAMEL_SOURCE_CXFRS_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_CXFRS_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_CXFRS_COMPONENT_HEADER_FILTER_STRATEGY_CONF = "camel.component.cxfrs.headerFilterStrategy";
    public static final String CAMEL_SOURCE_CXFRS_COMPONENT_HEADER_FILTER_STRATEGY_DOC = "To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter header to and from Camel message.";
    public static final String CAMEL_SOURCE_CXFRS_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_CXFRS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.cxfrs.useGlobalSslContextParameters";
    public static final String CAMEL_SOURCE_CXFRS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC = "Enable usage of global SSL context parameters.";
    public static final Boolean CAMEL_SOURCE_CXFRS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT = false;

    public CamelCxfrsSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelCxfrsSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_CXFRS_PATH_BEAN_ID_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CXFRS_PATH_BEAN_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_PATH_BEAN_ID_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_PATH_ADDRESS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CXFRS_PATH_ADDRESS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_PATH_ADDRESS_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_ENDPOINT_FEATURES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CXFRS_ENDPOINT_FEATURES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_ENDPOINT_FEATURES_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_ENDPOINT_LOGGING_FEATURE_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_CXFRS_ENDPOINT_LOGGING_FEATURE_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_ENDPOINT_LOGGING_FEATURE_ENABLED_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_ENDPOINT_LOGGING_SIZE_LIMIT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_CXFRS_ENDPOINT_LOGGING_SIZE_LIMIT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_ENDPOINT_LOGGING_SIZE_LIMIT_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_ENDPOINT_MODEL_REF_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CXFRS_ENDPOINT_MODEL_REF_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_ENDPOINT_MODEL_REF_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_ENDPOINT_PROVIDERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CXFRS_ENDPOINT_PROVIDERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_ENDPOINT_PROVIDERS_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_ENDPOINT_RESOURCE_CLASSES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CXFRS_ENDPOINT_RESOURCE_CLASSES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_ENDPOINT_RESOURCE_CLASSES_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_ENDPOINT_SCHEMA_LOCATIONS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CXFRS_ENDPOINT_SCHEMA_LOCATIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_ENDPOINT_SCHEMA_LOCATIONS_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_ENDPOINT_SKIP_FAULT_LOGGING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_CXFRS_ENDPOINT_SKIP_FAULT_LOGGING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_ENDPOINT_SKIP_FAULT_LOGGING_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_ENDPOINT_BINDING_STYLE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CXFRS_ENDPOINT_BINDING_STYLE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_ENDPOINT_BINDING_STYLE_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_CXFRS_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_ENDPOINT_PUBLISHED_ENDPOINT_URL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CXFRS_ENDPOINT_PUBLISHED_ENDPOINT_URL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_ENDPOINT_PUBLISHED_ENDPOINT_URL_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CXFRS_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CXFRS_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_ENDPOINT_SERVICE_BEANS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CXFRS_ENDPOINT_SERVICE_BEANS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_ENDPOINT_SERVICE_BEANS_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_CXFRS_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_ENDPOINT_BINDING_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CXFRS_ENDPOINT_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_ENDPOINT_BINDING_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_ENDPOINT_BUS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CXFRS_ENDPOINT_BUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_ENDPOINT_BUS_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_ENDPOINT_CONTINUATION_TIMEOUT_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_CXFRS_ENDPOINT_CONTINUATION_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_ENDPOINT_CONTINUATION_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_ENDPOINT_CXF_RS_CONFIGURER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CXFRS_ENDPOINT_CXF_RS_CONFIGURER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_ENDPOINT_CXF_RS_CONFIGURER_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_ENDPOINT_DEFAULT_BUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_CXFRS_ENDPOINT_DEFAULT_BUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_ENDPOINT_DEFAULT_BUS_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_ENDPOINT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CXFRS_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_ENDPOINT_HEADER_FILTER_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_ENDPOINT_PERFORM_INVOCATION_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_CXFRS_ENDPOINT_PERFORM_INVOCATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_ENDPOINT_PERFORM_INVOCATION_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_ENDPOINT_PROPAGATE_CONTEXTS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_CXFRS_ENDPOINT_PROPAGATE_CONTEXTS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_ENDPOINT_PROPAGATE_CONTEXTS_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_CXFRS_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_CXFRS_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_CXFRS_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_COMPONENT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CXFRS_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_COMPONENT_HEADER_FILTER_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_CXFRS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_CXFRS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CXFRS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC);
        return conf;
    }
}