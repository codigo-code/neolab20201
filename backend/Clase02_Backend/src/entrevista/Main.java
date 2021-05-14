package entrevista;

import java.lang.Class;
import java.lang.reflect.*;

class LenguajeProgramacion {
    public String nombre;
}

class Main {
    public static void main(String[] args) {
        try {
            LenguajeProgramacion lp = new LenguajeProgramacion();

            Class obj = lp.getClass();

            Field field1 = obj.getField("nombre");
            field1.set(lp, "Java");

            String variable1 = (String) field1.get(lp);
            System.out.println("variable1: " + variable1);

            int modifierInt = field1.getModifiers();
            String variable2 = Modifier.toString(modifierInt);
            System.out.println("variable2: " + variable2);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}