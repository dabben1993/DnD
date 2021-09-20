package Players;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Player {


    public BasicInfo basicInfo;
    public Attributes attributes;
    public Modifiers modifiers;
    public SavingThrows savingThrows;
    public Skills skills;
    public Traits traits;
    public Spells spells;
    public Inventory inventory;



    public Player(BasicInfo basicInfo, Attributes attributes, Modifiers modifiers, SavingThrows savingThrows,
                  Skills skills, Traits traits, Spells spells, Inventory inventory) {
        this.basicInfo = basicInfo;
        this.attributes = attributes;
        this.modifiers = modifiers;
        this.savingThrows = savingThrows;
        this.skills = skills;
        this.traits = traits;
        this.spells = spells;
        this.inventory = inventory;
    }

    public BasicInfo getBasicInfo() {return basicInfo;}
    public void setBasicInfo(BasicInfo basicInfo) {this.basicInfo = basicInfo;}
    public Attributes getAttributes() {return attributes;}
    public void setAttributes(Attributes attributes) {this.attributes = attributes;}
    public Modifiers getModifiers() {return modifiers;}
    public void setModifiers(Modifiers modifiers) {this.modifiers = modifiers;}
    public SavingThrows getSavingThrows() {return savingThrows;}
    public void setSavingThrows(SavingThrows savingThrows) {this.savingThrows = savingThrows;}
    public Skills getSkills() {return skills;}
    public void setSkills(Skills skills) {this.skills = skills;}
    public Traits getTraits() {return traits;}
    public void setTraits(Traits traits) {this.traits = traits;}
    public Spells getSpells() {return spells;}
    public void setSpells(Spells spells) {this.spells = spells;}
    public Inventory getInventory() {return inventory;}
    public void setInventory(Inventory inventory) {this.inventory = inventory;
    }
}
