package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {

    // HashSet
    // -> Desordenado
    // -> No permite Acceso aleatorio
    // -> No permite duplicados
    // -> Permite null
    // -> No es thread safe
    public static void main(String[] args)
    {
        HashSet<String> h = new HashSet<String>();

        // Adding elements into HashSet usind add()
        h.add("Azul");
        h.add("Verde");
        h.add("Rojo");

        // Elemento duplicado -> no tiene efecto en la lista
        h.add("Azul");

        // Se agrega null
        h.add(null);

        // Displaying the HashSet
        System.out.println(h);
        System.out.println("Se encuentra el color Verde: "
                + h.contains("Verde"));

        h.remove("Verde");
        System.out.println("Después de quitar color Verde:" + h);

        System.out.println("Iteración: ");
        Iterator<String> i = h.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
