package arraysEnums;

import java.util.Arrays;

public class ArraysEnumsMain {

    public static void main(String[] args) {
        System.out.println(AnalisisRiesgo.ALTO);

        AnalisisRiesgo[] valoresEnumArr = AnalisisRiesgo.values();
        System.out.println("Longitud array Enum: " + valoresEnumArr.length);

        int[] enterosArr = new int[10];
        Arrays.fill(enterosArr, 20);
        for (int x : enterosArr) {
            System.out.println(x);
        }

        // Arrays bidimensionales
        String[][] arrayBidim = new String[2][3];
        for (int fila = 0; fila < arrayBidim.length; fila++)
        {
            for (int col = 0; col < arrayBidim[fila].length; col++)
            {
                arrayBidim[fila][col] = String.valueOf(Math.random());
                System.out.println("Fila [" + fila + "], Columna [" + col + "]:" + arrayBidim[fila][col]);
            }
        }
    }

    public enum AnalisisRiesgo {
        BAJO("Bajo", 1),
        MEDIO("Medio", 2),
        ALTO("Alto", 3);

        private final String texto;
        private final int valor;

        AnalisisRiesgo(final String texto, final int valor) {
            this.texto = texto;
            this.valor = valor;
        }

        @Override
        public String toString() {
            return texto + ": " + valor;
        }
    }

}