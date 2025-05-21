package test_1.factory.method_factory.factories;

import test_1.factory.method_factory.classes.PacoteTuristico;

public interface FactoryInterface {
    public PacoteTuristico getPacote(TransportEnum e) throws Exception;
}
