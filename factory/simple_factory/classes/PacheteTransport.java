package factory.simple_factory.classes;

import singleton.registry.PachetTuristic;

public class PacheteTransport implements PacheteTuristic {
    @Override
    public void descriere() {
        System.out.println("PacheteTransport");
    }
}
