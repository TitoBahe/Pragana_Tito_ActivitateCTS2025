package ro.cts.model.personal;

public abstract class Persoana implements IPersoana {

    protected String nume;
    protected int varsta;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public int getVarsta() {
        return 0;
    }

    public abstract float calculareVenit();
}
