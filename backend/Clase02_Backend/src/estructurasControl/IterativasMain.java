package estructurasControl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterativasMain {

    public static void main(String[] args) {
        // mostrarDatosConIterFor(rellenarDatosConIterWhile());
        mostrarDatosConIterator(rellenarDatosConIterWhile());
    }

    public static List<Double> rellenarDatosConIterWhile() {
        int i = 0;
        List<Double> listado = new ArrayList<>();
        do {
            listado.add(Math.random());
            i++;
        } while (i < 10);
        return listado;
    }

    public static void mostrarDatosConIterFor(List<Double> listado) {
        for (Double valor : listado) {
            System.out.println(valor);
        }
    }

    public static void mostrarDatosConIterator(List<Double> listado) {
        Iterator<Double> iterDouble = listado.iterator();
        while (iterDouble.hasNext()) {
            System.out.println(iterDouble.next());
        }
    }

}