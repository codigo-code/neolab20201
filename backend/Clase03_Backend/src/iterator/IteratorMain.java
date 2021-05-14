package iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorMain {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Rojo");
        map.put(2, "Verde");
        map.put(3, "Azul");
        map.put(4, "Negro");

        System.out.println(map);

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry par = (Map.Entry) iterator.next();

            if (par.getKey().equals(2)) {
                iterator.remove();
            } else {
                System.out.println(par.getKey() + " = " + par.getValue());
            }
        }

        System.out.println("Tamaño Mapa: " + map.size());
    }

}