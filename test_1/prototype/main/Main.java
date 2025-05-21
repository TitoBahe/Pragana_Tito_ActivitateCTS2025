package test_1.prototype.main;

import test_1.prototype.classes.ListaAbstract;
import test_1.prototype.classes.ListaOferte;

public class Main {
    public static void main(String args[]){
        ListaOferte lf = new ListaOferte();
        lf.citeste();
        ListaAbstract la = lf.copiaza();
        System.out.println(la.toString());

    }
}
