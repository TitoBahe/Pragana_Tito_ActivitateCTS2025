package Façade.classes;

public class Zbor {
    private String destinatie;
    private String origin;
    private CompaniaAeriana companiaAeriana;

    public Zbor(String destinatie, CompaniaAeriana companiaAeriana, String origin) {
        this.destinatie = destinatie;
        this.companiaAeriana = companiaAeriana;
        this.origin = origin;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public CompaniaAeriana getCompaniaAeriana() {
        return companiaAeriana;
    }

    public void setCompaniaAeriana(CompaniaAeriana companiaAeriana) {
        this.companiaAeriana = companiaAeriana;
    }

    @Override
    public String toString() {
        return "Zbor{" +
                "destinatie='" + destinatie + '\'' +
                ", origin='" + origin + '\'' +
                ", companiaAeriana=" + companiaAeriana +
                '}';
    }
}
