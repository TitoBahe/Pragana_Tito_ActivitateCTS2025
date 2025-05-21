package factory.factory_method.factories;

import factory.factory_method.classes.*;

public class CazareFactory implements TuristicFactory{

    @Override
    public PachetTuristic getPachet(TipTuristic tipTuristic) throws Exception {
        switch (tipTuristic){
            case TipCazare.cabana:
                return new CazareCabana();
            case TipCazare.hotel:
                return new CazareHotel();
            default:
                throw new Exception("Tyoe not suitable in CazareFactory");
        }
    }
}
