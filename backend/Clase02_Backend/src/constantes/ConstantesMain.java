package constantes;

public class ConstantesMain {

    public static void main(String[] args)
    {
        System.out.println("Constante 1: " + Constantes.CONST_STR_1);

        // Al intentar acceder a constantes definidas private --> error por accesor
        // System.out.println("Constante 2: " + Constantes.CONST_STR_2);
    }

}
