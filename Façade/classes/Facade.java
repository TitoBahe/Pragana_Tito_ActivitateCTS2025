package Façade.classes;

public class Facade {
    public void rezervaPachetCazareTransport(String destinatie, String origine){
        CompaniaAeriana companiaAeriana = new CompaniaAeriana("Wizz");
        Zbor zborDus = companiaAeriana.rezervaBilet(destinatie, origine);
        Zbor zborIntors = companiaAeriana.rezervaBilet(origine, destinatie);
        Hotel hotel = new Hotel("1 start hotel");

        hotel.rezervareCamera(destinatie);
        System.out.println(companiaAeriana);
        System.out.println(zborDus);
        System.out.println(zborIntors);
        System.out.println(hotel);
    }



}
