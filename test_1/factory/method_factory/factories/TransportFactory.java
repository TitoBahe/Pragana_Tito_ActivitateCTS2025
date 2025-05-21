package test_1.factory.method_factory.factories;

import test_1.factory.method_factory.classes.PacoteTuristico;
import test_1.factory.method_factory.classes.Recife;
import test_1.factory.method_factory.classes.TransportCaruaru;

public class TransportFactory implements  FactoryInterface{
    public PacoteTuristico getPacote(TransportEnum e) throws Exception {
        switch(e){
            case TransportCaruaru: return new TransportCaruaru();
            case TransportRecife: return new Recife();
            default: throw new Exception("pacote transport nao encontrado");
        }
    }
}
