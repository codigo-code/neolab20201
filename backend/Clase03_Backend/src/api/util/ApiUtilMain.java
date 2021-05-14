package api.util;

import java.util.Locale;

public class ApiUtilMain {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();
        System.out.println("Nombre del locale: " + locale.getDisplayName());
        System.out.println("Código de lenguaje: " + locale.getLanguage());
        System.out.println("Código de país: " + locale.getDisplayCountry());

    }
}
