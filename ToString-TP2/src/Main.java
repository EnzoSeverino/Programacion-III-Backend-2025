public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso("Base de Datos", "Prof. Eduardo Morales");

        curso1.agregarEstudiante(new Estudiante("Juan Perez", 21, "Programacion"));
        curso1.agregarEstudiante(new Estudiante("Alberto Gonzales", 19, "Proramacion"));
        curso1.agregarEstudiante(new Estudiante("Roberto Chavez", 20, "Programacion"));

        Curso curso2 = new Curso("Ingles", "Prof. Alejandra Dominguez");
        curso2.agregarEstudiante(new Estudiante("Luis Parrilla", 20, "Programacion"));
        curso2.agregarEstudiante(new Estudiante("Facundo Ganem", 18, "Programacion"));

        System.out.println("==============================================================================");
        System.out.println(curso1);
        System.out.println("==============================================================================");
        System.out.println(curso2);
        System.out.println("==============================================================================");
    }
}