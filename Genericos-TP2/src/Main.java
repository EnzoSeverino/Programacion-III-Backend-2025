import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add("Bienvenidos");
        palabras.add("Adios");

        System.out.println("=======================");
        System.out.println("Lista de enteros:");
        Utilidades.imprimirLista(numeros);
        System.out.println("=======================");
        System.out.println("Lista de cadenas:");
        Utilidades.imprimirLista(palabras);
        System.out.println("=======================");
    }
}