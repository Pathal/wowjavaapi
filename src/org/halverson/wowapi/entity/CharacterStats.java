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
 * Class representing character statistics.
 *
 */
public class CharacterStats {
     private int health;
    private String powerType;
    private int power;
    @SerializedName("str")
    private int strength;
    @SerializedName("agi")
    private int agility;
    @SerializedName("sta")
    private int stamina;
    @SerializedName("int")
    private int intellect;
    @SerializedName("spr")
    private int spirit;
    private int attackPower;
    private int rangedAttackPower;
    private double mastery;
    private int masteryRating;
    private double crit;
    private int critRating;
    private int hitRating;
    private int hasteRating;
    private int expertiseRating;
    private int spellPower;
    private int spellPen;
    private double spellCrit;
    private int spellCritRating;
    private double mana5;
    private double mana5combat;
    private int armor;
    private double dodge;
    private int dodgeRating;
    private double parry;
    private int parryRating;
    private double block;
    private int blockRating;
    @SerializedName("resil")
    private int resilience;
    private double mainHandDmgMin;
    private double mainHandDmgMax;
    private double mainHandSpeed;
    private double mainHandDps;
    private double mainHandExpertise;
    private double offHandDmgMin;
    private double offHandDmgMax;
    private double offHandSpeed;
    private double offHandDps;
    private double offHandExpertise;
    private double rangedDmgMin;
    private double rangedDmgMax;
    private double rangedSpeed;
    private double rangedDps;
    private double rangedCrit;
    private double rangedExpertise;
    private int rangedCritRating;
    private int rangedHitRating;

    public int getHealth() {
        return health;
    }
    @XmlElement
    public void setHealth(int health) {
        this.health = health;
    }

