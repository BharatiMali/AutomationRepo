package polymerphism;

import java.security.PublicKey;

public class MethodoverridingPen extends Methodoverriding {
    public void Pen( String name){
        System.out.println(" Pen" + name +" Hight Requiment");

    }
    public static void main(String [] args){
        MethodoverridingPen test1 = new MethodoverridingPen();
        test1.Pen( "Cello");
        test1.Pen("Trimix");


    }


}
