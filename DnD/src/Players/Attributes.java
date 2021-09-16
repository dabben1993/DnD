package Players;

public class Attributes {
    //Attributes
    public int strength;
    public int dexterity;
    public int constitution;
    public int intelligence;
    public int wisdom;
    public int charisma;
    public int perception;


    public Attributes (int str, int dex, int cons, int intel, int wis, int cha, int perc){
        this.strength = str;
        this.dexterity = dex;
        this.constitution = cons;
        this.intelligence = intel;
        this.wisdom = wis;
        this.charisma = cha;
        this.perception = perc;
    }
    public int getStrength() {return strength;}
    public void setStrength(int strength) {this.strength = strength;}
    public int getDexterity() {return dexterity;}
    public void setDexterity(int dexterity) {this.dexterity = dexterity;}
    public int getConstitution() {return constitution;}
    public void setConstitution(int constitution) {this.constitution = constitution;}
    public int getIntelligence() {return intelligence;}
    public void setIntelligence(int intelligence) {this.intelligence = intelligence;}
    public int getWisdom() {return wisdom;}
    public void setWisdom(int wisdom) {this.wisdom = wisdom;}
    public int getCharisma() {return charisma;}
    public void setCharisma(int charisma) {this.charisma = charisma;}
    public int getPerception() {return perception;}
    public void setPerception(int perception) {this.perception = perception;}

}