    public String getPowerType() {
        return powerType;
    }
    @XmlElement
    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }

    public int getPower() {
        return power;
    }
    @XmlElement
    public void setPower(int power) {
        this.power = power;
    }

    public int getStrength() {
        return strength;
    }
    @XmlElement
    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }
    @XmlElement
    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getStamina() {
        return stamina;
    }
    @XmlElement
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getIntellect() {
        return intellect;
    }
    @XmlElement
    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getSpirit() {
        return spirit;
    }
    @XmlElement
    public void setSpirit(int spirit) {
        this.spirit = spirit;
    }

    public int getAttackPower() {
        return attackPower;
    }
    @XmlElement
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getRangedAttackPower() {
        return rangedAttackPower;
    }
    @XmlElement
    public void setRangedAttackPower(int rangedAttackPower) {
        this.rangedAttackPower = rangedAttackPower;
    }

    public double getMastery() {
        return mastery;
    }
    @XmlElement
    public void setMastery(double mastery) {
        this.mastery = mastery;
    }

    public int getMasteryRating() {
        return masteryRating;
    }
    @XmlElement
    public void setMasteryRating(int masteryRating) {
        this.masteryRating = masteryRating;
    }

    public double getCrit() {
        return crit;
    }
    @XmlElement
    public void setCrit(double crit) {
        this.crit = crit;
    }

    public int getCritRating() {
        return critRating;
    }
    @XmlElement
    public void setCritRating(int critRating) {
        this.critRating = critRating;
    }

    public int getHitRating() {
        return hitRating;
    }
    @XmlElement
    public void setHitRating(int hitRating) {
        this.hitRating = hitRating;
    }

    public int getHasteRating() {
        return hasteRating;
    }
    @XmlElement
    public void setHasteRating(int hasteRating) {
        this.hasteRating = hasteRating;
    }

    public int getExpertiseRating() {
        return expertiseRating;
    }
    @XmlElement
    public void setExpertiseRating(int expertiseRating) {
        this.expertiseRating = expertiseRating;
    }

    public int getSpellPower() {
        return spellPower;
    }
    @XmlElement
    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public int getSpellPen() {
        return spellPen;
    }
    @XmlElement
    public void setSpellPen(int spellPen) {
        this.spellPen = spellPen;
    }

    public double getSpellCrit() {
        return spellCrit;
    }
    @XmlElement
    public void setSpellCrit(double spellCrit) {
        this.spellCrit = spellCrit;
    }

    public int getSpellCritRating() {
        return spellCritRating;
    }
    @XmlElement
    public void setSpellCritRating(int spellCritRating) {
        this.spellCritRating = spellCritRating;
    }

    public double getMana5() {
        return mana5;
    }
    @XmlElement
    public void setMana5(double mana5) {
        this.mana5 = mana5;
    }

    public double getMana5combat() {
        return mana5combat;
    }
    @XmlElement
    public void setMana5combat(double mana5combat) {
        this.mana5combat = mana5combat;
    }

    public int getArmor() {
        return armor;
    }
    @XmlElement
    public void setArmor(int armor) {
        this.armor = armor;
    }

    public double getDodge() {
        return dodge;
    }
    @XmlElement
    public void setDodge(double dodge) {
        this.dodge = dodge;
    }

    public int getDodgeRating() {
        return dodgeRating;
    }
    @XmlElement
    public void setDodgeRating(int dodgeRating) {
        this.dodgeRating = dodgeRating;
    }

    public double getParry() {
        return parry;
    }
    @XmlElement
    public void setParry(double parry) {
        this.parry = parry;
    }

    public int getParryRating() {
        return parryRating;
    }
    @XmlElement
    public void setParryRating(int parryRating) {
        this.parryRating = parryRating;
    }

    public double getBlock() {
        return block;
    }
    @XmlElement
    public void setBlock(double block) {
        this.block = block;
    }

    public int getBlockRating() {
        return blockRating;
    }
    @XmlElement
    public void setBlockRating(int blockRating) {
        this.blockRating = blockRating;
    }

    public int getResilience() {
        return resilience;
    }
    @XmlElement
    public void setResilience(int resilience) {
        this.resilience = resilience;
    }

    public double getMainHandDmgMin() {
        return mainHandDmgMin;
    }
    @XmlElement
    public void setMainHandDmgMin(double mainHandDmgMin) {
        this.mainHandDmgMin = mainHandDmgMin;
    }

    public double getMainHandDmgMax() {
        return mainHandDmgMax;
    }
    @XmlElement
    public void setMainHandDmgMax(double mainHandDmgMax) {
        this.mainHandDmgMax = mainHandDmgMax;
    }

    public double getMainHandSpeed() {
        return mainHandSpeed;
    }
    @XmlElement
    public void setMainHandSpeed(double mainHandSpeed) {
        this.mainHandSpeed = mainHandSpeed;
    }

    public double getMainHandDps() {
        return mainHandDps;
    }
    @XmlElement
    public void setMainHandDps(double mainHandDps) {
        this.mainHandDps = mainHandDps;
    }

    public double getMainHandExpertise() {
        return mainHandExpertise;
    }
    @XmlElement
    public void setMainHandExpertise(int mainHandExpertise) {
        this.mainHandExpertise = mainHandExpertise;
    }

    public double getOffHandDmgMin() {
        return offHandDmgMin;
    }
    @XmlElement
    public void setOffHandDmgMin(double offHandDmgMin) {
        this.offHandDmgMin = offHandDmgMin;
    }

    public double getOffHandDmgMax() {
        return offHandDmgMax;
    }
    @XmlElement
    public void setOffHandDmgMax(double offHandDmgMax) {
        this.offHandDmgMax = offHandDmgMax;
    }

    public double getOffHandSpeed() {
        return offHandSpeed;
    }
    @XmlElement
    public void setOffHandSpeed(double offHandSpeed) {
        this.offHandSpeed = offHandSpeed;
    }

    public double getOffHandDps() {
        return offHandDps;
    }
    @XmlElement
    public void setOffHandDps(double offHandDps) {
        this.offHandDps = offHandDps;
    }

    public double getOffHandExpertise() {
        return offHandExpertise;
    }
    @XmlElement
    public void setOffHandExpertise(int offHandExpertise) {
        this.offHandExpertise = offHandExpertise;
    }

    public double getRangedDmgMin() {
        return rangedDmgMin;
    }
    @XmlElement
    public void setRangedDmgMin(double rangedDmgMin) {
        this.rangedDmgMin = rangedDmgMin;
    }

    public double getRangedDmgMax() {
        return rangedDmgMax;
    }
    @XmlElement
    public void setRangedDmgMax(double rangedDmgMax) {
        this.rangedDmgMax = rangedDmgMax;
    }

    public double getRangedSpeed() {
        return rangedSpeed;
    }
    @XmlElement
    public void setRangedSpeed(double rangedSpeed) {
        this.rangedSpeed = rangedSpeed;
    }

    public double getRangedDps() {
        return rangedDps;
    }
    @XmlElement
    public void setRangedExpertise(double rangedExpertise) {
        this.rangedExpertise = rangedExpertise;
    }

    public double getRangedExpertise() {
        return rangedExpertise;
    }
    @XmlElement
    public void setRangedDps(double rangedDps) {
        this.rangedDps = rangedDps;
    }

    public double getRangedCrit() {
        return rangedCrit;
    }
    @XmlElement
    public void setRangedCrit(double rangedCrit) {
        this.rangedCrit = rangedCrit;
    }

    public int getRangedCritRating() {
        return rangedCritRating;
    }
    @XmlElement
    public void setRangedCritRating(int rangedCritRating) {
        this.rangedCritRating = rangedCritRating;
    }

    public int getRangedHitRating() {
        return rangedHitRating;
    }
    @XmlElement
    public void setRangedHitRating(int rangedHitRating) {
        this.rangedHitRating = rangedHitRating;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CharacterStats");
        sb.append("{health=").append(health);
        sb.append(", powerType='").append(powerType).append('\'');
        sb.append(", power=").append(power);
        sb.append(", strength=").append(strength);
        sb.append(", agility=").append(agility);
        sb.append(", stamina=").append(stamina);
        sb.append(", intellect=").append(intellect);
        sb.append(", spirit=").append(spirit);
        sb.append(", attackPower=").append(attackPower);
        sb.append(", rangedAttackPower=").append(rangedAttackPower);
        sb.append(", mastery=").append(mastery);
        sb.append(", masteryRating=").append(masteryRating);
        sb.append(", crit=").append(crit);
        sb.append(", critRating=").append(critRating);
        sb.append(", hitRating=").append(hitRating);
        sb.append(", hasteRating=").append(hasteRating);
        sb.append(", expertiseRating=").append(expertiseRating);
        sb.append(", spellPower=").append(spellPower);
        sb.append(", spellPen=").append(spellPen);
        sb.append(", spellCrit=").append(spellCrit);
        sb.append(", spellCritRating=").append(spellCritRating);
        sb.append(", mana5=").append(mana5);
        sb.append(", mana5combat=").append(mana5combat);
        sb.append(", armor=").append(armor);
        sb.append(", dodge=").append(dodge);
        sb.append(", dodgeRating=").append(dodgeRating);
        sb.append(", parry=").append(parry);
        sb.append(", parryRating=").append(parryRating);
        sb.append(", block=").append(block);
        sb.append(", blockRating=").append(blockRating);
        sb.append(", resilience=").append(resilience);
        sb.append(", mainHandDmgMin=").append(mainHandDmgMin);
        sb.append(", mainHandDmgMax=").append(mainHandDmgMax);
        sb.append(", mainHandSpeed=").append(mainHandSpeed);
        sb.append(", mainHandDps=").append(mainHandDps);
        sb.append(", mainHandExpertise=").append(mainHandExpertise);
        sb.append(", offHandDmgMin=").append(offHandDmgMin);
        sb.append(", offHandDmgMax=").append(offHandDmgMax);
        sb.append(", offHandSpeed=").append(offHandSpeed);
        sb.append(", offHandDps=").append(offHandDps);
        sb.append(", offHandExpertise=").append(offHandExpertise);
        sb.append(", rangedDmgMin=").append(rangedDmgMin);
        sb.append(", rangedDmgMax=").append(rangedDmgMax);
        sb.append(", rangedSpeed=").append(rangedSpeed);
        sb.append(", rangedDps=").append(rangedDps);
        sb.append(", rangedCrit=").append(rangedCrit);
        sb.append(", rangedCritRating=").append(rangedCritRating);
        sb.append(", rangedHitRating=").append(rangedHitRating);
        sb.append('}');
        return sb.toString();
    }
}
