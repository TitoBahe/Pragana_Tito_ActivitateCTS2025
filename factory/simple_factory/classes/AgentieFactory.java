package factory.simple_factory.classes;

import singleton.registry.PachetTuristic;

public class AgentieFactory {
    public PacheteTuristic createPachet(TipPachet tipPachet) throws Exception {
        switch(tipPachet){
            case PacheteCazare:
                return new PacheteCazare();
            case PacheteTransport:
                return new PacheteTransport();
            case PacheteCazareSiTransport:
                return new PacheteCazareSiTransport();
            default:
                throw new Exception("Theres no type: " + tipPachet);
        }
    }
}
