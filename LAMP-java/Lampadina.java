public class Lampadina{
    // attributi
    boolean accesa;
    boolean funzionante;
    int numClick;
    int maxClick;

    // constr

    public Lampadina(int maxClick){
        this.accesa = false;
        this.funzionante = true;
        this.numClick=0;
        this.maxClick=maxClick;
    }

    // metodi

    public String stato(){
        String stato = "";
        if (this.accesa == true){
            stato += "Accesa, ";
        }
        else{
            stato+= "Spenta, ";
        }

        if (this.funzionante==true){
            stato += "Funzionante.";
        }
        else{
            stato+= "Rotta.";
        }
        System.out.println(stato);
        return(stato);
    }

    public void click(){
        this.numClick+=1;
        if(this.numClick<this.maxClick){
            this.accesa=(!this.accesa);
        }
        else{
            this.funzionante=false;
        }
        
    }
}