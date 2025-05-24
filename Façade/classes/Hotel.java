package Façade.classes;

public class Hotel {
    private String numeHotel;


    public Hotel(String numeHotel) {
        this.numeHotel = numeHotel;
    }

    public void rezervareCamera(String oras){
        System.out.println("Camera a fost rezervata in oras");
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "numeHotel='" + numeHotel + '\'' +
                '}';
    }
}
