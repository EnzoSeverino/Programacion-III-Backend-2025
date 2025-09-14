package org.example;

public class Main {
    public static void main(String[] args) {

        Usuario us1 = Usuario.builder()
                .id(1)
                .nombre("Edgardo")
                .email("edgardoperez@gmail.com")
                .build();

        Usuario us2 = Usuario.builder()
                .id(2)
                .nombre("Josefina")
                .email("josefinadiaz@gmail.com")
                .build();

        System.out.println("=========================================================");
        System.out.println(us1);
        System.out.println(us2);
        System.out.println("=========================================================");
    }
}