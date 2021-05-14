package tiposPrimitivos;

public class TiposPrimitivosJava10 {

    // No vale para variables de clase.
    // var varClase1;

    public static void main(String[] args) {

        // Vale solo para variables locales.
        var variableLocal1 = "Hola";
        System.out.println("Tipo de variableLocal1: " + variableLocal1.getClass().getSimpleName());

        var variableLocal2 = 9;
        if (variableLocal2 == (int) variableLocal2)
        {
            System.out.println("variableLocal2 es de tipo int");
        }
    }
}
