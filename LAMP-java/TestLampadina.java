

public class TestLampadina {
    public static void test(int maxClick){
        Lampadina l  = new Lampadina(maxClick);
        for(int i=0; i<=maxClick; i++){
            l.click();
            l.stato();
        }
    }

    public static void main(String[] args) {
        test(5);
    }
}
