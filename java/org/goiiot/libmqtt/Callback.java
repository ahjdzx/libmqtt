/*
 * Copyright Go-IIoT (https://github.com/goiiot)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.goiiot.libmqtt;

public interface Callback {

    public void onSubResult(String topic, boolean ok, String description);
    
    public void onPubResult(String topic, boolean ok, String description);
    
    public void onUnSubResult(String topic, boolean ok, String description);

    public void onConnResult(boolean ok, String description);
    
    public void onLost(String description);

    public void onPersistError(String description);
}