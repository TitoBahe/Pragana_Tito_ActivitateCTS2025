package factory.simple_factory.classes;

import singleton.registry.PachetTuristic;

public class PacheteCazareSiTransport implements PacheteTuristic {
    @Override
    public void descriere() {
        System.out.println("PacheteCazareSiTransport");
    }
}
