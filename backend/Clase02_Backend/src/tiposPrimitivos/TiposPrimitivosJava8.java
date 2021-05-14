package tiposPrimitivos;

import java.util.Optional;

public class TiposPrimitivosJava8 {

    public static void main(String[] args) {

        String[] str = new String[10];

        // Antes de Java 8
        try {
            String lowercaseString = str[5].toLowerCase();
            System.out.print(lowercaseString);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // Con Java 8
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        // chequea si el valor está presente o no
        if (checkNull.isPresent()) {
            String lowercaseStringJ8 = str[5].toLowerCase();
            System.out.print(lowercaseStringJ8);
        } else {
            System.out.println("string value is not present");
        }
    }
}