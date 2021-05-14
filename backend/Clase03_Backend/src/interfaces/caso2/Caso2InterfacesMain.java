package interfaces.caso2;

interface InterfaceJava8 {

    static void saludar() {
        System.out.println("Buenas");
    }

}

// A partir de Java 8 se permite implementar
// métodos static en una interfaz
public class Caso2InterfacesMain implements InterfaceJava8  {

    public static void main(String[] args) {
        InterfaceJava8.saludar();
    }

}