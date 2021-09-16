package Players;

public class Inventory {
    public int cp, sp, gp;

    public Inventory(int cp, int sp, int gp) {
        this.cp = cp;
        this.sp = sp;
        this.gp = gp;
    }

    public int getCp() {return cp;}
    public void setCp(int cp) {this.cp = cp;}
    public int getSp() {return sp;}
    public void setSp(int sp) {this.sp = sp;}
    public int getGp() {return gp;}
    public void setGp(int gp) {this.gp = gp;}
}
