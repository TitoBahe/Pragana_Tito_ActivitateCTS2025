package adapter.objectAdapter.masina;

public class MasinaInchiriata {
    private Masina masina;

    public MasinaInchiriata(Masina masina) {
        this.masina = masina;
    }

    public void masinaInchiriataInfo(){
        System.out.println("A fost inchiriata Masina: "+ masina.toString());
    }

    @Override
    public String toString() {
        return "MasinaInchiriata{" +
                "masina=" + masina.toString() +
                '}';
    }
}
