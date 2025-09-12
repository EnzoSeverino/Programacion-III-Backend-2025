import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Producto p1 = new Producto("Oreo", 100, 1500);
        Producto p2 = new Producto("Hamburguesas", 55, 4500);
        Producto p3 = new Producto("Shampoo", 100, 7000);

        List<Producto> listaDeProductos = new ArrayList<>();

        if (!listaDeProductos.contains(p1)) listaDeProductos.add(p1);
        if (!listaDeProductos.contains(p2)) listaDeProductos.add(p2);
        if (!listaDeProductos.contains(p3)) listaDeProductos.add(p3);

        System.out.println("Lista de Productos:");
        for (Producto p : listaDeProductos) {
            System.out.println(p);
        }
    }
}