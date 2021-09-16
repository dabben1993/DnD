package Players;

public class SavingThrows {
    //saving throws
    public int savingStr;
    public int savingDex;
    public int savingConst;
    public int savingInt;
    public int savingWis;
    public int savingCha;



    public SavingThrows(int str, int dex, int cons, int intel, int wis, int cha){
    this.savingStr = str;
    this.savingDex = dex;
    this.savingConst = cons;
    this.savingInt = intel;
    this.savingWis = wis;
    this.savingCha = cha;
    }
    public int getSavingStr() {return savingStr;}
    public void setSavingStr(int savingStr){this.savingStr = savingStr;}
    public int getSavingDex() {return savingDex;}
    public void setSavingDex(int savingDex) {this.savingDex = savingDex;}
    public int getSavingConst() {return savingConst;}
    public void setSavingConst(int savingConst) {this.savingConst = savingConst;}
    public int getSavingInt() {return savingInt;}
    public void setSavingInt(int savingInt) {this.savingInt = savingInt;}
    public int getSavingWis() {return savingWis;}
    public void setSavingWis(int savingWis) {this.savingWis = savingWis;}
    public int getSavingCha() {return savingCha;}
    public void setSavingCha(int savingCha) {this.savingCha = savingCha;}
}
