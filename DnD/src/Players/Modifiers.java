package Players;

public class Modifiers {
    //modifiers
    public int strMod;
    public int dextMod;
    public int constMod;
    public int intMod;
    public int wisMod;
    public int chaMod;



    public Modifiers (int str, int dex, int cons, int intel, int wis, int cha){
        this.strMod = str;
        this.dextMod = dex;
        this.constMod = cons;
        this.intMod = intel;
        this.wisMod = wis;
        this.chaMod = cha;
    }
    public int getStrMod() {return strMod;}
    public void setStrMod(int strMod) {this.strMod = strMod;}
    public int getDextMod() {return dextMod;}
    public void setDextMod(int dextMod) {this.dextMod = dextMod;}
    public int getConstMod() {return constMod;}
    public void setConstMod(int constMod) {this.constMod = constMod;}
    public int getIntMod() {return intMod;}
    public void setIntMod(int intMod) {this.intMod = intMod;}
    public int getWisMod() {return wisMod;}
    public void setWisMod(int wisMod) {this.wisMod = wisMod;}
    public int getChaMod() {return chaMod;}
    public void setChaMod(int chaMod) {this.chaMod = chaMod;}
}
