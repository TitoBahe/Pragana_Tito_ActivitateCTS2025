package Observer.classes.agentie;

import Observer.classes.observers.Iobservers;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements Iagentie{
    private List<Iobservers> lista;

    public Agentie() {
        this.lista = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Agentie{" +
                "lista=" + lista +
                '}';
    }

    @Override
    public void adaugaObserver(Iobservers iobservers) {
        lista.add(iobservers);
    }

    @Override
    public void stergeObserver(Iobservers iobservers) {
        lista.remove(iobservers);
    }

    @Override
    public void trimiteNotificare() {
        for(var observer : lista){
            observer.observat();
        }
    }
}
