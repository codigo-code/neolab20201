package comparable;

import java.time.LocalDate;
import java.util.Comparator;

public class Cliente implements Comparable<Cliente> {

    private Long id;
    private String nombre;
    private LocalDate fecha;

    public Cliente(Long id, String nombre, LocalDate fecha) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    @Override
    public int compareTo(Cliente o)
    {
        return this.getId().compareTo( o.getId() );
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String toString() {
        return this.getId() + " - " + this.getNombre() + " - " + this.getFecha();
    }

    public static Comparator<Cliente> NombreComparator = new Comparator<Cliente>() {
        @Override
        public int compare(Cliente cl1, Cliente cl2) {
            return cl1.getNombre().compareTo(cl2.getNombre());
        }
    };
}
