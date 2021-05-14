package wrappers;

public class WrappersMain {

    public static void main(String[] args) {

        // Boxing -> primitivo a Wrapper
        Long long1 = 234234l;
        System.out.println("Tipo de dato long1: " + long1.getClass().getName());

        // Unboxing -> Wrapper a primitivo
        long long2 = new Long(2323l);

        // Unboxing -> Wrapper a primitivo (resuelve tema @Deprecated de Java 9)
        long long3 = Long.valueOf(23424l);

    }
}
