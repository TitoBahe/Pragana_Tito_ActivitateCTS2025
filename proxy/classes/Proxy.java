package proxy.classes;

public class Proxy {
    private Persoana persoana;

    public Proxy(Persoana persoana) {
        this.persoana = persoana;
    }

    public void descreiere(){
        if(persoana.getVarsta() >= 50){
            System.out.println(persoana);
        }
    }
}
