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

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

@SuppressWarnings({"UnusedDeclaration"})
public class Titles implements Serializable, Comparable<Titles> {
    private int id;
    private String name;
    private boolean selected;

    public boolean isSelected() {
        return selected;
    }
    @XmlElement
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Titles");
        sb.append("{id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", selected=").append(selected);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }
    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Titles o) {
        return name.compareTo(o.toString());
    }
}
