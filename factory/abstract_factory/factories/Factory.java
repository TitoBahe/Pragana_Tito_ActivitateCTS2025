package factory.abstract_factory.factories;

import factory.simple_factory.classes.PacheteCazare;
import factory.simple_factory.classes.PacheteTransport;
import factory.abstract_factory.classes.PachetTuristic;

public interface Factory {
    PachetTuristic createPachetCazare();
    PachetTuristic createPachetTransport();
}
