package factory.simple_factory.classes;

import singleton.registry.PachetTuristic;

public class PacheteCazare implements PacheteTuristic {
    @Override
    public void descriere() {
        System.out.println("PacheteCazare");
    }
}
