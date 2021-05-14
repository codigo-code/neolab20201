package collection;

import java.util.*;

public class LinkedListMain {

    // LinkedList
    // -> Ordenada
    // -> Permite elementos duplicados
    // -> Permite null
    // -> No es thread-safe
    public static void main(String[] args) {

        Collection<String> listaMusical = new LinkedList<String>();

        listaMusical.add("Rock & Roll");
        listaMusical.add("Clásica");
        listaMusical.add("Melódica");
        listaMusical.add("Folklore");

        // Duplicado
        listaMusical.add("Folklore");

        // Null
        listaMusical.add(null);

        System.out.println("La nueva lista musical: " + listaMusical);
    }
}