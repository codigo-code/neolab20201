package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class ConversionArrayListATreeSet {

    public static void main(String[] args) {

        ArrayList<String> coloresList = new ArrayList<String>();

        coloresList.add("Azul");
        coloresList.add("Verde");
        coloresList.add("Rojo");
        coloresList.add("Azul");
        coloresList.add(null);

        System.out.println("Listado 1 - de ArrayList: \n");
        Iterator<String> iterador1 = coloresList.iterator();
        while(iterador1.hasNext()) {
            System.out.println(iterador1.next());
        }

        TreeSet<String> ts = new TreeSet<String>(coloresList);
        System.out.println("Listado 2 - de TreeSet: \n");
        Iterator<String> iterador2 = ts.iterator();
        while(iterador2.hasNext()) {
            System.out.println(iterador2.next());
        }

    }
}
