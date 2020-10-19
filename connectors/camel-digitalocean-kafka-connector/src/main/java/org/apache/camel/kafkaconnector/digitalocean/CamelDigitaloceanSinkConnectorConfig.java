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
package org.apache.camel.kafkaconnector.digitalocean;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelDigitaloceanSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_DIGITALOCEAN_PATH_OPERATION_CONF = "camel.sink.path.operation";
    public static final String CAMEL_SINK_DIGITALOCEAN_PATH_OPERATION_DOC = "The operation to perform to the given resource. One of: [create] [update] [delete] [list] [ownList] [get] [listBackups] [listActions] [listNeighbors] [listSnapshots] [listKernels] [listAllNeighbors] [enableBackups] [disableBackups] [reboot] [powerCycle] [shutdown] [powerOn] [powerOff] [restore] [resetPassword] [resize] [rebuild] [rename] [changeKernel] [enableIpv6] [enablePrivateNetworking] [takeSnapshot] [transfer] [convert] [attach] [detach] [assign] [unassign] [tag] [untag]";
    public static final String CAMEL_SINK_DIGITALOCEAN_PATH_OPERATION_DEFAULT = null;
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_DIGITALOCEAN_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_PAGE_CONF = "camel.sink.endpoint.page";
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_PAGE_DOC = "Use for pagination. Force the page number.";
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_PAGE_DEFAULT = "1";
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_PER_PAGE_CONF = "camel.sink.endpoint.perPage";
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_PER_PAGE_DOC = "Use for pagination. Set the number of item per request. The maximum number of results per page is 200.";
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_PER_PAGE_DEFAULT = "25";
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_RESOURCE_CONF = "camel.sink.endpoint.resource";
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_RESOURCE_DOC = "The DigitalOcean resource type on which perform the operation. One of: [account] [actions] [blockStorages] [droplets] [mages] [snapshots] [keys] [regions] [sizes] [floatingIPs] [tags]";
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_RESOURCE_DEFAULT = null;
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_DIGITALOCEAN_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_DIGITAL_OCEAN_CLIENT_CONF = "camel.sink.endpoint.digitalOceanClient";
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_DIGITAL_OCEAN_CLIENT_DOC = "To use a existing configured DigitalOceanClient as client";
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_DIGITAL_OCEAN_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_DIGITALOCEAN_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_HTTP_PROXY_HOST_CONF = "camel.sink.endpoint.httpProxyHost";
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_HTTP_PROXY_HOST_DOC = "Set a proxy host if needed";
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_HTTP_PROXY_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_HTTP_PROXY_PASSWORD_CONF = "camel.sink.endpoint.httpProxyPassword";
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_HTTP_PROXY_PASSWORD_DOC = "Set a proxy password if needed";
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_HTTP_PROXY_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_HTTP_PROXY_PORT_CONF = "camel.sink.endpoint.httpProxyPort";
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_HTTP_PROXY_PORT_DOC = "Set a proxy port if needed";
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_HTTP_PROXY_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_HTTP_PROXY_USER_CONF = "camel.sink.endpoint.httpProxyUser";
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_HTTP_PROXY_USER_DOC = "Set a proxy host if needed";
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_HTTP_PROXY_USER_DEFAULT = null;
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_OAUTH_TOKEN_CONF = "camel.sink.endpoint.oAuthToken";
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_OAUTH_TOKEN_DOC = "DigitalOcean OAuth Token";
    public static final String CAMEL_SINK_DIGITALOCEAN_ENDPOINT_OAUTH_TOKEN_DEFAULT = null;
    public static final String CAMEL_SINK_DIGITALOCEAN_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.digitalocean.lazyStartProducer";
    public static final String CAMEL_SINK_DIGITALOCEAN_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_DIGITALOCEAN_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_DIGITALOCEAN_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.digitalocean.basicPropertyBinding";
    public static final String CAMEL_SINK_DIGITALOCEAN_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_DIGITALOCEAN_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelDigitaloceanSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelDigitaloceanSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_DIGITALOCEAN_PATH_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_DIGITALOCEAN_PATH_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DIGITALOCEAN_PATH_OPERATION_DOC);
        conf.define(CAMEL_SINK_DIGITALOCEAN_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_DIGITALOCEAN_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DIGITALOCEAN_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_DIGITALOCEAN_ENDPOINT_PAGE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_DIGITALOCEAN_ENDPOINT_PAGE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DIGITALOCEAN_ENDPOINT_PAGE_DOC);
        conf.define(CAMEL_SINK_DIGITALOCEAN_ENDPOINT_PER_PAGE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_DIGITALOCEAN_ENDPOINT_PER_PAGE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DIGITALOCEAN_ENDPOINT_PER_PAGE_DOC);
        conf.define(CAMEL_SINK_DIGITALOCEAN_ENDPOINT_RESOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_DIGITALOCEAN_ENDPOINT_RESOURCE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_DIGITALOCEAN_ENDPOINT_RESOURCE_DOC);
        conf.define(CAMEL_SINK_DIGITALOCEAN_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_DIGITALOCEAN_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DIGITALOCEAN_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_DIGITALOCEAN_ENDPOINT_DIGITAL_OCEAN_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_DIGITALOCEAN_ENDPOINT_DIGITAL_OCEAN_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DIGITALOCEAN_ENDPOINT_DIGITAL_OCEAN_CLIENT_DOC);
        conf.define(CAMEL_SINK_DIGITALOCEAN_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_DIGITALOCEAN_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DIGITALOCEAN_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_DIGITALOCEAN_ENDPOINT_HTTP_PROXY_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_DIGITALOCEAN_ENDPOINT_HTTP_PROXY_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DIGITALOCEAN_ENDPOINT_HTTP_PROXY_HOST_DOC);
        conf.define(CAMEL_SINK_DIGITALOCEAN_ENDPOINT_HTTP_PROXY_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_DIGITALOCEAN_ENDPOINT_HTTP_PROXY_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DIGITALOCEAN_ENDPOINT_HTTP_PROXY_PASSWORD_DOC);
        conf.define(CAMEL_SINK_DIGITALOCEAN_ENDPOINT_HTTP_PROXY_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_DIGITALOCEAN_ENDPOINT_HTTP_PROXY_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DIGITALOCEAN_ENDPOINT_HTTP_PROXY_PORT_DOC);
        conf.define(CAMEL_SINK_DIGITALOCEAN_ENDPOINT_HTTP_PROXY_USER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_DIGITALOCEAN_ENDPOINT_HTTP_PROXY_USER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DIGITALOCEAN_ENDPOINT_HTTP_PROXY_USER_DOC);
        conf.define(CAMEL_SINK_DIGITALOCEAN_ENDPOINT_OAUTH_TOKEN_CONF, ConfigDef.Type.STRING, CAMEL_SINK_DIGITALOCEAN_ENDPOINT_OAUTH_TOKEN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DIGITALOCEAN_ENDPOINT_OAUTH_TOKEN_DOC);
        conf.define(CAMEL_SINK_DIGITALOCEAN_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_DIGITALOCEAN_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DIGITALOCEAN_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_DIGITALOCEAN_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_DIGITALOCEAN_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DIGITALOCEAN_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}