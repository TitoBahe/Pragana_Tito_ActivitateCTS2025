package flyweight.classes;

public class Optional {
    private int nrExcursie;
    private boolean cinaInclusa;

    public Optional(int nrExcursie, boolean cinaInclusa) {
        this.nrExcursie = nrExcursie;
        this.cinaInclusa = cinaInclusa;
    }

    public int getNrExcursie() {
        return nrExcursie;
    }

    public void setNrExcursie(int nrExcursie) {
        this.nrExcursie = nrExcursie;
    }

    public boolean isCinaInclusa() {
        return cinaInclusa;
    }

    public void setCinaInclusa(boolean cinaInclusa) {
        this.cinaInclusa = cinaInclusa;
    }

    @Override
    public String toString() {
        return "Optional{" +
                "nrExcursie=" + nrExcursie +
                ", cinaInclusa=" + cinaInclusa +
                '}';
    }
}
