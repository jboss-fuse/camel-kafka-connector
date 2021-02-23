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
package org.apache.camel.kafkaconnector.cmis;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelCmisSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_CMIS_PATH_CMS_URL_CONF = "camel.source.path.cmsUrl";
    public static final String CAMEL_SOURCE_CMIS_PATH_CMS_URL_DOC = "URL to the cmis repository";
    public static final String CAMEL_SOURCE_CMIS_PATH_CMS_URL_DEFAULT = null;
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_PAGE_SIZE_CONF = "camel.source.endpoint.pageSize";
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_PAGE_SIZE_DOC = "Number of nodes to retrieve per page";
    public static final Integer CAMEL_SOURCE_CMIS_ENDPOINT_PAGE_SIZE_DEFAULT = 100;
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_READ_CONTENT_CONF = "camel.source.endpoint.readContent";
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_READ_CONTENT_DOC = "If set to true, the content of document node will be retrieved in addition to the properties";
    public static final Boolean CAMEL_SOURCE_CMIS_ENDPOINT_READ_CONTENT_DEFAULT = false;
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_READ_COUNT_CONF = "camel.source.endpoint.readCount";
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_READ_COUNT_DOC = "Max number of nodes to read";
    public static final Integer CAMEL_SOURCE_CMIS_ENDPOINT_READ_COUNT_DEFAULT = null;
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_REPOSITORY_ID_CONF = "camel.source.endpoint.repositoryId";
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_REPOSITORY_ID_DOC = "The Id of the repository to use. If not specified the first available repository is used";
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_REPOSITORY_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_CMIS_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_QUERY_CONF = "camel.source.endpoint.query";
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_QUERY_DOC = "The cmis query to execute against the repository. If not specified, the consumer will retrieve every node from the content repository by iterating the content tree recursively";
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_QUERY_DEFAULT = null;
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_SESSION_FACADE_FACTORY_CONF = "camel.source.endpoint.sessionFacadeFactory";
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_SESSION_FACADE_FACTORY_DOC = "To use a custom CMISSessionFacadeFactory to create the CMISSessionFacade instances";
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_SESSION_FACADE_FACTORY_DEFAULT = null;
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_CMIS_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_PASSWORD_CONF = "camel.source.endpoint.password";
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_PASSWORD_DOC = "Password for the cmis repository";
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_USERNAME_CONF = "camel.source.endpoint.username";
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_USERNAME_DOC = "Username for the cmis repository";
    public static final String CAMEL_SOURCE_CMIS_ENDPOINT_USERNAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_CMIS_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.cmis.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_CMIS_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_CMIS_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_CMIS_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.cmis.autowiredEnabled";
    public static final String CAMEL_SOURCE_CMIS_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SOURCE_CMIS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SOURCE_CMIS_COMPONENT_SESSION_FACADE_FACTORY_CONF = "camel.component.cmis.sessionFacadeFactory";
    public static final String CAMEL_SOURCE_CMIS_COMPONENT_SESSION_FACADE_FACTORY_DOC = "To use a custom CMISSessionFacadeFactory to create the CMISSessionFacade instances";
    public static final String CAMEL_SOURCE_CMIS_COMPONENT_SESSION_FACADE_FACTORY_DEFAULT = null;

    public CamelCmisSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelCmisSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_CMIS_PATH_CMS_URL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CMIS_PATH_CMS_URL_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_CMIS_PATH_CMS_URL_DOC);
        conf.define(CAMEL_SOURCE_CMIS_ENDPOINT_PAGE_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_CMIS_ENDPOINT_PAGE_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CMIS_ENDPOINT_PAGE_SIZE_DOC);
        conf.define(CAMEL_SOURCE_CMIS_ENDPOINT_READ_CONTENT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_CMIS_ENDPOINT_READ_CONTENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CMIS_ENDPOINT_READ_CONTENT_DOC);
        conf.define(CAMEL_SOURCE_CMIS_ENDPOINT_READ_COUNT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_CMIS_ENDPOINT_READ_COUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CMIS_ENDPOINT_READ_COUNT_DOC);
        conf.define(CAMEL_SOURCE_CMIS_ENDPOINT_REPOSITORY_ID_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CMIS_ENDPOINT_REPOSITORY_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CMIS_ENDPOINT_REPOSITORY_ID_DOC);
        conf.define(CAMEL_SOURCE_CMIS_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_CMIS_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CMIS_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_CMIS_ENDPOINT_QUERY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CMIS_ENDPOINT_QUERY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CMIS_ENDPOINT_QUERY_DOC);
        conf.define(CAMEL_SOURCE_CMIS_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CMIS_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CMIS_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_CMIS_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CMIS_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CMIS_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_CMIS_ENDPOINT_SESSION_FACADE_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CMIS_ENDPOINT_SESSION_FACADE_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CMIS_ENDPOINT_SESSION_FACADE_FACTORY_DOC);
        conf.define(CAMEL_SOURCE_CMIS_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_CMIS_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CMIS_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_CMIS_ENDPOINT_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_CMIS_ENDPOINT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CMIS_ENDPOINT_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_CMIS_ENDPOINT_USERNAME_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_CMIS_ENDPOINT_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CMIS_ENDPOINT_USERNAME_DOC);
        conf.define(CAMEL_SOURCE_CMIS_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_CMIS_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CMIS_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_CMIS_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_CMIS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CMIS_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SOURCE_CMIS_COMPONENT_SESSION_FACADE_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CMIS_COMPONENT_SESSION_FACADE_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CMIS_COMPONENT_SESSION_FACADE_FACTORY_DOC);
        return conf;
    }
}