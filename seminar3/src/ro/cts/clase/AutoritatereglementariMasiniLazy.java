package ro.cts.clase;

public class AutoritatereglementariMasiniLazy {
    private String nume;
    private String website;
    private int nrReglementari;
    private static AutoritatereglementariMasiniLazy instace = null;


    private AutoritatereglementariMasiniLazy(String nume, String website, int nrReglementari) {
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

    public static synchronized AutoritatereglementariMasiniLazy getInstance(String nume, String website) {
        if(instace==null){
            instace = new AutoritatereglementariMasiniLazy(nume, website, 0);
        }
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
