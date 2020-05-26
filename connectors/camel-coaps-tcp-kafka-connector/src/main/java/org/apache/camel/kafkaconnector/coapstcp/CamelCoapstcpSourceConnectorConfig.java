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
package org.apache.camel.kafkaconnector.coapstcp;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelCoapstcpSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_COAPSTCP_PATH_URI_CONF = "camel.source.path.uri";
    public static final String CAMEL_SOURCE_COAPSTCP_PATH_URI_DOC = "The URI for the CoAP endpoint";
    public static final String CAMEL_SOURCE_COAPSTCP_PATH_URI_DEFAULT = null;
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_ALIAS_CONF = "camel.source.endpoint.alias";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_ALIAS_DOC = "Sets the alias used to query the KeyStore for the private key and certificate. This parameter is used when we are enabling TLS with certificates on the service side, and similarly on the client side when TLS is used with certificates and client authentication. If the parameter is not specified then the default behavior is to use the first alias in the keystore that contains a key entry. This configuration parameter does not apply to configuring TLS via a Raw Public Key or a Pre-Shared Key.";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_ALIAS_DEFAULT = null;
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_CIPHER_SUITES_CONF = "camel.source.endpoint.cipherSuites";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_CIPHER_SUITES_DOC = "Sets the cipherSuites String. This is a comma separated String of ciphersuites to configure. If it is not specified, then it falls back to getting the ciphersuites from the sslContextParameters object.";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_CIPHER_SUITES_DEFAULT = null;
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_CLIENT_AUTHENTICATION_CONF = "camel.source.endpoint.clientAuthentication";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_CLIENT_AUTHENTICATION_DOC = "Sets the configuration options for server-side client-authentication requirements. The value must be one of NONE, WANT, REQUIRE. If this value is not specified, then it falls back to checking the sslContextParameters.getServerParameters().getClientAuthentication() value.";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_CLIENT_AUTHENTICATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_PRIVATE_KEY_CONF = "camel.source.endpoint.privateKey";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_PRIVATE_KEY_DOC = "Set the configured private key for use with Raw Public Key.";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_PRIVATE_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_PSK_STORE_CONF = "camel.source.endpoint.pskStore";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_PSK_STORE_DOC = "Set the PskStore to use for pre-shared key.";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_PSK_STORE_DEFAULT = null;
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_PUBLIC_KEY_CONF = "camel.source.endpoint.publicKey";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_PUBLIC_KEY_DOC = "Set the configured public key for use with Raw Public Key.";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_PUBLIC_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_RECOMMENDED_CIPHER_SUITES_ONLY_CONF = "camel.source.endpoint.recommendedCipherSuitesOnly";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_RECOMMENDED_CIPHER_SUITES_ONLY_DOC = "The CBC cipher suites are not recommended. If you want to use them, you first need to set the recommendedCipherSuitesOnly option to false.";
    public static final Boolean CAMEL_SOURCE_COAPSTCP_ENDPOINT_RECOMMENDED_CIPHER_SUITES_ONLY_DEFAULT = true;
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF = "camel.source.endpoint.sslContextParameters";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC = "Set the SSLContextParameters object for setting up TLS. This is required for coapstcp, and for coaps when we are using certificates for TLS (as opposed to RPK or PKS).";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_TRUSTED_RPK_STORE_CONF = "camel.source.endpoint.trustedRpkStore";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_TRUSTED_RPK_STORE_DOC = "Set the TrustedRpkStore to use to determine trust in raw public keys.";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_TRUSTED_RPK_STORE_DEFAULT = null;
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_COAPSTCP_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_COAP_METHOD_RESTRICT_CONF = "camel.source.endpoint.coapMethodRestrict";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_COAP_METHOD_RESTRICT_DOC = "Comma separated list of methods that the CoAP consumer will bind to. The default is to bind to all methods (DELETE, GET, POST, PUT).";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_COAP_METHOD_RESTRICT_DEFAULT = null;
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_COAPSTCP_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_COAPSTCP_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_COAPSTCP_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_COAPSTCP_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.coaps-tcp.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_COAPSTCP_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_COAPSTCP_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_COAPSTCP_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.coaps-tcp.basicPropertyBinding";
    public static final String CAMEL_SOURCE_COAPSTCP_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_COAPSTCP_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelCoapstcpSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelCoapstcpSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_COAPSTCP_PATH_URI_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_COAPSTCP_PATH_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COAPSTCP_PATH_URI_DOC);
        conf.define(CAMEL_SOURCE_COAPSTCP_ENDPOINT_ALIAS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_COAPSTCP_ENDPOINT_ALIAS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COAPSTCP_ENDPOINT_ALIAS_DOC);
        conf.define(CAMEL_SOURCE_COAPSTCP_ENDPOINT_CIPHER_SUITES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_COAPSTCP_ENDPOINT_CIPHER_SUITES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COAPSTCP_ENDPOINT_CIPHER_SUITES_DOC);
        conf.define(CAMEL_SOURCE_COAPSTCP_ENDPOINT_CLIENT_AUTHENTICATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_COAPSTCP_ENDPOINT_CLIENT_AUTHENTICATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COAPSTCP_ENDPOINT_CLIENT_AUTHENTICATION_DOC);
        conf.define(CAMEL_SOURCE_COAPSTCP_ENDPOINT_PRIVATE_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_COAPSTCP_ENDPOINT_PRIVATE_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COAPSTCP_ENDPOINT_PRIVATE_KEY_DOC);
        conf.define(CAMEL_SOURCE_COAPSTCP_ENDPOINT_PSK_STORE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_COAPSTCP_ENDPOINT_PSK_STORE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COAPSTCP_ENDPOINT_PSK_STORE_DOC);
        conf.define(CAMEL_SOURCE_COAPSTCP_ENDPOINT_PUBLIC_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_COAPSTCP_ENDPOINT_PUBLIC_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COAPSTCP_ENDPOINT_PUBLIC_KEY_DOC);
        conf.define(CAMEL_SOURCE_COAPSTCP_ENDPOINT_RECOMMENDED_CIPHER_SUITES_ONLY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_COAPSTCP_ENDPOINT_RECOMMENDED_CIPHER_SUITES_ONLY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COAPSTCP_ENDPOINT_RECOMMENDED_CIPHER_SUITES_ONLY_DOC);
        conf.define(CAMEL_SOURCE_COAPSTCP_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_COAPSTCP_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COAPSTCP_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_COAPSTCP_ENDPOINT_TRUSTED_RPK_STORE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_COAPSTCP_ENDPOINT_TRUSTED_RPK_STORE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COAPSTCP_ENDPOINT_TRUSTED_RPK_STORE_DOC);
        conf.define(CAMEL_SOURCE_COAPSTCP_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_COAPSTCP_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COAPSTCP_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_COAPSTCP_ENDPOINT_COAP_METHOD_RESTRICT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_COAPSTCP_ENDPOINT_COAP_METHOD_RESTRICT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COAPSTCP_ENDPOINT_COAP_METHOD_RESTRICT_DOC);
        conf.define(CAMEL_SOURCE_COAPSTCP_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_COAPSTCP_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COAPSTCP_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_COAPSTCP_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_COAPSTCP_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COAPSTCP_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_COAPSTCP_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_COAPSTCP_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COAPSTCP_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_COAPSTCP_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_COAPSTCP_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COAPSTCP_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_COAPSTCP_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_COAPSTCP_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COAPSTCP_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_COAPSTCP_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_COAPSTCP_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_COAPSTCP_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}