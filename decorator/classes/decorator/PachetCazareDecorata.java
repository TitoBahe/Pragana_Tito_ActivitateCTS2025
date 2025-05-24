package decorator.classes.decorator;

public class PachetCazareDecorata extends PachetTutisticDecorator{
    @Override
    public void anulareRezerva() {
        System.out.println("rezerva a fost anulata");
    }
}
