package adapter.objectAdapter.turistic;


import adapter.objectAdapter.masina.MasinaInchiriata;

public class MasinaInchiriataAdapter implements PacheteTuristic {

    private MasinaInchiriata masinaInchiriata;

    public MasinaInchiriataAdapter(MasinaInchiriata masinaInchiriata) {
        this.masinaInchiriata = masinaInchiriata;
    }

    @Override
    public void descriere() {
        masinaInchiriata.masinaInchiriataInfo();
    }

    @Override
    public void rezervaPachet() {
        System.out.println(masinaInchiriata.toString());
    }
}
