package thisSuper;

class ClasePadre {
    public void llamar() {
        System.out.println("Llamando a Clase Padre");
    }
}

class ClaseHija extends ClasePadre {
    public void llamar() {
        super.llamar();

        // StackOverflowError
        // this.llamar();
    }
}

public class ThisSuperClass {

    public static void main(String[] args) {
        ClaseHija ch = new ClaseHija();
        ch.llamar();
    }

}
