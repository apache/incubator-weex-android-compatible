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
import android.support.annotation.Nullable;
import org.apache.weex.WXSDKInstance;
import org.apache.weex.ui.animation.WXAnimationBean;

@Deprecated
public class GraphicActionAnimation extends org.apache.weex.ui.action.GraphicActionAnimation {

  public GraphicActionAnimation(
      @NonNull WXSDKInstance instance,
      @NonNull String ref,
      @NonNull WXAnimationBean animationBean) {
    super(instance, ref, animationBean);
  }

  public GraphicActionAnimation(
      @NonNull WXSDKInstance instance,
      @NonNull String ref,
      @Nullable String animation,
      @Nullable String callBack) {
    super(instance, ref, animation, callBack);
  }

  public GraphicActionAnimation(
      @NonNull WXSDKInstance instance,
      @NonNull String ref,
      @NonNull WXAnimationBean animationBean,
      @Nullable String callBack) {
    super(instance, ref, animationBean, callBack);
  }
}