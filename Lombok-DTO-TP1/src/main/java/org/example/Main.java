package org.example;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona("Juan", 22);
        System.out.println("Nombre: " + p1.getNombre() + " || Edad: " + p1.getEdad());

        Persona p2 = new Persona();
        p2.setNombre("Rafael");
        p2.setEdad(43);
        System.out.println("Nombre: " + p2.getNombre() + " || Edad: " + p2.getEdad());
    }
}