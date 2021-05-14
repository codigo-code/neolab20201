package metodos;

public class Metodos {

    public static void noRetornoValor() {
        System.out.println("No se retorna valor");
    }

    public static String retornarValor(String lugar, int horario) {
        String mensaje = "La reunión será en " + lugar + " a las: " + horario;
        return mensaje;
    }

    public static String utilizarVarArgs(String... varArgs) {
        String strAcum = new String();
        for (String v: varArgs) {
            strAcum = strAcum + " " + v;
        }
        return strAcum;
    }
}
