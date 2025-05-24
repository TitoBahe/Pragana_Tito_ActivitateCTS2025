package flyweight.classes;

public class PachetTuristicClass implements PachetTuristic{
    private String hotel;
    private String destinatie;
    private boolean micDejun;

    public PachetTuristicClass(String hotel, String destinatie, boolean micDejun) {
        this.hotel = hotel;
        this.destinatie = destinatie;
        this.micDejun = micDejun;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public boolean isMicDejun() {
        return micDejun;
    }

    public void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    @Override
    public String toString() {
        return "PachetTuristicClass{" +
                "hotel='" + hotel + '\'' +
                ", destinatie='" + destinatie + '\'' +
                ", micDejun=" + micDejun +
                '}';
    }

    @Override
    public void descriere(Optional optional) {
        System.out.println("Descriere Pachete Turistic Class...." + optional.toString());
    }
}
