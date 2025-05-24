package flyweight.classes;

import java.util.HashMap;
import java.util.Map;

public class PacheteTuristiceFabric {
    Map<Integer, PachetTuristic> map;

    public PacheteTuristiceFabric() {
        this.map = new HashMap<>();
    }

    public PachetTuristic getPachet(int index){
        var pachet = map.get(index);
        if(pachet == null){
            map.put(index, new PachetTuristicClass("hotel", "destinatie", true));
            pachet = map.get(index);
        }
        return pachet;
    }
}
