package prototype.main;

import prototype.classes.ListaOferte;
import prototype.classes.Oferte;

public class Main {
    public static void main(String args[]){
        ListaOferte lista = new ListaOferte();
        lista.citesteLista("oferte.txt");
        Oferte lista_2 = lista.copieaza();
        System.out.println(lista_2.toString());
    }
}
