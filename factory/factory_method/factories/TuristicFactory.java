package factory.factory_method.factories;

import factory.factory_method.classes.PachetTuristic;
import factory.factory_method.classes.TipTuristic;

public interface TuristicFactory {
    PachetTuristic getPachet(TipTuristic tipTuristic) throws Exception;
}
