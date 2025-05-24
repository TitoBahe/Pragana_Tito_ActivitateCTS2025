package chainOfResponsability.classes;

public class Client {
    private String nume;
    private String email;
    private String SMS;

    public Client(String nume, String email, String SMS) {
        this.nume = nume;
        this.email = email;
        this.SMS = SMS;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", email='" + email + '\'' +
                ", SMS='" + SMS + '\'' +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSMS() {
        return SMS;
    }

    public void setSMS(String SMS) {
        this.SMS = SMS;
    }
}
