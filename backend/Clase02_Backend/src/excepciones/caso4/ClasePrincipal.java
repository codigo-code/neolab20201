package excepciones.caso4;

public class ClasePrincipal {
    public static void main(String[ ] args) {
        try {
            int[] arrayNumeros = {1, 2, 3};
            System.out.println(arrayNumeros[10]);
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Error general.");
        } catch (Exception e1) {
            System.out.println("Desbordamiento de índice.");
        }
    }
}
