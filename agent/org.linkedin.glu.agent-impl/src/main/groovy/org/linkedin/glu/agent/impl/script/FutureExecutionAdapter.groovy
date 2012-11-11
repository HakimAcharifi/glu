/*
 * Copyright (c) 2012 Yan Pujante
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.linkedin.glu.agent.impl.script

/**
 * Simple adapter to "bridge" the 2 apis coming from 2 different packages
 *
 * @author yan@pongasoft.com */
public class FutureExecutionAdapter<K> implements
  org.linkedin.glu.groovy.utils.concurrent.FutureExecution<K>,
  org.linkedin.glu.agent.api.FutureExecution<K>
{
  // YP Implementation note: using FutureExecution does not work with the compiler (don't ask
  // me why!)
  @Delegate org.linkedin.glu.groovy.utils.concurrent.FutureTaskExecution<K> futureExecution
}