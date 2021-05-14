package map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableMain {

    // HashTable
    // -> Desordenado
    // -> Acceso aleatorio
    // -> Clave-valor
    // -> No permite duplicados
    // -> No permite null
    // -> Es thread safe
    public static void main(String[] args) {

        Map<Integer, String> hm = new HashMap<>();

        hm.put(1, "Primero");
        hm.put(2, "Segundo");
        hm.put(3, "Tercero");

        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(hm);

        if (ht2.containsKey(2)) {
            String a = ht2.get(2);
            System.out.println("Valor para clave 2: " + a);
        }

        System.out.println("Mapeo de ht2 : " + ht2);
    }
}
