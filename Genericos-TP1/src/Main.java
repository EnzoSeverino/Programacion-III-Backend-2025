import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Caja<String> cajaDeTexto = new Caja<>();
        cajaDeTexto.setContenido("Hola, Genericos!");
        System.out.println(cajaDeTexto.getContenido());

        Caja<Integer> cajaDeNumeros = new Caja<>();
        cajaDeNumeros.setContenido(123);
        System.out.println(cajaDeNumeros.getContenido());

        // Sin genericos
        List lista = new ArrayList<>();
        lista.add("Texto");
        lista.add(100);

        String str = (String) lista.get(0);
        Integer num = (Integer) lista.get(1);

        System.out.println("Sin genericos: " + str + ", " + num);

        // Con genericos
        List<String> listaStrings = new ArrayList<>();
        listaStrings.add("Texto");

        String s = listaStrings.get(0);
        System.out.println("Con genericos: " + s);
    }
}