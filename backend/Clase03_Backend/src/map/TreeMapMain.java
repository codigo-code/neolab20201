package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapMain {

    // TreeMap
    // -> Ordenado
    // -> Acceso aleatorio
    // -> Clave-valor
    // -> No permite duplicados
    // -> No permite null
    // -> No es thread-safe
    public static void main(String args[]) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        tm.put(3, "Verde");
        tm.put(2, "Azul");
        tm.put(1, "Naranja");

        for (Map.Entry mapElement : tm.entrySet()) {
            int key = (int) mapElement.getKey();
            String value = (String) mapElement.getValue();
            System.out.println(key + " : " + value);
        }
    }
}