package adapter.classAdapter.turistic;

import adapter.classAdapter.masina.Masina;
import adapter.classAdapter.masina.MasinaInchiriata;

public class MasinaInchiriataAdapter extends MasinaInchiriata implements PacheteTuristic{

    public MasinaInchiriataAdapter(Masina masina) {
        super(masina);
    }

    @Override
    public void descriere() {
        System.out.println("Masina Inchiriata Adater Descriere");
    }

    @Override
    public void rezervaPachet() {
        System.out.println("Masina Inchiriata rezervata");
    }
}
