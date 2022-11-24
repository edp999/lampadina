public class Interruttore {
    // attributi
    boolean ON;
    Lampadina lamp;

    // costruttore

    public Interruttore(Lampadina lamp){
        this.ON = false;
        this.lamp = lamp;
    }

    // metodo

    public void flick(){
        this.ON=(!this.ON);
        this.lamp.click();
    }
}
