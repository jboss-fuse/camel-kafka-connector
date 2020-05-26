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
package org.apache.camel.kafkaconnector.xmlsecuritysign;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelXmlsecuritysignSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_XMLSECURITYSIGN_PATH_NAME_CONF = "camel.sink.path.name";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_PATH_NAME_DOC = "The name part in the URI can be chosen by the user to distinguish between different signer endpoints within the camel context.";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_PATH_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_ADD_KEY_INFO_REFERENCE_CONF = "camel.sink.endpoint.addKeyInfoReference";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_ADD_KEY_INFO_REFERENCE_DOC = "In order to protect the KeyInfo element from tampering you can add a reference to the signed info element so that it is protected via the signature value. The default value is true. Only relevant when a KeyInfo is returned by KeyAccessor. and KeyInfo#getId() is not null.";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_ADD_KEY_INFO_REFERENCE_DEFAULT = "true";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_BASE_URI_CONF = "camel.sink.endpoint.baseUri";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_BASE_URI_DOC = "You can set a base URI which is used in the URI dereferencing. Relative URIs are then concatenated with the base URI.";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_BASE_URI_DEFAULT = null;
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CANONICALIZATION_METHOD_CONF = "camel.sink.endpoint.canonicalizationMethod";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CANONICALIZATION_METHOD_DOC = "Canonicalization method used to canonicalize the SignedInfo element before the digest is calculated. You can use the helper methods XmlSignatureHelper.getCanonicalizationMethod(String algorithm) or getCanonicalizationMethod(String algorithm, List inclusiveNamespacePrefixes) to create a canonicalization method.";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CANONICALIZATION_METHOD_DEFAULT = "http://www.w3.org/TR/2001/REC-xml-c14n-20010315";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CLEAR_HEADERS_CONF = "camel.sink.endpoint.clearHeaders";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CLEAR_HEADERS_DOC = "Determines if the XML signature specific headers be cleared after signing and verification. Defaults to true.";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CLEAR_HEADERS_DEFAULT = "true";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CONTENT_OBJECT_ID_CONF = "camel.sink.endpoint.contentObjectId";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CONTENT_OBJECT_ID_DOC = "Sets the content object Id attribute value. By default a UUID is generated. If you set the null value, then a new UUID will be generated. Only used in the enveloping case.";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CONTENT_OBJECT_ID_DEFAULT = null;
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CONTENT_REFERENCE_TYPE_CONF = "camel.sink.endpoint.contentReferenceType";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CONTENT_REFERENCE_TYPE_DOC = "Type of the content reference. The default value is null. This value can be overwritten by the header XmlSignatureConstants#HEADER_CONTENT_REFERENCE_TYPE.";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CONTENT_REFERENCE_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CONTENT_REFERENCE_URI_CONF = "camel.sink.endpoint.contentReferenceUri";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CONTENT_REFERENCE_URI_DOC = "Reference URI for the content to be signed. Only used in the enveloped case. If the reference URI contains an ID attribute value, then the resource schema URI ( setSchemaResourceUri(String)) must also be set because the schema validator will then find out which attributes are ID attributes. Will be ignored in the enveloping or detached case.";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CONTENT_REFERENCE_URI_DEFAULT = null;
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CRYPTO_CONTEXT_PROPERTIES_CONF = "camel.sink.endpoint.cryptoContextProperties";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CRYPTO_CONTEXT_PROPERTIES_DOC = "Sets the crypto context properties. See {link XMLCryptoContext#setProperty(String, Object)}. Possible properties are defined in XMLSignContext an XMLValidateContext (see Supported Properties). The following properties are set by default to the value Boolean#TRUE for the XML validation. If you want to switch these features off you must set the property value to Boolean#FALSE. org.jcp.xml.dsig.validateManifests javax.xml.crypto.dsig.cacheReference";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CRYPTO_CONTEXT_PROPERTIES_DEFAULT = null;
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_DIGEST_ALGORITHM_CONF = "camel.sink.endpoint.digestAlgorithm";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_DIGEST_ALGORITHM_DOC = "Digest algorithm URI. Optional parameter. This digest algorithm is used for calculating the digest of the input message. If this digest algorithm is not specified then the digest algorithm is calculated from the signature algorithm. Example: http://www.w3.org/2001/04/xmlenc#sha256";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_DIGEST_ALGORITHM_DEFAULT = null;
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_DISALLOW_DOCTYPE_DECL_CONF = "camel.sink.endpoint.disallowDoctypeDecl";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_DISALLOW_DOCTYPE_DECL_DOC = "Disallows that the incoming XML document contains DTD DOCTYPE declaration. The default value is Boolean#TRUE.";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_DISALLOW_DOCTYPE_DECL_DEFAULT = "true";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_KEY_ACCESSOR_CONF = "camel.sink.endpoint.keyAccessor";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_KEY_ACCESSOR_DOC = "For the signing process, a private key is necessary. You specify a key accessor bean which provides this private key. The key accessor bean must implement the KeyAccessor interface. The package org.apache.camel.component.xmlsecurity.api contains the default implementation class DefaultKeyAccessor which reads the private key from a Java keystore.";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_KEY_ACCESSOR_DEFAULT = null;
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_OMIT_XML_DECLARATION_CONF = "camel.sink.endpoint.omitXmlDeclaration";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_OMIT_XML_DECLARATION_DOC = "Indicator whether the XML declaration in the outgoing message body should be omitted. Default value is false. Can be overwritten by the header XmlSignatureConstants#HEADER_OMIT_XML_DECLARATION.";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_OMIT_XML_DECLARATION_DEFAULT = "false";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_OUTPUT_XML_ENCODING_CONF = "camel.sink.endpoint.outputXmlEncoding";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_OUTPUT_XML_ENCODING_DOC = "The character encoding of the resulting signed XML document. If null then the encoding of the original XML document is used.";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_OUTPUT_XML_ENCODING_DEFAULT = null;
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PARENT_LOCAL_NAME_CONF = "camel.sink.endpoint.parentLocalName";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PARENT_LOCAL_NAME_DOC = "Local name of the parent element to which the XML signature element will be added. Only relevant for enveloped XML signature. Alternatively you can also use setParentXpath(XPathFilterParameterSpec). Default value is null. The value must be null for enveloping and detached XML signature. This parameter or the parameter setParentXpath(XPathFilterParameterSpec) for enveloped signature and the parameter setXpathsToIdAttributes(List) for detached signature must not be set in the same configuration. If the parameters parentXpath and parentLocalName are specified in the same configuration then an exception is thrown.";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PARENT_LOCAL_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PARENT_NAMESPACE_CONF = "camel.sink.endpoint.parentNamespace";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PARENT_NAMESPACE_DOC = "Namespace of the parent element to which the XML signature element will be added.";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PARENT_NAMESPACE_DEFAULT = null;
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PARENT_XPATH_CONF = "camel.sink.endpoint.parentXpath";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PARENT_XPATH_DOC = "Sets the XPath to find the parent node in the enveloped case. Either you specify the parent node via this method or the local name and namespace of the parent with the methods setParentLocalName(String) and setParentNamespace(String). Default value is null. The value must be null for enveloping and detached XML signature. If the parameters parentXpath and parentLocalName are specified in the same configuration then an exception is thrown.";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PARENT_XPATH_DEFAULT = null;
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PLAIN_TEXT_CONF = "camel.sink.endpoint.plainText";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PLAIN_TEXT_DOC = "Indicator whether the message body contains plain text. The default value is false, indicating that the message body contains XML. The value can be overwritten by the header XmlSignatureConstants#HEADER_MESSAGE_IS_PLAIN_TEXT.";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PLAIN_TEXT_DEFAULT = "false";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PLAIN_TEXT_ENCODING_CONF = "camel.sink.endpoint.plainTextEncoding";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PLAIN_TEXT_ENCODING_DOC = "Encoding of the plain text. Only relevant if the message body is plain text (see parameter plainText. Default value is UTF-8.";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PLAIN_TEXT_ENCODING_DEFAULT = "UTF-8";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PREFIX_FOR_XML_SIGNATURE_NAMESPACE_CONF = "camel.sink.endpoint.prefixForXmlSignatureNamespace";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PREFIX_FOR_XML_SIGNATURE_NAMESPACE_DOC = "Namespace prefix for the XML signature namespace http://www.w3.org/2000/09/xmldsig#. Default value is ds. If null or an empty value is set then no prefix is used for the XML signature namespace. See best practice http://www.w3.org/TR/xmldsig-bestpractices/#signing-xml- without-namespaces";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PREFIX_FOR_XML_SIGNATURE_NAMESPACE_DEFAULT = "ds";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PROPERTIES_CONF = "camel.sink.endpoint.properties";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PROPERTIES_DOC = "For adding additional References and Objects to the XML signature which contain additional properties, you can provide a bean which implements the XmlSignatureProperties interface.";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PROPERTIES_DEFAULT = null;
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_SCHEMA_RESOURCE_URI_CONF = "camel.sink.endpoint.schemaResourceUri";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_SCHEMA_RESOURCE_URI_DOC = "Classpath to the XML Schema. Must be specified in the detached XML Signature case for determining the ID attributes, might be set in the enveloped and enveloping case. If set, then the XML document is validated with the specified XML schema. The schema resource URI can be overwritten by the header XmlSignatureConstants#HEADER_SCHEMA_RESOURCE_URI.";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_SCHEMA_RESOURCE_URI_DEFAULT = null;
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_SIGNATURE_ALGORITHM_CONF = "camel.sink.endpoint.signatureAlgorithm";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_SIGNATURE_ALGORITHM_DOC = "Signature algorithm. Default value is http://www.w3.org/2000/09/xmldsig#rsa-sha1.";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_SIGNATURE_ALGORITHM_DEFAULT = "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_SIGNATURE_ID_CONF = "camel.sink.endpoint.signatureId";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_SIGNATURE_ID_DOC = "Sets the signature Id. If this parameter is not set (null value) then a unique ID is generated for the signature ID (default). If this parameter is set to (empty string) then no Id attribute is created in the signature element.";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_SIGNATURE_ID_DEFAULT = null;
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_TRANSFORM_METHODS_CONF = "camel.sink.endpoint.transformMethods";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_TRANSFORM_METHODS_DOC = "Transforms which are executed on the message body before the digest is calculated. By default, C14n is added and in the case of enveloped signature (see option parentLocalName) also http://www.w3.org/2000/09/xmldsig#enveloped-signature is added at position 0 of the list. Use methods in XmlSignatureHelper to create the transform methods.";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_TRANSFORM_METHODS_DEFAULT = null;
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_XPATHS_TO_ID_ATTRIBUTES_CONF = "camel.sink.endpoint.xpathsToIdAttributes";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_XPATHS_TO_ID_ATTRIBUTES_DOC = "Define the elements which are signed in the detached case via XPATH expressions to ID attributes (attributes of type ID). For each element found via the XPATH expression a detached signature is created whose reference URI contains the corresponding attribute value (preceded by '#'). The signature becomes the last sibling of the signed element. Elements with deeper hierarchy level are signed first. You can also set the XPATH list dynamically via the header XmlSignatureConstants#HEADER_XPATHS_TO_ID_ATTRIBUTES. The parameter setParentLocalName(String) or setParentXpath(XPathFilterParameterSpec) for enveloped signature and this parameter for detached signature must not be set in the same configuration.";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_XPATHS_TO_ID_ATTRIBUTES_DEFAULT = null;
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_URI_DEREFERENCER_CONF = "camel.sink.endpoint.uriDereferencer";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_URI_DEREFERENCER_DOC = "If you want to restrict the remote access via reference URIs, you can set an own dereferencer. Optional parameter. If not set the provider default dereferencer is used which can resolve URI fragments, HTTP, file and XPpointer URIs. Attention: The implementation is provider dependent!";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_URI_DEREFERENCER_DEFAULT = null;
    public static final String CAMEL_SINK_XMLSECURITYSIGN_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.xmlsecurity-sign.lazyStartProducer";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_XMLSECURITYSIGN_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_XMLSECURITYSIGN_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.xmlsecurity-sign.basicPropertyBinding";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_XMLSECURITYSIGN_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_XMLSECURITYSIGN_COMPONENT_SIGNER_CONFIGURATION_CONF = "camel.component.xmlsecurity-sign.signerConfiguration";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_COMPONENT_SIGNER_CONFIGURATION_DOC = "To use a shared XmlSignerConfiguration configuration to use as base for configuring endpoints.";
    public static final String CAMEL_SINK_XMLSECURITYSIGN_COMPONENT_SIGNER_CONFIGURATION_DEFAULT = null;

    public CamelXmlsecuritysignSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelXmlsecuritysignSinkConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_PATH_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_PATH_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_XMLSECURITYSIGN_PATH_NAME_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_ADD_KEY_INFO_REFERENCE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_ADD_KEY_INFO_REFERENCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_ADD_KEY_INFO_REFERENCE_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_BASE_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_BASE_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_BASE_URI_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CANONICALIZATION_METHOD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CANONICALIZATION_METHOD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CANONICALIZATION_METHOD_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CLEAR_HEADERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CLEAR_HEADERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CLEAR_HEADERS_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CONTENT_OBJECT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CONTENT_OBJECT_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CONTENT_OBJECT_ID_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CONTENT_REFERENCE_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CONTENT_REFERENCE_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CONTENT_REFERENCE_TYPE_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CONTENT_REFERENCE_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CONTENT_REFERENCE_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CONTENT_REFERENCE_URI_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CRYPTO_CONTEXT_PROPERTIES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CRYPTO_CONTEXT_PROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_CRYPTO_CONTEXT_PROPERTIES_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_DIGEST_ALGORITHM_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_DIGEST_ALGORITHM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_DIGEST_ALGORITHM_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_DISALLOW_DOCTYPE_DECL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_DISALLOW_DOCTYPE_DECL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_DISALLOW_DOCTYPE_DECL_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_KEY_ACCESSOR_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_KEY_ACCESSOR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_KEY_ACCESSOR_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_OMIT_XML_DECLARATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_OMIT_XML_DECLARATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_OMIT_XML_DECLARATION_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_OUTPUT_XML_ENCODING_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_OUTPUT_XML_ENCODING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_OUTPUT_XML_ENCODING_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PARENT_LOCAL_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PARENT_LOCAL_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PARENT_LOCAL_NAME_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PARENT_NAMESPACE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PARENT_NAMESPACE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PARENT_NAMESPACE_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PARENT_XPATH_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PARENT_XPATH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PARENT_XPATH_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PLAIN_TEXT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PLAIN_TEXT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PLAIN_TEXT_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PLAIN_TEXT_ENCODING_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PLAIN_TEXT_ENCODING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PLAIN_TEXT_ENCODING_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PREFIX_FOR_XML_SIGNATURE_NAMESPACE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PREFIX_FOR_XML_SIGNATURE_NAMESPACE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PREFIX_FOR_XML_SIGNATURE_NAMESPACE_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PROPERTIES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_PROPERTIES_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_SCHEMA_RESOURCE_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_SCHEMA_RESOURCE_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_SCHEMA_RESOURCE_URI_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_SIGNATURE_ALGORITHM_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_SIGNATURE_ALGORITHM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_SIGNATURE_ALGORITHM_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_SIGNATURE_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_SIGNATURE_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_SIGNATURE_ID_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_TRANSFORM_METHODS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_TRANSFORM_METHODS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_TRANSFORM_METHODS_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_XPATHS_TO_ID_ATTRIBUTES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_XPATHS_TO_ID_ATTRIBUTES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_XPATHS_TO_ID_ATTRIBUTES_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_URI_DEREFERENCER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_URI_DEREFERENCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_ENDPOINT_URI_DEREFERENCER_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XMLSECURITYSIGN_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XMLSECURITYSIGN_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_XMLSECURITYSIGN_COMPONENT_SIGNER_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XMLSECURITYSIGN_COMPONENT_SIGNER_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XMLSECURITYSIGN_COMPONENT_SIGNER_CONFIGURATION_DOC);
        return conf;
    }
}