package ro.cts.registrySingleton;

public class Reglementare {
    private String model;
    private int nrReglementare;
    private String dataRelementare;

    protected Reglementare(String model, int nrReglementare, String dataRelementare) {
        this.model = model;
        this.nrReglementare = nrReglementare;
        this.dataRelementare = dataRelementare;
    }

    @Override
    public String toString() {
        return "Reglementare{" +
                "model='" + model + '\'' +
                ", nrReglementare=" + nrReglementare +
                ", dataRelementare='" + dataRelementare + '\'' +
                '}';
    }
}
