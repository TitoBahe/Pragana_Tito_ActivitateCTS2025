package proxy.classes;

import flyweight.classes.Optional;
import flyweight.classes.PachetTuristic;

public class Persoana implements PachetTuristic {
    private String nume;
    private int varsta;


    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }

    @Override
    public void descriere(Optional optional) {

    }
}
