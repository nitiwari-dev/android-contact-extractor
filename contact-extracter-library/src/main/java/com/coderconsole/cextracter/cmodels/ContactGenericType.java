/*
 *   Copyright (C) 2017 Nitesh Tiwari.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.coderconsole.cextracter.cmodels;

/**
 * Contact Generic Type with name and its type
 *
 * Created by Nitesh on 19-04-2017.
 */

public class ContactGenericType {
    public String name;
    public String type;

    public ContactGenericType(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
