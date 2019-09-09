/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.taobao.weex.ui.component;

import org.apache.weex.WXSDKInstance;
import org.apache.weex.ui.action.BasicComponentData;
import org.apache.weex.ui.component.WXVContainer;

@Deprecated
public class WXSlider extends org.apache.weex.ui.component.WXSlider {

  public WXSlider(WXSDKInstance instance,
      WXVContainer parent, String instanceId, boolean isLazy,
      BasicComponentData basicComponentData) {
    super(instance, parent, instanceId, isLazy, basicComponentData);
  }

  public WXSlider(WXSDKInstance instance,
      WXVContainer parent,
      BasicComponentData basicComponentData) {
    super(instance, parent, basicComponentData);
  }
}
