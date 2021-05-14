package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

    // HashMap
    // -> Desordenada
    // -> Acceso aleatorio
    // -> Clave-valor
    // -> No admite duplicados
    // -> Admite null
    // -> No es thread-safe
    public static void main(String args[])
    {
       Map<Integer, String> hm1 = new HashMap<Integer, String>();

        hm1.put(Integer.valueOf(1), "Ventana");
        hm1.put(Integer.valueOf(2), "Puerta");
        hm1.put(Integer.valueOf(3), "Escalera");

        for (Map.Entry mapElement : hm1.entrySet()) {
            int key = (int) mapElement.getKey();
            String value = (String) mapElement.getValue();
            System.out.println(key + " : " + value);
        }
    }
}