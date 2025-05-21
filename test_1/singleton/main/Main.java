package test_1.singleton.main;

import test_1.singleton.classes.Cidade;
import test_1.singleton.classes.Praia;
import test_1.singleton.classes.SingletonRegistry;

public class Main {
    public static void main(String args[]){
        Cidade c = Cidade.getInstanta("macacos", 100);
        System.out.println(c.toString());

        Praia p = Praia.getPraiaInstanta("boa viagem");
        try{
            SingletonRegistry.register("praia", p);
            Praia p_2 = SingletonRegistry.getValue("praia");
            System.out.println(p_2.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
