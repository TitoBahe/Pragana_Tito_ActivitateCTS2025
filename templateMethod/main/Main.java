package templateMethod.main;


//TODO RESUMO


import templateMethod.classes.PachetCazare;
import templateMethod.classes.PachetTransport;
import templateMethod.classes.PachetTuristic;

//Vânzarea unui pachet turistic se realizează de fiecare data după un
//pattern bine stabilit:
// Se caută cazare;
// Se caută transport;
// Se rezervă întreg pachetul;
// Se vinde pachetul, prin realizarea plății.
//PALAVRA CHAVE: pattern bine stabilit. pas cu pas...
public class Main {
    public static void main(String[] args){
        PachetCazare pachetCazare = new PachetCazare(1);
        pachetCazare.terminaTot();
        PachetTransport pachetTransport = new PachetTransport(2);
        pachetTransport.terminaTot();
    }
}
