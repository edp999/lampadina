import java.util.*;

public class TestLampadina {
    
    public static void test(int maxClick){
        Lampadina l  = new Lampadina(maxClick);

        for(int i=0; i<=maxClick; i++){ //ci andrebbe un while continue==true ma lo faccio bene su TestInterruttore che è molto simile
            Scanner scan = new Scanner(System.in);
            System.out.print("Click? Y/N:  ");
            String response = scan.next();
            if (response.toLowerCase().equals("y")){
                l.click();
                l.stato();
            }
            else if (response.toLowerCase().equals("n")){
                l.stato();
                i-=1;
            }
            Scanner scan2 = new Scanner(System.in);
            System.out.print("Continue? Y/N:  ");
            String response2 = scan2.next();
            if (response2.toLowerCase().equals("n")){
                break;
            }
        }
    }
    
    
}
