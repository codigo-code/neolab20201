package excepciones.caso2;

public class ChequeoDeCuenta {
    private double balance;
    private int numero;

    public ChequeoDeCuenta(int numero) {
        this.numero = numero;
    }

    public void depositar(double monto) {
        balance += monto;
    }

    public void extraer(double monto) throws SinFondosException {
        if(monto <= balance) {
            balance -= monto;
        }else {
            double necesidad = monto - balance;
            throw new SinFondosException(necesidad);
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getNumero() {
        return numero;
    }
}
