package ro.cts.clase;

public class AutoritatereglementareMasiniEager {
    private String nume;
    private String website;
    private int nrReglementari;
    private static AutoritatereglementareMasiniEager instace = new AutoritatereglementareMasiniEager("AutoritateAuto", "www.autoritate", 123);


    private AutoritatereglementareMasiniEager(String nume, String website, int nrReglementari) {
        this.nume = nume;
        this.website = website;
        this.nrReglementari = nrReglementari;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void reglementeazaModel(String nume) {
        nrReglementari = nrReglementari + 1;
    }

    public static synchronized AutoritatereglementareMasiniEager getInstance() {
        return instace;
    }


    @Override
    public String toString() {
        return "AutoritatereglementareMasiniEager{" +
                "nume='" + nume + '\'' +
                ", website='" + website + '\'' +
                ", nrReglementari=" + nrReglementari +
                '}';
    }
}
