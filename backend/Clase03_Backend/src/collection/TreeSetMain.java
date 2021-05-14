package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMain {

    // TreeSet
    // -> Ordenado
    // -> No permite acceso aleatorio
    // -> No permite duplicados
    // -> No permite null
    // -> No es thread-safe
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(34);
        ts.add(65);
        ts.add(11);
        ts.add(40);

        Iterator<Integer> iterator = ts.iterator();
        System.out.println("Datos de TreeSet: ");

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

        System.out.println("Primer elemento: " + ts.first());

        if (ts.remove(34)) {
            System.out.println("Quitado de TreeSet");
        } else {
            System.out.println("No existen los datos");
        }

        System.out.print("Contenido final: ");
        iterator = ts.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }

}
