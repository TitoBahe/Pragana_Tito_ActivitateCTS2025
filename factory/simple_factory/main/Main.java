package factory.simple_factory.main;

import factory.simple_factory.classes.*;

public class Main {
    public static void main(String args[]){

        //simple factory
        AgentieFactory agentieFactory = new AgentieFactory();
        PacheteTuristic pacheteTuristic = null;
        try{
            pacheteTuristic = agentieFactory.createPachet(TipPachet.PacheteCazareSiTransport);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        pacheteTuristic.descriere();

        //simple factory singleton
        AgentieSingletonFactory agentieSingletonFactory = AgentieSingletonFactory.getInstance();
        try{
            pacheteTuristic = agentieSingletonFactory.createPachet(TipPachet.PacheteCazare);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        pacheteTuristic.descriere();
    }
}
