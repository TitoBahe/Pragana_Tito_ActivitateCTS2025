package test_1.factory.simple_factory.main;

import test_1.factory.simple_factory.classes.Cidades;
import test_1.factory.simple_factory.classes.CidadesEnum;
import test_1.factory.simple_factory.classes.SimpleFactory;


public class Main {
    public static void main(String args[]) {
        SimpleFactory factory = new SimpleFactory();
        try{
            Cidades c = factory.getCidade(CidadesEnum.Recife);
            System.out.println(c.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
