package templateMethod.classes;

public abstract class PachetTuristic {
    private int codPachet;

    public PachetTuristic(int codPachet) {
        this.codPachet = codPachet;
    }

    public int getCodPachet() {
        return codPachet;
    }

    public void setCodPachet(int codPachet) {
        this.codPachet = codPachet;
    }

    abstract void cautaCazare();
    abstract void cautaTransport();
    abstract void rezervaPachet();
    abstract void vindePachet();

    public final void terminaTot(){
        cautaCazare();
        cautaTransport();
        rezervaPachet();
        vindePachet();
    }

    @Override
    public String toString() {
        return "PachetTuristic{" +
                "codPachet=" + codPachet +
                '}';
    }
}
