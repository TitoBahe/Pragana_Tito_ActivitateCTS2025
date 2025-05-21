package factory.factory_method.factories;

import factory.factory_method.classes.PachetTuristic;
import factory.factory_method.classes.TipTransport;
import factory.factory_method.classes.TipTuristic;
import factory.factory_method.classes.TransportAutobuz;

public class TransportFactory implements TuristicFactory{
    @Override
    public PachetTuristic getPachet(TipTuristic tipTuristic) throws Exception {
        switch(tipTuristic){
            case TipTransport.Autobuz:
                return new TransportAutobuz();
            default:
                throw new Exception("Type not suitable in TransportFatcory");
        }
    }
}
