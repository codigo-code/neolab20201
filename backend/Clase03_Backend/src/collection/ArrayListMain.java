package collection;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListMain {

    // ArrayList
    // -> Ordenada
    // -> Acceso aleatorio
    // -> Permite duplicados
    // -> Permite null
    public static void main(String[] args)
    {
        ArrayList<Integer> lista1 = new ArrayList<Integer>(4);

        lista1.add(79);
        lista1.add(34);
        lista1.add(68);

        // Null
        lista1.add(null);

        // Duplicado
        lista1.add(68);

        // Acceso aleatorio
        System.out.println("Segundo elemento: " + lista1.get(1));

        for (Integer numero : lista1) {
            System.out.println("Número = " + numero);
        }

        Collection<Integer> lista2 = new ArrayList<Integer>();
        lista2.addAll(lista1);

        System.out.println("El nuevo ArrayList: " + lista2);
    }
}
