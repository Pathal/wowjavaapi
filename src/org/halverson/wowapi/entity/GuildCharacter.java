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

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import com.google.gson.annotations.SerializedName;

/**
 * Class representing a character in the guild.
 *
 */
public class GuildCharacter implements Comparable<GuildCharacter> {
    private String name;
    private String realm;
    @SerializedName("class")
    private int characterClass;
    private int race;
    private String gender;
    private int level;
    private int achievementPoints;
    private String thumbnail;

    public String getName() {
        return name;
    }
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getRealm() {
        return realm;
    }
    @XmlElement
    public void setRealm(String realm) {
        this.realm = realm;
    }

    public int getCharacterClass() {
        return characterClass;
    }
    @XmlElement
    public void setCharacterClass(int characterClass) {
        this.characterClass = characterClass;
    }

    public int getRace() {
        return race;
    }
    @XmlElement
    public void setRace(int race) {
        this.race = race;
    }

    public String getGender() {
        return gender;
    }
    @XmlElement
    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getLevel() {
        return level;
    }
    @XmlElement
    public void setLevel(int level) {
        this.level = level;
    }

    public int getAchievementPoints() {
        return achievementPoints;
    }
    @XmlElement
    public void setAchievementPoints(int achievementPoints) {
        this.achievementPoints = achievementPoints;
    }

    public String getThumbnail() {
        return thumbnail;
    }
    @XmlElement
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("GuildCharacter");
        sb.append(", name='").append(name).append('\'');
        sb.append(", realm='").append(realm).append('\'');
        sb.append(", characterClass=").append(characterClass);
        sb.append(", race=").append(race);
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", level=").append(level);
        sb.append(", achievementPoints=").append(achievementPoints);
        sb.append(", thumbnail='").append(thumbnail).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(GuildCharacter o) {
        return this.name.compareTo(o.getName());
    }
}
