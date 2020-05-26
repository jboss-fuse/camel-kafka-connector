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
package org.apache.camel.kafkaconnector.quartz;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelQuartzSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_QUARTZ_PATH_GROUP_NAME_CONF = "camel.source.path.groupName";
    public static final String CAMEL_SOURCE_QUARTZ_PATH_GROUP_NAME_DOC = "The quartz group name to use. The combination of group name and timer name should be unique.";
    public static final String CAMEL_SOURCE_QUARTZ_PATH_GROUP_NAME_DEFAULT = "Camel";
    public static final String CAMEL_SOURCE_QUARTZ_PATH_TRIGGER_NAME_CONF = "camel.source.path.triggerName";
    public static final String CAMEL_SOURCE_QUARTZ_PATH_TRIGGER_NAME_DOC = "The quartz timer name to use. The combination of group name and timer name should be unique.";
    public static final String CAMEL_SOURCE_QUARTZ_PATH_TRIGGER_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_QUARTZ_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_CRON_CONF = "camel.source.endpoint.cron";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_CRON_DOC = "Specifies a cron expression to define when to trigger.";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_CRON_DEFAULT = null;
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_DELETE_JOB_CONF = "camel.source.endpoint.deleteJob";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_DELETE_JOB_DOC = "If set to true, then the trigger automatically delete when route stop. Else if set to false, it will remain in scheduler. When set to false, it will also mean user may reuse pre-configured trigger with camel Uri. Just ensure the names match. Notice you cannot have both deleteJob and pauseJob set to true.";
    public static final Boolean CAMEL_SOURCE_QUARTZ_ENDPOINT_DELETE_JOB_DEFAULT = true;
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_DURABLE_JOB_CONF = "camel.source.endpoint.durableJob";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_DURABLE_JOB_DOC = "Whether or not the job should remain stored after it is orphaned (no triggers point to it).";
    public static final Boolean CAMEL_SOURCE_QUARTZ_ENDPOINT_DURABLE_JOB_DEFAULT = false;
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_PAUSE_JOB_CONF = "camel.source.endpoint.pauseJob";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_PAUSE_JOB_DOC = "If set to true, then the trigger automatically pauses when route stop. Else if set to false, it will remain in scheduler. When set to false, it will also mean user may reuse pre-configured trigger with camel Uri. Just ensure the names match. Notice you cannot have both deleteJob and pauseJob set to true.";
    public static final Boolean CAMEL_SOURCE_QUARTZ_ENDPOINT_PAUSE_JOB_DEFAULT = false;
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_RECOVERABLE_JOB_CONF = "camel.source.endpoint.recoverableJob";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_RECOVERABLE_JOB_DOC = "Instructs the scheduler whether or not the job should be re-executed if a 'recovery' or 'fail-over' situation is encountered.";
    public static final Boolean CAMEL_SOURCE_QUARTZ_ENDPOINT_RECOVERABLE_JOB_DEFAULT = false;
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_STATEFUL_CONF = "camel.source.endpoint.stateful";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_STATEFUL_DOC = "Uses a Quartz PersistJobDataAfterExecution and DisallowConcurrentExecution instead of the default job.";
    public static final Boolean CAMEL_SOURCE_QUARTZ_ENDPOINT_STATEFUL_DEFAULT = false;
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_QUARTZ_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_CUSTOM_CALENDAR_CONF = "camel.source.endpoint.customCalendar";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_CUSTOM_CALENDAR_DOC = "Specifies a custom calendar to avoid specific range of date";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_CUSTOM_CALENDAR_DEFAULT = null;
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_JOB_PARAMETERS_CONF = "camel.source.endpoint.jobParameters";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_JOB_PARAMETERS_DOC = "To configure additional options on the job.";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_JOB_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_PREFIX_JOB_NAME_WITH_ENDPOINT_ID_CONF = "camel.source.endpoint.prefixJobNameWithEndpointId";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_PREFIX_JOB_NAME_WITH_ENDPOINT_ID_DOC = "Whether the job name should be prefixed with endpoint id";
    public static final Boolean CAMEL_SOURCE_QUARTZ_ENDPOINT_PREFIX_JOB_NAME_WITH_ENDPOINT_ID_DEFAULT = false;
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_QUARTZ_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_TRIGGER_PARAMETERS_CONF = "camel.source.endpoint.triggerParameters";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_TRIGGER_PARAMETERS_DOC = "To configure additional options on the trigger.";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_TRIGGER_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_USING_FIXED_CAMEL_CONTEXT_NAME_CONF = "camel.source.endpoint.usingFixedCamelContextName";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_USING_FIXED_CAMEL_CONTEXT_NAME_DOC = "If it is true, JobDataMap uses the CamelContext name directly to reference the CamelContext, if it is false, JobDataMap uses use the CamelContext management name which could be changed during the deploy time.";
    public static final Boolean CAMEL_SOURCE_QUARTZ_ENDPOINT_USING_FIXED_CAMEL_CONTEXT_NAME_DEFAULT = false;
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_AUTO_START_SCHEDULER_CONF = "camel.source.endpoint.autoStartScheduler";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_AUTO_START_SCHEDULER_DOC = "Whether or not the scheduler should be auto started.";
    public static final Boolean CAMEL_SOURCE_QUARTZ_ENDPOINT_AUTO_START_SCHEDULER_DEFAULT = true;
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_FIRE_NOW_CONF = "camel.source.endpoint.fireNow";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_FIRE_NOW_DOC = "If it is true will fire the trigger when the route is start when using SimpleTrigger.";
    public static final Boolean CAMEL_SOURCE_QUARTZ_ENDPOINT_FIRE_NOW_DEFAULT = false;
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_START_DELAYED_SECONDS_CONF = "camel.source.endpoint.startDelayedSeconds";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_START_DELAYED_SECONDS_DOC = "Seconds to wait before starting the quartz scheduler.";
    public static final Integer CAMEL_SOURCE_QUARTZ_ENDPOINT_START_DELAYED_SECONDS_DEFAULT = null;
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_TRIGGER_START_DELAY_CONF = "camel.source.endpoint.triggerStartDelay";
    public static final String CAMEL_SOURCE_QUARTZ_ENDPOINT_TRIGGER_START_DELAY_DOC = "In case of scheduler has already started, we want the trigger start slightly after current time to ensure endpoint is fully started before the job kicks in.";
    public static final Long CAMEL_SOURCE_QUARTZ_ENDPOINT_TRIGGER_START_DELAY_DEFAULT = 500L;
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.quartz.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_QUARTZ_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_ENABLE_JMX_CONF = "camel.component.quartz.enableJmx";
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_ENABLE_JMX_DOC = "Whether to enable Quartz JMX which allows to manage the Quartz scheduler from JMX. This options is default true";
    public static final Boolean CAMEL_SOURCE_QUARTZ_COMPONENT_ENABLE_JMX_DEFAULT = true;
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_PREFIX_INSTANCE_NAME_CONF = "camel.component.quartz.prefixInstanceName";
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_PREFIX_INSTANCE_NAME_DOC = "Whether to prefix the Quartz Scheduler instance name with the CamelContext name. This is enabled by default, to let each CamelContext use its own Quartz scheduler instance by default. You can set this option to false to reuse Quartz scheduler instances between multiple CamelContext's.";
    public static final Boolean CAMEL_SOURCE_QUARTZ_COMPONENT_PREFIX_INSTANCE_NAME_DEFAULT = true;
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_PREFIX_JOB_NAME_WITH_ENDPOINT_ID_CONF = "camel.component.quartz.prefixJobNameWithEndpointId";
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_PREFIX_JOB_NAME_WITH_ENDPOINT_ID_DOC = "Whether to prefix the quartz job with the endpoint id. This option is default false.";
    public static final Boolean CAMEL_SOURCE_QUARTZ_COMPONENT_PREFIX_JOB_NAME_WITH_ENDPOINT_ID_DEFAULT = false;
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_PROPERTIES_CONF = "camel.component.quartz.properties";
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_PROPERTIES_DOC = "Properties to configure the Quartz scheduler.";
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_PROPERTIES_DEFAULT = null;
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_PROPERTIES_FILE_CONF = "camel.component.quartz.propertiesFile";
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_PROPERTIES_FILE_DOC = "File name of the properties to load from the classpath";
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_PROPERTIES_FILE_DEFAULT = null;
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_PROPERTIES_REF_CONF = "camel.component.quartz.propertiesRef";
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_PROPERTIES_REF_DOC = "References to an existing Properties or Map to lookup in the registry to use for configuring quartz.";
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_PROPERTIES_REF_DEFAULT = null;
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.quartz.basicPropertyBinding";
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_QUARTZ_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_SCHEDULER_CONF = "camel.component.quartz.scheduler";
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_SCHEDULER_DOC = "To use the custom configured Quartz scheduler, instead of creating a new Scheduler.";
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_SCHEDULER_DEFAULT = null;
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_SCHEDULER_FACTORY_CONF = "camel.component.quartz.schedulerFactory";
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_SCHEDULER_FACTORY_DOC = "To use the custom SchedulerFactory which is used to create the Scheduler.";
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_SCHEDULER_FACTORY_DEFAULT = null;
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_AUTO_START_SCHEDULER_CONF = "camel.component.quartz.autoStartScheduler";
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_AUTO_START_SCHEDULER_DOC = "Whether or not the scheduler should be auto started. This options is default true";
    public static final Boolean CAMEL_SOURCE_QUARTZ_COMPONENT_AUTO_START_SCHEDULER_DEFAULT = true;
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_INTERRUPT_JOBS_ON_SHUTDOWN_CONF = "camel.component.quartz.interruptJobsOnShutdown";
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_INTERRUPT_JOBS_ON_SHUTDOWN_DOC = "Whether to interrupt jobs on shutdown which forces the scheduler to shutdown quicker and attempt to interrupt any running jobs. If this is enabled then any running jobs can fail due to being interrupted.";
    public static final Boolean CAMEL_SOURCE_QUARTZ_COMPONENT_INTERRUPT_JOBS_ON_SHUTDOWN_DEFAULT = false;
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_START_DELAYED_SECONDS_CONF = "camel.component.quartz.startDelayedSeconds";
    public static final String CAMEL_SOURCE_QUARTZ_COMPONENT_START_DELAYED_SECONDS_DOC = "Seconds to wait before starting the quartz scheduler.";
    public static final Integer CAMEL_SOURCE_QUARTZ_COMPONENT_START_DELAYED_SECONDS_DEFAULT = null;

    public CamelQuartzSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelQuartzSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_QUARTZ_PATH_GROUP_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_QUARTZ_PATH_GROUP_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_PATH_GROUP_NAME_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_PATH_TRIGGER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_QUARTZ_PATH_TRIGGER_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_QUARTZ_PATH_TRIGGER_NAME_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_QUARTZ_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_ENDPOINT_CRON_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_QUARTZ_ENDPOINT_CRON_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_ENDPOINT_CRON_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_ENDPOINT_DELETE_JOB_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_QUARTZ_ENDPOINT_DELETE_JOB_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_ENDPOINT_DELETE_JOB_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_ENDPOINT_DURABLE_JOB_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_QUARTZ_ENDPOINT_DURABLE_JOB_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_ENDPOINT_DURABLE_JOB_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_ENDPOINT_PAUSE_JOB_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_QUARTZ_ENDPOINT_PAUSE_JOB_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_ENDPOINT_PAUSE_JOB_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_ENDPOINT_RECOVERABLE_JOB_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_QUARTZ_ENDPOINT_RECOVERABLE_JOB_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_ENDPOINT_RECOVERABLE_JOB_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_ENDPOINT_STATEFUL_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_QUARTZ_ENDPOINT_STATEFUL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_ENDPOINT_STATEFUL_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_QUARTZ_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_QUARTZ_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_QUARTZ_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_ENDPOINT_CUSTOM_CALENDAR_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_QUARTZ_ENDPOINT_CUSTOM_CALENDAR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_ENDPOINT_CUSTOM_CALENDAR_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_ENDPOINT_JOB_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_QUARTZ_ENDPOINT_JOB_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_ENDPOINT_JOB_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_ENDPOINT_PREFIX_JOB_NAME_WITH_ENDPOINT_ID_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_QUARTZ_ENDPOINT_PREFIX_JOB_NAME_WITH_ENDPOINT_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_ENDPOINT_PREFIX_JOB_NAME_WITH_ENDPOINT_ID_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_QUARTZ_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_ENDPOINT_TRIGGER_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_QUARTZ_ENDPOINT_TRIGGER_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_ENDPOINT_TRIGGER_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_ENDPOINT_USING_FIXED_CAMEL_CONTEXT_NAME_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_QUARTZ_ENDPOINT_USING_FIXED_CAMEL_CONTEXT_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_ENDPOINT_USING_FIXED_CAMEL_CONTEXT_NAME_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_ENDPOINT_AUTO_START_SCHEDULER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_QUARTZ_ENDPOINT_AUTO_START_SCHEDULER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_ENDPOINT_AUTO_START_SCHEDULER_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_ENDPOINT_FIRE_NOW_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_QUARTZ_ENDPOINT_FIRE_NOW_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_ENDPOINT_FIRE_NOW_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_ENDPOINT_START_DELAYED_SECONDS_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_QUARTZ_ENDPOINT_START_DELAYED_SECONDS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_ENDPOINT_START_DELAYED_SECONDS_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_ENDPOINT_TRIGGER_START_DELAY_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_QUARTZ_ENDPOINT_TRIGGER_START_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_ENDPOINT_TRIGGER_START_DELAY_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_QUARTZ_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_COMPONENT_ENABLE_JMX_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_QUARTZ_COMPONENT_ENABLE_JMX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_COMPONENT_ENABLE_JMX_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_COMPONENT_PREFIX_INSTANCE_NAME_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_QUARTZ_COMPONENT_PREFIX_INSTANCE_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_COMPONENT_PREFIX_INSTANCE_NAME_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_COMPONENT_PREFIX_JOB_NAME_WITH_ENDPOINT_ID_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_QUARTZ_COMPONENT_PREFIX_JOB_NAME_WITH_ENDPOINT_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_COMPONENT_PREFIX_JOB_NAME_WITH_ENDPOINT_ID_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_COMPONENT_PROPERTIES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_QUARTZ_COMPONENT_PROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_COMPONENT_PROPERTIES_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_COMPONENT_PROPERTIES_FILE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_QUARTZ_COMPONENT_PROPERTIES_FILE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_COMPONENT_PROPERTIES_FILE_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_COMPONENT_PROPERTIES_REF_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_QUARTZ_COMPONENT_PROPERTIES_REF_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_COMPONENT_PROPERTIES_REF_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_QUARTZ_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_COMPONENT_SCHEDULER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_QUARTZ_COMPONENT_SCHEDULER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_COMPONENT_SCHEDULER_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_COMPONENT_SCHEDULER_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_QUARTZ_COMPONENT_SCHEDULER_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_COMPONENT_SCHEDULER_FACTORY_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_COMPONENT_AUTO_START_SCHEDULER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_QUARTZ_COMPONENT_AUTO_START_SCHEDULER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_COMPONENT_AUTO_START_SCHEDULER_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_COMPONENT_INTERRUPT_JOBS_ON_SHUTDOWN_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_QUARTZ_COMPONENT_INTERRUPT_JOBS_ON_SHUTDOWN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_COMPONENT_INTERRUPT_JOBS_ON_SHUTDOWN_DOC);
        conf.define(CAMEL_SOURCE_QUARTZ_COMPONENT_START_DELAYED_SECONDS_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_QUARTZ_COMPONENT_START_DELAYED_SECONDS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_QUARTZ_COMPONENT_START_DELAYED_SECONDS_DOC);
        return conf;
    }
}