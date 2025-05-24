package Observer.classes.observers;

public class Observer implements Iobservers{
    private String nume;

    public Observer(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Observer{" +
                "nume='" + nume + '\'' +
                '}';
    }

    @Override
    public void observat() {
        System.out.println("Observer "+ nume +" a primit mesaj");
    }
}
