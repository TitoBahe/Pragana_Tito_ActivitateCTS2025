package singleton.singleton_enum;

public enum AgentieEnum {
    instanta;
    
    private int nrAngajati;
    private String nume;
    private float capital;

    private AgentieEnum() {
        this.nrAngajati = 1;
        this.nume = "tito";
        this.capital = 12.4f;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "AgentieEnum{" +
                "nrAngajati=" + nrAngajati +
                ", nume='" + nume + '\'' +
                ", capital=" + capital +
                '}';
    }
}
