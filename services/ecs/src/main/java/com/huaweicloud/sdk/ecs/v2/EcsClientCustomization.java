/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2020-2020. All rights reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.huaweicloud.sdk.ecs.v2;

import com.huaweicloud.sdk.core.ClientCustomization;
import com.huaweicloud.sdk.core.CustomizationConfigure;

public class EcsClientCustomization implements ClientCustomization {

    private static EcsCustomModule ecsCustomModule = new EcsCustomModule();

    @Override
    public void customize(CustomizationConfigure customizationConfigure) {
        customizationConfigure.configJson(objectMapper -> {
            if (!objectMapper.getRegisteredModuleIds().contains(ecsCustomModule.getTypeId())) {
                objectMapper.registerModule(ecsCustomModule);
            }
        });
    }
}
