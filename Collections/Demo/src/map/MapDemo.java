package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        
        // We cannot guarantee the order in HashMap
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(2, "niwas");
        map.put(1,"reeta");
        map.put(3, "pratiksha");
        map.put(4, "moon");

        System.out.println(map);
        
        // This guarantee the order in which they are entered
        Map<Integer,String> lmap = new LinkedHashMap<Integer,String>();
        lmap.put(2, "niwas");
        lmap.put(1,"reeta");
        lmap.put(3, "pratiksha");
        lmap.put(4, "moon");
        lmap.put(2, "Niwas Kumar");
        // System.out.println(lmap.get(8)+1);  // It returns null when key is not present

        System.out.println(lmap);
        
        // This stores the data in sorted order
        Map<Integer,String> tmap = new TreeMap<Integer,String>();
        tmap.put(2, "niwas");
        tmap.put(1,"reeta");
        tmap.put(3, "pratiksha");
        tmap.put(4, "moon");

        System.out.println(tmap);
    }
}
