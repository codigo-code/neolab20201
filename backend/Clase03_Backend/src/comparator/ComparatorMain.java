package comparator;

import comparable.Cliente;

import java.time.LocalDate;
import java.util.Arrays;

public class ComparatorMain {

    public static void main(String[] args) {

        //sorting custom object array
        Cliente[] cliArr = new Cliente[4];
        cliArr[0] = new Cliente(7665l, "Ioannis Blogouras", LocalDate.parse("2020-09-08"));
        cliArr[1] = new Cliente(9122l, "Jose Singh", LocalDate.parse("2020-11-19"));
        cliArr[2] = new Cliente(6787l, "David Sotelo", LocalDate.parse("2019-03-21"));
        cliArr[3] = new Cliente(3423l, "Sue Sealock", LocalDate.parse("2021-04-25"));

        Arrays.sort(cliArr);
        System.out.println("Lista de clientes: \n" + Arrays.toString(cliArr));

        Arrays.sort(cliArr, Cliente.NombreComparator);
        System.out.println("Lista de clientes ordenados por nombre: \n" + Arrays.toString(cliArr));

    }

}
