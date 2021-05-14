package alcanceVariables;

public class AlcanceVariablesMain {

    // No es necesario inicializar variables de clase en su declaración
    public static String strCl1;

    // Variable de clase
    public static int int1 = 10;

    public static void main(String[] args) {
        // Las variable locales deben declararse al inicializarse
        String strCl2;

        System.out.println(strCl1);

        // System.out.println(strCl2);

        // variable Global
        int int1 = 5;

        System.out.println("Variable de clase: " + AlcanceVariablesMain.int1);
        System.out.println("Variable local: " + int1);
    }

}
