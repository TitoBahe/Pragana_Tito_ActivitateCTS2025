package singleton.serializable;

import singleton.thread_safe.AgentiaThreadSafe;

import java.io.Serializable;

public class AgentiaSerializable implements Serializable {
    private int nrAngajati;
    private String nume;
    private float capital;

    private static AgentiaSerializable agentiaSerializable = null;

    private AgentiaSerializable(int nrAngajati, String nume, float capital) {
        this.nrAngajati = nrAngajati;
        this.nume = nume;
        this.capital = capital;
    }

    public static synchronized AgentiaSerializable getInstance(int nrAngajati, String nume, float capital){
        if(agentiaSerializable == null){
            agentiaSerializable = new AgentiaSerializable(nrAngajati, nume, capital);
        }
        return agentiaSerializable;
    }

    @Override
    public String toString() {
        return "AgentiaSerializable{" +
                "nrAngajati=" + nrAngajati +
                ", nume='" + nume + '\'' +
                ", capital=" + capital +
                '}';
    }
}
