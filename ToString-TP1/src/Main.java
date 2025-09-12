import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Estudiante> estudiantes = new ArrayList<>();

        estudiantes.add(new Estudiante("Juan", 20, "Ingeniero en Sistemas"));
        estudiantes.add(new Estudiante("Maria", 22, "Diseño Grafico"));
        estudiantes.add(new Estudiante("Pedro", 21, "Medicina"));

        System.out.println(estudiantes);
    }
}