package date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateJava8Main {

    public static void main(String[] args) {

        LocalDate hoy = LocalDate.now();

        System.out.println("Año: "+ hoy.getYear());
        System.out.println(
                "¿Hoy es antes del 3 de Abril? " + hoy.isBefore(LocalDate.of(2021,4,5)));

        // Conversión a LocalDateTime
        System.out.println("Tiempo actual: " + hoy.atTime(LocalTime.now()));

        System.out.println("De aquí a 7 días es: " + hoy.plusDays(7));
        System.out.println("De aquí a 2 semanas es: " + hoy.plusWeeks(2));
        System.out.println("De aquí a 3 meses es: " + hoy.plusMonths(3));

        System.out.println("3 días antes de hoy es: " + hoy.minusDays(3));
        System.out.println("5 semanas antes de hoy es: " + hoy.minusWeeks(5));
        System.out.println("6 meses antes de hoy es: " + hoy.minusMonths(6));

        // Formatear fecha (a String)
        System.out.println(
                "Fecha formateada en dd/MM/YYY: " + hoy.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        // Formatear fecha y hora (a String)
        System.out.println(
                "Formatear fecha y hora en dd/MM/YYYY hh:mm:ss: "
                        + hoy.atTime(LocalTime.now()).format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss.s")));
    }
}
