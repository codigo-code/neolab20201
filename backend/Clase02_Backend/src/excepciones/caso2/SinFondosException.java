package excepciones.caso2;

public class SinFondosException extends Exception {
    private double cantidad;

    public SinFondosException(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }
}
