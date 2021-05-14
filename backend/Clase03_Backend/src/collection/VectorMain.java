package collection;

import java.util.Vector;

public class VectorMain {

    // Vector
    // -> Ordenado
    // -> Acceso aleatorio
    // -> Permite duplicados
    // -> Permite null
    // -> Es thread-safe
    public static void main(String[] args) {

        int n = 5;
        Vector<Integer> v = new Vector<Integer>(5);

        for (int i = 1; i <= n; i++) {
            v.add(i);
        }

        System.out.println("Vector inicial: " + v);

        // Borrar el 4to elemento
        v.remove(3);

        // Se agrega duplicado
        v.add(1);

        // Se agrega null
        v.add(null);

        // Imprimir último elemento - Acceso aleatorio
        System.out.println("Primer elemento: " + v.get(0));

        // Después del borrado
        System.out.println("Vector final: " + v);

    }
}
