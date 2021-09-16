package Players;

public class BasicInfo {
    //basic info
    public String nameOfChar;
    public String nameOfPlayer;
    public String claSS;
    public String race;
    public String background;
    public String alignment;
    public String languages;
    public int xp;
    public int lvl;
    public int hp;
    public int armorClass;


    public BasicInfo(String nameOfChar, String nameOfPlayer, String claSS, String race, String background,
                     String alignment, String languages, int xp, int lvl, int hp, int armorClass){
        this.nameOfChar = nameOfChar;
        this.nameOfPlayer = nameOfPlayer;
        this.claSS = claSS;
        this.race = race;
        this. background = background;
        this.alignment = alignment;
        this.languages = languages;
        this.xp = xp;
        this.lvl = lvl;
        this.hp = hp;
        this.armorClass = armorClass;

    }
    public String getNameOfChar() {return nameOfChar;}
    public void setNameOfChar(String nameOfChar) {this.nameOfChar = nameOfChar;}
    public String getNameOfPlayer() {return nameOfPlayer;}
    public void setNameOfPlayer(String nameOfPlayer) {this.nameOfPlayer = nameOfPlayer;}
    public String getClaSS() {return claSS;}
    public void setClaSS(String claSS) {this.claSS = claSS;}
    public String getRace() {return race;}
    public void setRace(String race) {this.race = race;}
    public String getBackground() {return background;}
    public void setBackground(String background) {this.background = background;}
    public String getAlignment() {return alignment;}
    public void setAlignment(String alignment) {this.alignment = alignment;}
    public int getXp() {return xp;}
    public void setXp(int xp) {this.xp = xp;}
    public int getLvl() {return lvl;}
    public void setLvl(int lvl) {this.lvl = lvl;}
    public int getHp() {return hp;}
    public void setHp(int hp) {this.hp = hp;}
    public int getArmorClass() {return armorClass;}
    public void setArmorClass(int armorClass) {this.armorClass = armorClass;}
    public String getLanguages() {return languages;}
    public void setLanguages(String languages) {this.languages = languages;
    }
}

