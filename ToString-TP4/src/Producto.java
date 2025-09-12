import java.util.Objects;

public class Producto {

    private String nombre;
    private int codigo;
    private double precio;

    public Producto(String nombre, int codigo, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return codigo == producto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
