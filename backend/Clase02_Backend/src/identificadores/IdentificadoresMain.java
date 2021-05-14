package identificadores;

public class IdentificadoresMain {

    public static void main(String[] args) {

        // Identificadores con "$" o "_" están permitidos
        long num$Long1 = 345;
        String _str1 = "Hola!";

        // No se permiten identificadores que comiencen con dígitos
        //short 3numShort = 4543;

        // Los identificadores son case sensitive
        int numInt = 5;
        int numINT = 3;

        // No se pueden usar palabras reservadas como identificadores
        // byte if = 9;
        // int int = 10;

    }
}
