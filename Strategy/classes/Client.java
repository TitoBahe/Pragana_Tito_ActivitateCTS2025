package Strategy.classes;

public class Client {
    private String nume;
    private ModPlata modPlata;

    public Client(String nume) {
        this.nume = nume;
        this.modPlata = new Card();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public ModPlata getModPlata() {
        return modPlata;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", modPlata=" + modPlata +
                '}';
    }
}
