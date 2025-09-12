import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nombre;
    private String profesor;
    private List<Estudiante> listaDeEstudiantes;

    public Curso(String nombre, String profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.listaDeEstudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        listaDeEstudiantes.add(estudiante);
    }

    @Override
    public String toString() {
        String resultado = "Curso[curso=" + nombre +"]\n";
        resultado += "Profesor[profesor=" + profesor + "]\n";
        resultado += "ListaDeEstudiantes:\n";

        for (Estudiante e : listaDeEstudiantes) {
            resultado += e + "\n";
        }

        return resultado;
    }
}
