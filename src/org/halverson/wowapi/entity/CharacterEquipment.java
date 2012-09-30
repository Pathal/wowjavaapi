/*
 * Copyright (c) 2011 Chris D. Halverson <cdh@halverson.org>
 * Updated by Pathal of EJ.
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
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Class holding a character's armor and weapons.
 *
 */
public class CharacterEquipment {
    private int averageItemLevel;
    private int averageItemLevelEquipped;
    private CharacterItem head;
    private CharacterItem neck;
    private CharacterItem shoulder;
    private CharacterItem back;
    private CharacterItem chest;
    private CharacterItem shirt;
    private CharacterItem wrist;
    private CharacterItem hands;
    private CharacterItem waist;
    private CharacterItem legs;
    private CharacterItem feet;
    private CharacterItem finger1;
    private CharacterItem finger2;
    private CharacterItem trinket1;
    private CharacterItem trinket2;
    private CharacterItem mainHand;
    private CharacterItem offHand;

    
    public ArrayList<CharacterItem> getAllItems(){
    	ArrayList<CharacterItem> tmpArray = new ArrayList<CharacterItem>();
    	tmpArray.add(head);
    	tmpArray.add(neck);
    	tmpArray.add(shoulder);
    	tmpArray.add(back);
    	tmpArray.add(chest);
    	tmpArray.add(wrist);
    	tmpArray.add(hands);
    	tmpArray.add(waist);
    	tmpArray.add(legs);
    	tmpArray.add(feet);
    	tmpArray.add(finger1);
    	tmpArray.add(finger2);
    	tmpArray.add(trinket1);
    	tmpArray.add(trinket2);
    	tmpArray.add(mainHand);
    	tmpArray.add(offHand);
    	
		return tmpArray;
    }
    public CharacterItem getItemFromSlot(int i){
    	if (i == 1){
    		return head;
    	} else if (i == 2) {
    		return neck;
    	} else if (i == 3) {
    		return shoulder;
    	} else if (i == 4) {
    		return shirt;
    	} else if (i == 5) {
    		return chest;
    	} else if (i == 6) {
    		return waist;
    	} else if (i == 7) {
    		return legs;
    	} else if (i == 8) {
    		return feet;
    	} else if (i == 9) {
    		return wrist;
    	} else if (i == 10) {
    		return hands;
    	} else if (i == 11) {
    		return finger1;
    	} else if (i == 12) {
    		return finger2;
    	} else if (i == 13) {
    		return trinket1;
    	} else if (i == 14) {
    		return trinket2;
    	} else if (i == 15) {
    		return back;
    	} else if (i == 16) {
    		return mainHand;
    	} else if (i == 17) {
    		return offHand;
    	}
    	return null;
    }
    public int getAverageItemLevel() {
        return averageItemLevel;
    }
    @XmlElement
    public void setAverageItemLevel(int averageItemLevel) {
        this.averageItemLevel = averageItemLevel;
    }

    public int getAverageItemLevelEquipped() {
        return averageItemLevelEquipped;
    }
    @XmlElement
    public void setAverageItemLevelEquipped(int averageItemLevelEquipped) {
        this.averageItemLevelEquipped = averageItemLevelEquipped;
    }

    public CharacterItem getHead() {
        return head;
    }
    @XmlElement
    public void setHead(CharacterItem head) {
        this.head = head;
    }

    public CharacterItem getNeck() {
        return neck;
    }
    @XmlElement
    public void setNeck(CharacterItem neck) {
        this.neck = neck;
    }

    public CharacterItem getShoulder() {
        return shoulder;
    }
    @XmlElement
    public void setShoulder(CharacterItem shoulder) {
        this.shoulder = shoulder;
    }

    public CharacterItem getBack() {
        return back;
    }
    @XmlElement
    public void setBack(CharacterItem back) {
        this.back = back;
    }

    public CharacterItem getChest() {
        return chest;
    }
    @XmlElement
    public void setChest(CharacterItem chest) {
        this.chest = chest;
    }

    public CharacterItem getShirt() {
        return shirt;
    }
    @XmlElement
    public void setShirt(CharacterItem shirt) {
        this.shirt = shirt;
    }

    public CharacterItem getWrist() {
        return wrist;
    }
    @XmlElement
    public void setWrist(CharacterItem wrist) {
        this.wrist = wrist;
    }

    public CharacterItem getHands() {
        return hands;
    }
    @XmlElement
    public void setHands(CharacterItem hands) {
        this.hands = hands;
    }

    public CharacterItem getWaist() {
        return waist;
    }
    @XmlElement
    public void setWaist(CharacterItem waist) {
        this.waist = waist;
    }

    public CharacterItem getLegs() {
        return legs;
    }
    @XmlElement
    public void setLegs(CharacterItem legs) {
        this.legs = legs;
    }

    public CharacterItem getFeet() {
        return feet;
    }
    @XmlElement
    public void setFeet(CharacterItem feet) {
        this.feet = feet;
    }

    public CharacterItem getFinger1() {
        return finger1;
    }
    @XmlElement
    public void setFinger1(CharacterItem finger1) {
        this.finger1 = finger1;
    }

    public CharacterItem getFinger2() {
        return finger2;
    }
    @XmlElement
    public void setFinger2(CharacterItem finger2) {
        this.finger2 = finger2;
    }

    public CharacterItem getTrinket1() {
        return trinket1;
    }
    @XmlElement
    public void setTrinket1(CharacterItem trinket1) {
        this.trinket1 = trinket1;
    }

    public CharacterItem getTrinket2() {
        return trinket2;
    }
    @XmlElement
    public void setTrinket2(CharacterItem trinket2) {
        this.trinket2 = trinket2;
    }

    public CharacterItem getMainHand() {
        return mainHand;
    }
    @XmlElement
    public void setMainHand(CharacterItem mainHand) {
        this.mainHand = mainHand;
    }

    public CharacterItem getOffHand() {
        return offHand;
    }
    @XmlElement
    public void setOffHand(CharacterItem offHand) {
        this.offHand = offHand;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CharacterEquipment");
        sb.append("{averageItemLevel=").append(averageItemLevel);
        sb.append(", averageItemLevelEquipped=").append(averageItemLevelEquipped);
        sb.append(", head=").append(head);
        sb.append(", neck=").append(neck);
        sb.append(", shoulder=").append(shoulder);
        sb.append(", back=").append(back);
        sb.append(", chest=").append(chest);
        sb.append(", shirt=").append(shirt);
        sb.append(", wrist=").append(wrist);
        sb.append(", hands=").append(hands);
        sb.append(", waist=").append(waist);
        sb.append(", legs=").append(legs);
        sb.append(", feet=").append(feet);
        sb.append(", finger1=").append(finger1);
        sb.append(", finger2=").append(finger2);
        sb.append(", trinket1=").append(trinket1);
        sb.append(", trinket2=").append(trinket2);
        sb.append(", mainHand=").append(mainHand);
        sb.append(", offHand=").append(offHand);
        sb.append('}');
        return sb.toString();
    }
}
