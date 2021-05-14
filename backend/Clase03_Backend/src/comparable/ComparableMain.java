package comparable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {

    public static void main(String[] args) {

        List<Cliente> listaCliente = new ArrayList<Cliente>();

        listaCliente.add(
                new Cliente(7665l, "Ioannis Blogouras", LocalDate.parse("2020-09-08")));
        listaCliente.add(
                new Cliente(9122l, "Jose Singh", LocalDate.parse("2020-11-19")));
        listaCliente.add(
                new Cliente(6787l, "David Sotelo", LocalDate.parse("2019-03-21")));
        listaCliente.add(
                new Cliente(3423l, "Sue Sealock", LocalDate.parse("2021-04-25")));

        Collections.sort(listaCliente);
        System.out.println("Lista ordenada por id: ");
        System.out.println("********************** ");
        for (Cliente cliente : listaCliente) {
            System.out.println(cliente.toString());
        }

        Collections.sort(listaCliente, Collections.reverseOrder());
        System.out.println("Lista inversa por id: ");
        System.out.println("********************* ");
        for (Cliente cliente : listaCliente) {
            System.out.println(cliente.toString());
        }
    }

}
