package api.lang;

import java.lang.Class;
import java.lang.reflect.*;

class Perro {

    private void emitirSonido() {
        System.out.println("Guau Guau");
    }
}

class ApiLangMain {
    public static void main(String[] args) {
        try {
            Perro p = new Perro();
            Class obj = p.getClass();

            Method[] metodos = obj.getDeclaredMethods();

            for (Method m : metodos) {
                System.out.println("Nombre de método: " + m.getName());

                int modificador = m.getModifiers();
                System.out.println("Modificador: " + Modifier.toString(modificador));
                System.out.println("Tipo: " + m.getReturnType());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}


