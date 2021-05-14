package excepciones.caso2;

public class BancoDemoMain {

    public static void main(String [] args) {
        ChequeoDeCuenta c = new ChequeoDeCuenta(101);
        System.out.println("Depositar $500...");
        c.depositar(500.00);

        try {
            System.out.println("\nExtraer $100...");
            c.extraer(100.00);
            System.out.println("\nExtraer $600...");
            c.extraer(600.00);
        } catch (SinFondosException e) {
            System.out.println("Perdón, pero le faltan $" + e.getCantidad());
            e.printStackTrace();
        }
    }
}
