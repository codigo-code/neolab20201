package identificadores;

public class IdentificadoresNewMain {

    public static void main(String[] args) {

        // A partir de Java 7 se pueden utilizar "_" en números
        // para por ejemplo separar de cifras
        long int1 = 100_000_000;
        System.out.println("int1 es: " + int1);

        // También se permiten dos "_" seguidos
        long int2 = 100__000__000;
        System.out.println("int2 es: " + int2);

        // No se permite utilizar "_" al final del identificador
        // long int3 = 100__000__000_;
        // System.out.println("int2 es: " + int3);

    }
}
