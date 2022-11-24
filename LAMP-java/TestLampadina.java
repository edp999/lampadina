import java.util.Scanner;

public class TestLampadina {
    public static void test(int maxClick){
        Lampadina l  = new Lampadina(maxClick);
        for(int i=0; i<=maxClick; i++){
            Scanner scan = new Scanner(System.in);
            System.out.print("Click? Y/N:  ");
            String response = scan.next();
            if (response.equals("Y")){
                l.click();
                l.stato();
            }
            else if (response.equals("N")){
                l.stato();
                i-=1;
            }
            Scanner scan2 = new Scanner(System.in);
            System.out.print("Continue? Y/N:  ");
            String response2 = scan2.next();
            if (response2.equals("N")){
                break;
            }
        }
    }
    public static void main(String[] args) {
        test(5);
    }
    
}
