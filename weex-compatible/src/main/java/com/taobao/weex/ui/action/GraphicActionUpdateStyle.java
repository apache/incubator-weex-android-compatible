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

import java.util.Map;
import org.apache.weex.WXSDKInstance;
import org.apache.weex.dom.CSSShorthand;

@Deprecated
public class GraphicActionUpdateStyle extends org.apache.weex.ui.action.GraphicActionUpdateStyle {

  public GraphicActionUpdateStyle(WXSDKInstance instance, String ref,
      Map<String, Object> style, Map<String, String> paddings,
      Map<String, String> margins,
      Map<String, String> borders) {
    super(instance, ref, style, paddings, margins, borders);
  }

  public GraphicActionUpdateStyle(WXSDKInstance instance, String ref,
      Map<String, Object> style, CSSShorthand paddings,
      CSSShorthand margins, CSSShorthand borders,
      boolean byPesudo) {
    super(instance, ref, style, paddings, margins, borders, byPesudo);
  }

  public GraphicActionUpdateStyle(WXSDKInstance instance, String ref,
      Map<String, Object> style, Map<String, String> paddings,
      Map<String, String> margins,
      Map<String, String> borders, boolean byPesudo) {
    super(instance, ref, style, paddings, margins, borders, byPesudo);
  }
}

