package Observer.main;

//Observer definește o relație de “1 : n”, în care un subiect notifică mai mulți
//observeri.
// Acest design pattern este folosit atunci când anumite elemente (obiecte)
//trebuie să fie anunțate de schimbarea stării altor obiecte.

import Observer.classes.agentie.Agentie;
import Observer.classes.agentie.Iagentie;
import Observer.classes.observers.Iobservers;
import Observer.classes.observers.Observer;

//Agenția de turism dorește să anunțe clienții fideli ori de câte ori apar noi
//oferte. Astfel se dorește implementarea unui modul care atunci când se
//realizează o ofertă de preț sau se introduce un nou pachet să se trimită
//notificări tuturor clienților abonați la notificările agenției de turism.
public class Main {
    public static void main(String[] args){
        Iobservers observer = new Observer("tito");
        Iobservers observer2 = new Observer("paulo");
        Iobservers observer3 = new Observer("andrei");
        Iagentie agentie = new Agentie();
        agentie.adaugaObserver(observer);
        agentie.adaugaObserver(observer2);
        agentie.adaugaObserver(observer3);
        agentie.trimiteNotificare();
    }
}
