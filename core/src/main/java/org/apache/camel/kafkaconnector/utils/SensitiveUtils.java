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

package org.apache.camel.kafkaconnector.utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/**
 * This one was deliberately copied from Camel 3.7.1. Because we are currently aligning to 3.7.0 it is
 * currently not available, so we use this copy until we align to that.
 */
final class SensitiveUtils {
    private static final Set<String> SENSITIVE_KEYS = new HashSet<>(
            Arrays.asList("accesskey", "accesstoken", "authorizationtoken", "clientsecret", "passphrase", "password",
                    "sasljaasconfig", "secretkey", "access-key", "secret-key", "client-secret", "access-token",
                    "sasl-jaas-config", "authorization-token"));

    private SensitiveUtils() {
    }

    public static boolean containsSensitive(String text) {
        return SENSITIVE_KEYS.contains(text.toLowerCase(Locale.ENGLISH));
    }
}
