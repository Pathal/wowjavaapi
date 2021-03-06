/*
 * Copyright (c) 2011 Chris D. Halverson <cdh@halverson.org>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.halverson.wowapi.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

@SuppressWarnings({"UnusedDeclaration"})
public class Progression {
    private List<Raids> raids;

    public List<Raids> getRaids() {
        return raids;
    }
    @XmlElement
    public void setRaids(List<Raids> raids) {
        this.raids = raids;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Progression");
        sb.append("{raids=").append(raids);
        sb.append('}');
        return sb.toString();
    }
}
