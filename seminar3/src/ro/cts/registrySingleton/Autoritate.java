package ro.cts.registrySingleton;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Autoritate {
    private String nume;
    private String webSite;
    private Map<String, Reglementare> map = new HashMap<>();
    private static Autoritate autoritate = null;

    private Autoritate(String nume, String website){
        this.nume = nume;
        this.webSite = website;
    }

    public static Autoritate getInstance(String nume, String website){
        if(autoritate == null){
            autoritate = new Autoritate(nume, website);
        }
        return autoritate;
    }
    @Override
    public String toString() {
        return "Autoritate{" +
                "nume='" + nume + '\'' +
                ", webSite='" + webSite + '\'' +
                '}';
    }

    public Reglementare reglementareModel(String model){
        if(!map.containsKey(model)){
            map.put(model, new Reglementare(model, map.size()+1, (new Date()).toString()));
        }
        return map.get(model);
    }
}
