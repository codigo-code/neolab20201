package excepciones.caso1;

public class ExcepcionesMain {

    public static void main(String args[]) {
        int a[] = new int[2]; // 0, 1
        try {
            System.out.println("Acceso a elemento índice 3:" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excepción arrojada :" + e);
        }finally {
            a[0] = 6;
            System.out.println("Primer valor del elemento: " + a[0]);
            System.out.println("Se ejecuta la sentencia finally");
        }
    }
}
