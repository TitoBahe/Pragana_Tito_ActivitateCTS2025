package test_1.factory.method_factory.main;

import test_1.factory.method_factory.classes.PacoteTuristico;
import test_1.factory.method_factory.classes.TransportCaruaru;
import test_1.factory.method_factory.factories.TransportEnum;
import test_1.factory.method_factory.factories.TransportFactory;

public class Main {
    public static void main(String args[]) throws Exception {
        TransportFactory transportFactory = new TransportFactory();
        PacoteTuristico transportCaruaru = transportFactory.getPacote(TransportEnum.TransportCaruaru);
        System.out.println(transportCaruaru.toString());
    }
}
