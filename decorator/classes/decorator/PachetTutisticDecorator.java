package decorator.classes.decorator;

import decorator.classes.cazare.PachetTuristic;

public abstract class PachetTutisticDecorator implements PachetTuristic {
    @Override
    public void descriere() {
        System.out.println("Descriere Pachet");
    }

    public abstract void anulareRezerva();
}
