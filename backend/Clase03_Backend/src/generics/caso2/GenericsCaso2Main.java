package generics.caso2;

/**
 *  Generics de dos tipos.
 */
class Generico<T, U> {
    T obj1;
    U obj2;

    Generico(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void imprimir() {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

class GenericsCaso2Main {

    public static void main (String[] args) {
        System.out.println("---------------------------------------------");
        Generico <String, Integer> obj1 = new Generico<String, Integer>("Buenas!", 50);
        obj1.imprimir();
        System.out.println("---------------------------------------------");
        Generico <Integer, String> obj2 = new Generico<Integer, String>(11, "Adios!");
        obj2.imprimir();
        System.out.println("---------------------------------------------");
    }

}
