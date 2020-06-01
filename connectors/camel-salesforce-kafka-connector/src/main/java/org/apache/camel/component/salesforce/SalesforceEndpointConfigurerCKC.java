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
public class SalesforceEndpointConfigurerCKC extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {
    //CHECKSTYLE:OFF
    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SalesforceEndpoint target = (SalesforceEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
            case "apexmethod":
            case "apexMethod": target.getConfiguration().setApexMethod(property(camelContext, java.lang.String.class, value)); return true;
            case "apexqueryparams":
            case "apexQueryParams": target.getConfiguration().setApexQueryParams(property(camelContext, java.util.Map.class, value)); return true;
            case "apexurl":
            case "apexUrl": target.getConfiguration().setApexUrl(property(camelContext, java.lang.String.class, value)); return true;
            case "apiversion":
            case "apiVersion": target.getConfiguration().setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
            case "backoffincrement":
            case "backoffIncrement": target.getConfiguration().setBackoffIncrement(property(camelContext, long.class, value)); return true;
            case "basicpropertybinding":
            case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
            case "batchid":
            case "batchId": target.getConfiguration().setBatchId(property(camelContext, java.lang.String.class, value)); return true;
            case "bridgeerrorhandler":
            case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            case "contenttype":
            case "contentType": target.getConfiguration().setContentType(property(camelContext, org.apache.camel.component.salesforce.api.dto.bulk.ContentType.class, value)); return true;
            case "defaultreplayid":
            case "defaultReplayId": target.getConfiguration().setDefaultReplayId(property(camelContext, java.lang.Long.class, value)); return true;
            case "exceptionhandler":
            case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
            case "exchangepattern":
            case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
            case "format": target.getConfiguration().setFormat(property(camelContext, org.apache.camel.component.salesforce.internal.PayloadFormat.class, value)); return true;
            case "httpclient":
            case "httpClient": target.getConfiguration().setHttpClient(property(camelContext, org.apache.camel.component.salesforce.SalesforceHttpClient.class, value)); return true;
            case "includedetails":
            case "includeDetails": target.getConfiguration().setIncludeDetails(property(camelContext, java.lang.Boolean.class, value)); return true;
            case "initialreplayidmap":
            case "initialReplayIdMap": target.getConfiguration().setInitialReplayIdMap(property(camelContext, java.util.Map.class, value)); return true;
            case "instanceid":
            case "instanceId": target.getConfiguration().setInstanceId(property(camelContext, java.lang.String.class, value)); return true;
            case "jobid":
            case "jobId": target.getConfiguration().setJobId(property(camelContext, java.lang.String.class, value)); return true;
            case "lazystartproducer":
            case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
            case "limit": target.getConfiguration().setLimit(property(camelContext, java.lang.Integer.class, value)); return true;
            case "maxbackoff":
            case "maxBackoff": target.getConfiguration().setMaxBackoff(property(camelContext, long.class, value)); return true;
            case "notfoundbehaviour":
            case "notFoundBehaviour": target.getConfiguration().setNotFoundBehaviour(property(camelContext, org.apache.camel.component.salesforce.NotFoundBehaviour.class, value)); return true;
            case "notifyforfields":
            case "notifyForFields": target.getConfiguration().setNotifyForFields(property(camelContext, org.apache.camel.component.salesforce.internal.dto.NotifyForFieldsEnum.class, value)); return true;
            case "notifyforoperationcreate":
            case "notifyForOperationCreate": target.getConfiguration().setNotifyForOperationCreate(property(camelContext, java.lang.Boolean.class, value)); return true;
            case "notifyforoperationdelete":
            case "notifyForOperationDelete": target.getConfiguration().setNotifyForOperationDelete(property(camelContext, java.lang.Boolean.class, value)); return true;
            case "notifyforoperationundelete":
            case "notifyForOperationUndelete": target.getConfiguration().setNotifyForOperationUndelete(property(camelContext, java.lang.Boolean.class, value)); return true;
            case "notifyforoperationupdate":
            case "notifyForOperationUpdate": target.getConfiguration().setNotifyForOperationUpdate(property(camelContext, java.lang.Boolean.class, value)); return true;
            case "notifyforoperations":
            case "notifyForOperations": target.getConfiguration().setNotifyForOperations(property(camelContext, org.apache.camel.component.salesforce.internal.dto.NotifyForOperationsEnum.class, value)); return true;
            case "objectmapper":
            case "objectMapper": target.getConfiguration().setObjectMapper(property(camelContext, com.fasterxml.jackson.databind.ObjectMapper.class, value)); return true;
            case "rawpayload":
            case "rawPayload": target.getConfiguration().setRawPayload(property(camelContext, boolean.class, value)); return true;
            case "replayid":
            case "replayId": target.setReplayId(property(camelContext, java.lang.Long.class, value)); return true;
            case "reportid":
            case "reportId": target.getConfiguration().setReportId(property(camelContext, java.lang.String.class, value)); return true;
            case "reportmetadata":
            case "reportMetadata": target.getConfiguration().setReportMetadata(property(camelContext, org.apache.camel.component.salesforce.api.dto.analytics.reports.ReportMetadata.class, value)); return true;
            case "resultid":
            case "resultId": target.getConfiguration().setResultId(property(camelContext, java.lang.String.class, value)); return true;
            case "sobjectblobfieldname":
            case "sObjectBlobFieldName": target.getConfiguration().setSObjectBlobFieldName(property(camelContext, java.lang.String.class, value)); return true;
            case "sobjectclass":
            case "sObjectClass": target.getConfiguration().setSObjectClass(property(camelContext, java.lang.String.class, value)); return true;
            case "sobjectfields":
            case "sObjectFields": target.getConfiguration().setSObjectFields(property(camelContext, java.lang.String.class, value)); return true;
            case "sobjectid":
            case "sObjectId": target.getConfiguration().setSObjectId(property(camelContext, java.lang.String.class, value)); return true;
            case "sobjectidname":
            case "sObjectIdName": target.getConfiguration().setSObjectIdName(property(camelContext, java.lang.String.class, value)); return true;
            case "sobjectidvalue":
            case "sObjectIdValue": target.getConfiguration().setSObjectIdValue(property(camelContext, java.lang.String.class, value)); return true;
            case "sobjectname":
            case "sObjectName": target.getConfiguration().setSObjectName(property(camelContext, java.lang.String.class, value)); return true;
            case "sobjectquery":
            case "sObjectQuery": target.getConfiguration().setSObjectQuery(property(camelContext, java.lang.String.class, value)); return true;
            case "sobjectsearch":
            case "sObjectSearch": target.getConfiguration().setSObjectSearch(property(camelContext, java.lang.String.class, value)); return true;
            case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
            case "updatetopic":
            case "updateTopic": target.getConfiguration().setUpdateTopic(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }
    //CHECKSTYLE:ON
}
