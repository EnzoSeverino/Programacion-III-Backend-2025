public class Persona {

    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    private void saludar() {
        System.out.println("Hola");
    }

    public void mostarInfo() {
        System.out.println("Persona[nombre=" + nombre + ", edad=" + edad + "]");
    }
}
