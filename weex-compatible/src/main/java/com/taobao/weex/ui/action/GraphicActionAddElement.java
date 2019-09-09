/**
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements.  See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership.  The ASF licenses this file to you under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with the License.  You may obtain
 * a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.  See the License for the specific language governing permissions and limitations
 * under the License.
 */
package com.taobao.weex.ui.action;

import android.support.annotation.NonNull;
import java.util.Map;
import java.util.Set;
import org.apache.weex.WXSDKInstance;

@Deprecated
public class GraphicActionAddElement extends org.apache.weex.ui.action.GraphicActionAddElement {

  public GraphicActionAddElement(
      @NonNull WXSDKInstance instance,
      String ref, String componentType, String parentRef, int index,
      Map<String, String> style,
      Map<String, String> attributes, Set<String> events, float[] margins,
      float[] paddings, float[] borders) {
    super(instance, ref, componentType, parentRef, index, style, attributes, events, margins,
        paddings, borders);
  }
}
