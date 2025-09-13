import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Producto> productos = new HashSet<>();

        productos.add(new Producto(10, "Galletas de Agua"));
        productos.add(new Producto(15, "Leche Descremada"));
        productos.add(new Producto(33, "Fideos Tirabuzon"));
        productos.add(new Producto(10, "Carne Molida"));
        productos.add(new Producto(23, "Azucar"));
        productos.add(new Producto(33, "Desodorante"));

        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}