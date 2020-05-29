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

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

@SuppressWarnings("unchecked")
public class SalesforceComponentConfigurerCKC extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {
    //CHECKSTYLE:OFF
    private org.apache.camel.component.salesforce.SalesforceEndpointConfig getOrCreateConfiguration(SalesforceComponent target) {
        if (target.getConfig() == null) {
            target.setConfig(new org.apache.camel.component.salesforce.SalesforceEndpointConfig());
        }
        return target.getConfig();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SalesforceComponent target = (SalesforceComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
            case "apexmethod":
            case "apexMethod": getOrCreateConfiguration(target).setApexMethod(property(camelContext, java.lang.String.class, value)); return true;
            case "apexqueryparams":
            case "apexQueryParams": getOrCreateConfiguration(target).setApexQueryParams(property(camelContext, java.util.Map.class, value)); return true;
            case "apexurl":
            case "apexUrl": getOrCreateConfiguration(target).setApexUrl(property(camelContext, java.lang.String.class, value)); return true;
            case "apiversion":
            case "apiVersion": getOrCreateConfiguration(target).setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
            case "authenticationtype":
            case "authenticationType": target.setAuthenticationType(property(camelContext, org.apache.camel.component.salesforce.AuthenticationType.class, value)); return true;
            case "backoffincrement":
            case "backoffIncrement": getOrCreateConfiguration(target).setBackoffIncrement(property(camelContext, long.class, value)); return true;
            case "basicpropertybinding":
            case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
            case "batchid":
            case "batchId": getOrCreateConfiguration(target).setBatchId(property(camelContext, java.lang.String.class, value)); return true;
            case "bridgeerrorhandler":
            case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            case "clientid":
            case "clientId": target.setClientId(property(camelContext, java.lang.String.class, value)); return true;
            case "clientsecret":
            case "clientSecret": target.setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
            case "config": target.setConfig(property(camelContext, org.apache.camel.component.salesforce.SalesforceEndpointConfig.class, value)); return true;
            case "contenttype":
            case "contentType": getOrCreateConfiguration(target).setContentType(property(camelContext, org.apache.camel.component.salesforce.api.dto.bulk.ContentType.class, value)); return true;
            case "defaultreplayid":
            case "defaultReplayId": getOrCreateConfiguration(target).setDefaultReplayId(property(camelContext, java.lang.Long.class, value)); return true;
            case "format": getOrCreateConfiguration(target).setFormat(property(camelContext, org.apache.camel.component.salesforce.internal.PayloadFormat.class, value)); return true;
            case "httpclient":
            case "httpClient": getOrCreateConfiguration(target).setHttpClient(property(camelContext, org.apache.camel.component.salesforce.SalesforceHttpClient.class, value)); return true;
            case "httpclientconnectiontimeout":
            case "httpClientConnectionTimeout": target.setHttpClientConnectionTimeout(property(camelContext, long.class, value)); return true;
            case "httpclientidletimeout":
            case "httpClientIdleTimeout": target.setHttpClientIdleTimeout(property(camelContext, long.class, value)); return true;
            case "httpclientproperties":
            case "httpClientProperties": target.setHttpClientProperties(property(camelContext, java.util.Map.class, value)); return true;
            case "httpmaxcontentlength":
            case "httpMaxContentLength": target.setHttpMaxContentLength(property(camelContext, java.lang.Integer.class, value)); return true;
            case "httpproxyauthuri":
            case "httpProxyAuthUri": target.setHttpProxyAuthUri(property(camelContext, java.lang.String.class, value)); return true;
            case "httpproxyexcludedaddresses":
            case "httpProxyExcludedAddresses": target.setHttpProxyExcludedAddresses(property(camelContext, java.util.Set.class, value)); return true;
            case "httpproxyhost":
            case "httpProxyHost": target.setHttpProxyHost(property(camelContext, java.lang.String.class, value)); return true;
            case "httpproxyincludedaddresses":
            case "httpProxyIncludedAddresses": target.setHttpProxyIncludedAddresses(property(camelContext, java.util.Set.class, value)); return true;
            case "httpproxypassword":
            case "httpProxyPassword": target.setHttpProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
            case "httpproxyport":
            case "httpProxyPort": target.setHttpProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
            case "httpproxyrealm":
            case "httpProxyRealm": target.setHttpProxyRealm(property(camelContext, java.lang.String.class, value)); return true;
            case "httpproxyusedigestauth":
            case "httpProxyUseDigestAuth": target.setHttpProxyUseDigestAuth(property(camelContext, boolean.class, value)); return true;
            case "httpproxyusername":
            case "httpProxyUsername": target.setHttpProxyUsername(property(camelContext, java.lang.String.class, value)); return true;
            case "includedetails":
            case "includeDetails": getOrCreateConfiguration(target).setIncludeDetails(property(camelContext, java.lang.Boolean.class, value)); return true;
            case "initialreplayidmap":
            case "initialReplayIdMap": getOrCreateConfiguration(target).setInitialReplayIdMap(property(camelContext, java.util.Map.class, value)); return true;
            case "instanceid":
            case "instanceId": getOrCreateConfiguration(target).setInstanceId(property(camelContext, java.lang.String.class, value)); return true;
            case "instanceurl":
            case "instanceUrl": target.setInstanceUrl(property(camelContext, java.lang.String.class, value)); return true;
            case "jobid":
            case "jobId": getOrCreateConfiguration(target).setJobId(property(camelContext, java.lang.String.class, value)); return true;
            case "keystore": target.setKeystore(property(camelContext, org.apache.camel.support.jsse.KeyStoreParameters.class, value)); return true;
            case "lazylogin":
            case "lazyLogin": target.setLazyLogin(property(camelContext, boolean.class, value)); return true;
            case "lazystartproducer":
            case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
            case "limit": getOrCreateConfiguration(target).setLimit(property(camelContext, java.lang.Integer.class, value)); return true;
            case "loginconfig":
            case "loginConfig": target.setLoginConfig(property(camelContext, org.apache.camel.component.salesforce.SalesforceLoginConfig.class, value)); return true;
            case "loginurl":
            case "loginUrl": target.setLoginUrl(property(camelContext, java.lang.String.class, value)); return true;
            case "longpollingtransportproperties":
            case "longPollingTransportProperties": target.setLongPollingTransportProperties(property(camelContext, java.util.Map.class, value)); return true;
            case "maxbackoff":
            case "maxBackoff": getOrCreateConfiguration(target).setMaxBackoff(property(camelContext, long.class, value)); return true;
            case "notfoundbehaviour":
            case "notFoundBehaviour": getOrCreateConfiguration(target).setNotFoundBehaviour(property(camelContext, org.apache.camel.component.salesforce.NotFoundBehaviour.class, value)); return true;
            case "notifyforfields":
            case "notifyForFields": getOrCreateConfiguration(target).setNotifyForFields(property(camelContext, org.apache.camel.component.salesforce.internal.dto.NotifyForFieldsEnum.class, value)); return true;
            case "notifyforoperationcreate":
            case "notifyForOperationCreate": getOrCreateConfiguration(target).setNotifyForOperationCreate(property(camelContext, java.lang.Boolean.class, value)); return true;
            case "notifyforoperationdelete":
            case "notifyForOperationDelete": getOrCreateConfiguration(target).setNotifyForOperationDelete(property(camelContext, java.lang.Boolean.class, value)); return true;
            case "notifyforoperationundelete":
            case "notifyForOperationUndelete": getOrCreateConfiguration(target).setNotifyForOperationUndelete(property(camelContext, java.lang.Boolean.class, value)); return true;
            case "notifyforoperationupdate":
            case "notifyForOperationUpdate": getOrCreateConfiguration(target).setNotifyForOperationUpdate(property(camelContext, java.lang.Boolean.class, value)); return true;
            case "notifyforoperations":
            case "notifyForOperations": getOrCreateConfiguration(target).setNotifyForOperations(property(camelContext, org.apache.camel.component.salesforce.internal.dto.NotifyForOperationsEnum.class, value)); return true;
            case "objectmapper":
            case "objectMapper": getOrCreateConfiguration(target).setObjectMapper(property(camelContext, com.fasterxml.jackson.databind.ObjectMapper.class, value)); return true;
            case "packages": target.setPackages(property(camelContext, java.lang.String[].class, value)); return true;
            case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
            case "rawpayload":
            case "rawPayload": getOrCreateConfiguration(target).setRawPayload(property(camelContext, boolean.class, value)); return true;
            case "refreshtoken":
            case "refreshToken": target.setRefreshToken(property(camelContext, java.lang.String.class, value)); return true;
            case "reportid":
            case "reportId": getOrCreateConfiguration(target).setReportId(property(camelContext, java.lang.String.class, value)); return true;
            case "reportmetadata":
            case "reportMetadata": getOrCreateConfiguration(target).setReportMetadata(property(camelContext, org.apache.camel.component.salesforce.api.dto.analytics.reports.ReportMetadata.class, value)); return true;
            case "resultid":
            case "resultId": getOrCreateConfiguration(target).setResultId(property(camelContext, java.lang.String.class, value)); return true;
            case "sobjectblobfieldname":
            case "sObjectBlobFieldName": getOrCreateConfiguration(target).setSObjectBlobFieldName(property(camelContext, java.lang.String.class, value)); return true;
            case "sobjectclass":
            case "sObjectClass": getOrCreateConfiguration(target).setSObjectClass(property(camelContext, java.lang.String.class, value)); return true;
            case "sobjectfields":
            case "sObjectFields": getOrCreateConfiguration(target).setSObjectFields(property(camelContext, java.lang.String.class, value)); return true;
            case "sobjectid":
            case "sObjectId": getOrCreateConfiguration(target).setSObjectId(property(camelContext, java.lang.String.class, value)); return true;
            case "sobjectidname":
            case "sObjectIdName": getOrCreateConfiguration(target).setSObjectIdName(property(camelContext, java.lang.String.class, value)); return true;
            case "sobjectidvalue":
            case "sObjectIdValue": getOrCreateConfiguration(target).setSObjectIdValue(property(camelContext, java.lang.String.class, value)); return true;
            case "sobjectname":
            case "sObjectName": getOrCreateConfiguration(target).setSObjectName(property(camelContext, java.lang.String.class, value)); return true;
            case "sobjectquery":
            case "sObjectQuery": getOrCreateConfiguration(target).setSObjectQuery(property(camelContext, java.lang.String.class, value)); return true;
            case "sobjectsearch":
            case "sObjectSearch": getOrCreateConfiguration(target).setSObjectSearch(property(camelContext, java.lang.String.class, value)); return true;
            case "sslcontextparameters":
            case "sslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
            case "updatetopic":
            case "updateTopic": getOrCreateConfiguration(target).setUpdateTopic(property(camelContext, boolean.class, value)); return true;
            case "useglobalsslcontextparameters":
            case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
            case "username":
            case "userName": target.setUserName(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }
    //CHECKSTYLE:ON
}

