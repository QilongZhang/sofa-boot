/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.common.xmap.annotation.spring;

import org.springframework.context.ApplicationContext;

import com.alipay.sofa.common.xmap.XAnnotatedObject;
import com.alipay.sofa.common.xmap.XMap;
import com.alipay.sofa.common.xmap.annotation.XObject;

/**
 * @author xi.hux@alipay.com
 * @since 2.6.0
 * */
public class XAnnotatedSpringObject extends XAnnotatedObject {

    private ApplicationContext applicationContext;

    public XAnnotatedSpringObject(XMap xmap, Class klass, XObject xob,
                                  ApplicationContext applicationContext) {
        super(xmap, klass, xob);
        this.applicationContext = applicationContext;
    }

    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

}
