package singleton.registry;

import java.util.HashMap;
import java.util.Map;

public class RegistrySingleton {
    private RegistrySingleton(){}

    static Map<String, PachetTuristic> collection= new HashMap<>();

    public static void register(String name, PachetTuristic pachetTuristic) throws Exception {
        if(collection.containsKey(name)){
            throw new Exception("Key" + name + "Already exists");
        }
        else{
            collection.put(name, pachetTuristic);
        }
    }
    public static PachetTuristic getPachet(String name){ return collection.get(name);}
}
