package factory.simple_factory.classes;

public class AgentieSingletonFactory {
    private static AgentieSingletonFactory agentieSingletonFactory = null;

    private AgentieSingletonFactory(){}

    public static synchronized AgentieSingletonFactory getInstance(){
        if(agentieSingletonFactory == null){
            agentieSingletonFactory = new AgentieSingletonFactory();
        }
        return agentieSingletonFactory;
    }

    public PacheteTuristic createPachet(TipPachet tipPachet) throws Exception {
        switch(tipPachet){
            case PacheteCazare:
                return new PacheteCazare();
            case PacheteTransport:
                return new PacheteTransport();
            case PacheteCazareSiTransport:
                return new PacheteCazareSiTransport();
            default:
                throw new Exception("theres no type:" + tipPachet);
        }
    }
}
