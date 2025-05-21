package factory.abstract_factory.factories;

import factory.abstract_factory.classes.CazareCategoria2;
import factory.abstract_factory.classes.PachetTuristic;
import factory.abstract_factory.classes.TransportCategoria2;


public class Categoria2 implements Factory{
    @Override
    public PachetTuristic createPachetCazare() {
        return new CazareCategoria2();
    }

    @Override
    public PachetTuristic createPachetTransport() {
        return new TransportCategoria2();
    }
}
