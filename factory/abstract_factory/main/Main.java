package factory.abstract_factory.main;

import factory.abstract_factory.classes.CazareCategoria2;
import factory.abstract_factory.classes.PachetTuristic;
import factory.abstract_factory.factories.Categoria2;
import factory.abstract_factory.factories.Factory;

public class Main {
    public static void main(String args[]){
        Factory agent = new Categoria2();
        PachetTuristic cazare2= agent.createPachetCazare();
        cazare2.descriere();
    }
}
