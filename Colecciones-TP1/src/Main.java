import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Lamine Yamal", 7.5));
        alumnos.add(new Alumno("Ousmane Dembele", 9));
        alumnos.add(new Alumno("Kylian Mbappe", 4));

        for (Alumno a : alumnos) {
            System.out.println(a);
        }
    }
}