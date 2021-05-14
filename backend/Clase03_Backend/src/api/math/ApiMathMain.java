package api.math;

public class ApiMathMain {

    public static int generarNumeroAleatorioPorRango(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    public static void main(String[] args) {
        int minimo = 2;
        int maximo = 29;
        System.out.println(
                "Número aleatorio entre " + minimo + " y " + maximo + " -> "
                        + generarNumeroAleatorioPorRango(minimo, maximo));
    }
}
