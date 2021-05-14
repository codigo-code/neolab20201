package operadores;

public class OperadoresMain {

    public static void main(String[] args) {

        //////////////////////////////
        // Operadores de asignación //
        //////////////////////////////
        int int1 = 1;
        // Se suma 2
        System.out.println(int1+=2); // int1 = int1 + 2

        // Usar el operador ++ a la derecha de la variable
        // se refleja el cambio en la línea siguiente
        System.out.println(int1++);

        // Usar el operador ++ a la izquierda de la variable
        // se refleja el cambio en la misma línea
        System.out.println(++int1);

        //////////////////////////
        // Operadores "&" y "|" //    & (AND) --> && / | (OR) --> ||
        //////////////////////////
        // Caso 1: En este caso se evalúan ambas expresiones
        boolean result = (int1 == 5)
                | (((Integer) int1).getClass().getSimpleName().equals("Integer"));
        System.out.println(result);

        // Caso 2: Cortocircuitado: Si la primer expresión es falsa la segunda no se evalúa
        boolean resultCortoc = (int1 == 5)
                || (((Integer) int1).getClass().getSimpleName().equals("Integer"));
        System.out.println(result);

        //////////////
        // Ternario //
        //////////////
        System.out.println(int1 == 5 ? "int1 es 5" : "int1 distinto de 5");

    }
}
