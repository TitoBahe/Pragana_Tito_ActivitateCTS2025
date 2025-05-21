package factory.abstract_factory.factories;

import factory.abstract_factory.classes.CazareCategoria1;
import factory.abstract_factory.classes.TransportCategoria1;
import factory.abstract_factory.classes.PachetTuristic;


public class Categoria1 implements Factory{

    @Override
    public PachetTuristic createPachetCazare() {
        return new CazareCategoria1();
    }

    @Override
    public PachetTuristic createPachetTransport() {
        return new TransportCategoria1();
    }
}
