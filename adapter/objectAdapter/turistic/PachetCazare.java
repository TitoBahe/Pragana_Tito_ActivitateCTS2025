package adapter.objectAdapter.turistic;

public class PachetCazare implements PacheteTuristic {
    @Override
    public void descriere() {
        System.out.println("Pachete Cazare Descriere....");
    }

    @Override
    public void rezervaPachet() {
        System.out.println("Pachet Cazare rezervare...");
    }
}
