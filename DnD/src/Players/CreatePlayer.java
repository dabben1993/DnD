
package Players;

import java.util.Scanner;

public class CreatePlayer {

    public void createPlayer(){
        public Object createBasicInfo(){

            Scanner in = new Scanner(System.in);
            System.out.println("Skriv in karaktärens namn");
            String nameOfChar = in.next();
            System.out.println("Skriv in spelarens namn");
            String nameOfPlayer = in.next();
            System.out.println("Skriv in karaktärens klass");
            String claSS = in.next();
            System.out.println("Skriv in karaktärens bakgrund");
            String background = in.next();
            System.out.println("Skriv in karaktärens alignment");
            String alignment = in.next();
            System.out.println("Skriv in vilka språk karaktären pratar");
            String languages = in.next();
            System.out.println("Skriv in karaktärens xp");
            int xp = in.nextInt();
            System.out.println("Skriv in karaktärens level");
            int lvl = in.nextInt();
            System.out.println("Skriv in karaktärens hp");
            int hp = in.nextInt();
            System.out.println("Skriv in karaktärens armor class");
            int AC = in.nextInt();
            BasicInfo basicInfo = new BasicInfo(nameOfChar,nameOfPlayer,claSS,background,
                    alignment,languages,xp,lvl,hp,AC);
        }
    }
}
