import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Producto> productos = new HashSet<>();

        Producto p1 = new Producto("Manzana", 20, 300);
        Producto p2 = new Producto("Banana", 6, 1000);
        Producto p3 = new Producto("Naranja", 20, 600);
        Producto p4 = new Producto("Sandia", 33, 3000);

        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);

        System.out.println("Lista de Productos:");
        for (Producto p : productos) {
            System.out.println(p);
        }

    }
}