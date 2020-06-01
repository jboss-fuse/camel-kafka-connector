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
package org.apache.camel.component.salesforce;

import java.lang.reflect.Field;

import org.apache.camel.spi.PropertyConfigurer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//XXX: temporary workaround waiting for https://issues.apache.org/jira/browse/CAMEL-15063 in camel 3.4.0
public class SalesforceComponentCKC extends SalesforceComponent {
    private static final Logger LOG = LoggerFactory.getLogger(SalesforceComponentCKC.class);

    @Override
    protected void doStart() throws Exception {
        super.doStart();
        Field httpClient = this.getClass().getSuperclass().getDeclaredField("httpClient");

        if (httpClient == null) {
            LOG.warn("The http client field is null on the super class");
        } else {
            LOG.debug("Making the http client accessible on the super class");
            httpClient.setAccessible(true);

            SalesforceEndpointConfig config = getConfig();
            if (config == null) {
                LOG.debug("The end point configuration instance is null on the super class");
                config = new SalesforceEndpointConfig();
                setConfig(config);
            }

            LOG.debug("Overwriting the http client instance the super class");
            config.setHttpClient((SalesforceHttpClient) httpClient.get(this));
        }
    }

    @Override
    public PropertyConfigurer getComponentPropertyConfigurer() {
        return new SalesforceComponentConfigurerCKC();
    }

    @Override
    public PropertyConfigurer getEndpointPropertyConfigurer() {
        return new SalesforceEndpointConfigurerCKC();
    }
}
