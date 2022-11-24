import java.util.*;

public class TestInterruttore{

    
    public static Interruttore newSwitch(Lampadina lamp){
        Interruttore S = new Interruttore(lamp);
        return S;
    }

    public static void useSwitch(Interruttore s1, Interruttore s2){
        boolean prosegui=true;
        Interruttore S = new Interruttore(null);
        while(prosegui==true){
            Scanner scan0 = new Scanner(System.in);
            System.out.print("Choose switch! A/B  ");
            String chosen = scan0.next();

            if(chosen.equals("A")){
                S = s1;
            }
            else if(chosen.equals("B")){
                S = s2;
            }

            Scanner scan = new Scanner(System.in);
            System.out.print("Click? Y/N:  ");
            String response = scan.next();
            if (response.toLowerCase().equals("y")){
                S.lamp.click();
                S.lamp.stato();
            }
            else if (response.toLowerCase().equals("n")){
                S.lamp.stato();
            }
            Scanner scan2 = new Scanner(System.in);
            System.out.print("Continue? Y/N:  ");
            String response2 = scan2.next();
            if (response2.toLowerCase().equals("n")){
                prosegui=false;
            }
        }
    }

    public static void main(String[] args) {
        Lampadina l = new Lampadina(5);
        useSwitch(newSwitch(l), newSwitch(l));


    }
}