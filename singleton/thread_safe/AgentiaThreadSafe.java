package singleton.thread_safe;

public class AgentiaThreadSafe {
    
    private String numeAgentie;
    private float capital;
    private int nrAngajati;
    
    private static AgentiaThreadSafe instanta = null;

    private AgentiaThreadSafe(String numeAgentie, float capital, int nrAngajati) {
        this.numeAgentie = numeAgentie;
        this.capital = capital;
        this.nrAngajati = nrAngajati;
    }

    public static synchronized AgentiaThreadSafe getIntanta(String numeAgentie, float capital, int nrAngajati){
        if(instanta == null){
            instanta = new AgentiaThreadSafe(numeAgentie, capital, nrAngajati);
        }
        return instanta;
    }

    @Override
    public String toString() {
        return "AgentiaThreadSafe{" +
                "numeAgentie='" + numeAgentie + '\'' +
                ", capital=" + capital +
                ", nrAngajati=" + nrAngajati +
                '}';
    }
}
