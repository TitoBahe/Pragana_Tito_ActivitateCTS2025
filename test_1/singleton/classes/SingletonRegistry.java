package test_1.singleton.classes;

import java.util.HashMap;
import java.util.Map;

public class SingletonRegistry {
    static Map<String, Praia> map = new HashMap<>();

    public static void register(String key, Praia p) throws Exception {
        if(map.containsKey(key)){
            throw new Exception("Key already registred");
        }
        else{
            map.put(key, p);
        }
    }
    public static Praia getValue(String key) throws Exception {
        if(map.containsKey(key)){
            return map.get(key);
        }
        else{
            throw new Exception("No Object with that key");
        }
    }
}
