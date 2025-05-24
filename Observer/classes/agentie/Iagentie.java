package Observer.classes.agentie;

import Observer.classes.observers.Iobservers;

public interface Iagentie {
    void adaugaObserver(Iobservers iobservers);
    void stergeObserver(Iobservers iobservers);
    void trimiteNotificare();
}
