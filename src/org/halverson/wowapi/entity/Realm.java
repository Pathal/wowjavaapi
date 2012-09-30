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

/**
 * Representation of the Realm status JSON.
 *
 */
public class Realm implements Serializable {
    private String type;
    private boolean queue;
    private boolean status;
    private String population;
    private String name;
    private String slug;

    public String getType() {
        return type;
    }
    @XmlElement
    public void setType(String type) {
        this.type = type;
    }

    public boolean isQueue() {
        return queue;
    }
    @XmlElement
    public void setQueue(boolean queue) {
        this.queue = queue;
    }

    public boolean isStatus() {
        return status;
    }
    @XmlElement
    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPopulation() {
        return population;
    }
    @XmlElement
    public void setPopulation(String population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }
    @XmlElement
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Realm");
        sb.append("{type='").append(type).append('\'');
        sb.append(", queue=").append(queue);
        sb.append(", status=").append(status);
        sb.append(", population='").append(population).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", slug='").append(slug).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
