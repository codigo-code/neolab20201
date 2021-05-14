package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamsMain {

    public static void main(String[] args) {

        List<Material> materialesList = new ArrayList<Material>();
        materialesList.add(new Material(1, "Arena", 3750.00f));
        materialesList.add(new Material(2, "Cemento", 605.00f));
        materialesList.add(new Material(3, "Cal", 430.00f));
        materialesList.add(new Material(4, "Hidrófugo en Pasta", 535.00f));
        materialesList.add(new Material(5, "Piedra granítica", 4161.35f));

        System.out.println("---------------------------------------------");
        System.out.println("Materiales con precio mayor a 500");
        // Obtener lista de mayores a 500.00
        materialesList.stream()
                .filter(p -> p.getPrecio() > 500.00)
                .forEach(System.out::println);

        System.out.println("---------------------------------------------");
        System.out.println("Material con precio máximo");
        // Obtener el material con precio máximo
        Material materialMaximo = materialesList.stream()
                .max((material1, material2)->
                        material1.getPrecio() > material2.getPrecio() ? 1: -1).get();
        System.out.println("Precio máximo: " + materialMaximo.getPrecio());
        System.out.println("---------------------------------------------");

        System.out.println("Listado de materiales:");
        // Conversión a Mapa
        Map<Integer,String> materialesMap =
                materialesList.stream()
                        .collect(Collectors.toMap(p -> p.getId(), p -> p.getNombre()));

        for (Map.Entry<Integer,String> entry : materialesMap.entrySet()) {
            System.out.println("Clave: " + entry.getKey() +
                    ", Valor: " + entry.getValue());
        }

        System.out.println("---------------------------------------------");
        System.out.println("Listado de nombres de materiales:");
        // Convertir a un listado de nombres
        List<String> listaNombreMateriales = materialesList.stream()
            .map(p -> p.getNombre())
            .collect(Collectors.toList());

        Consumer<String> method = (n) -> { System.out.println(n); };
            listaNombreMateriales.forEach( method );

        System.out.println("---------------------------------------------");
        System.out.println("Conteo de materiales con valor menor de $500:");
        long cantidadMaterialesMenor500 = materialesList.stream()
                .filter(p -> p.getPrecio() < 500.00)
                .count();
        System.out.println(cantidadMaterialesMenor500);
    }

}