package Façade.classes;

public class CompaniaAeriana {
    private String nume;

    public CompaniaAeriana(String nume) {
        this.nume = nume;
    }

    public Zbor rezervaBilet(String destinatie, String origin){
        return new Zbor(destinatie, this, origin);
    }
}
