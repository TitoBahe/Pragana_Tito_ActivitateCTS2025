package factory.factory_method.main;

import factory.factory_method.classes.PachetTuristic;
import factory.factory_method.classes.TipCazare;
import factory.factory_method.classes.TipTransport;
import factory.factory_method.classes.TipTuristic;
import factory.factory_method.factories.CazareFactory;
import factory.factory_method.factories.TransportFactory;

public class Main {
    public static void main(String args[]){
        CazareFactory cazareFactory = new CazareFactory();
        TransportFactory transportFactory = new TransportFactory();

        PachetTuristic pachetTuristic = null;
        try{
            pachetTuristic = cazareFactory.getPachet(TipCazare.hotel);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        pachetTuristic.descriere();

        try{
            pachetTuristic = transportFactory.getPachet(TipTransport.Autobuz);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        pachetTuristic.descriere();
    }
}
