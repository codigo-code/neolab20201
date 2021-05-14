package generics.caso1;

/** Generics de un tipo de dato. */
class Generico<T> {
    T obj;
    Generico(T obj) { this.obj = obj; }
    public T getObjeto() { return this.obj; }
}

class GenericsCaso1Main {
    public static void main (String[] args)
    {
        // Instancia de Integer
        Generico<Integer> obj1 = new Generico<>(25);
        System.out.println(obj1.getObjeto());

        // instancia de String
        Generico<String> sObj = new Generico<>("Hola!");
        System.out.println(sObj.getObjeto());
    }
}