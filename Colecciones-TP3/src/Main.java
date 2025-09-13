import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Curso> cursos = new HashMap<>();

        cursos.put("BD2", new Curso("Base de Datos II", "Prof. Maria Diez"));
        cursos.put("INGL", new Curso("Ingles", "Prof. Agustin Ganem"));
        cursos.put("PROG3", new Curso("Programacion III", "Prof. Sebastian Gomez"));

        System.out.println("=====================================================================================");
        Curso c = cursos.get("BD2");
        System.out.println(c);

        System.out.println("=====================================================================================");
        for (Map.Entry<String, Curso> entrada : cursos.entrySet()) {
            System.out.println("Codigo: " + entrada.getKey() + " / " + entrada.getValue());
        }
        System.out.println("=====================================================================================");
    }
}