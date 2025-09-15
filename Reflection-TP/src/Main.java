import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {

        // Obtener la clase
        Class<?> clazz = Class.forName("Persona");

        // Obtener e imprimir sus constructores
        System.out.println("Constructor de Persona:");
        Constructor<?>[] constructores = clazz.getConstructors();
        for (Constructor<?> c : constructores) {
            System.out.println(" " +  c);
        }

        // Instanciar un objeto en el constructor vacio
        Constructor<?> ctor = clazz.getDeclaredConstructor();
        Object persona = ctor.newInstance();

        // Modificar el valor de "nombre"
        Field campoNombre = clazz.getDeclaredField("nombre");
        campoNombre.setAccessible(true);
        campoNombre.set(persona, "Juan");

        // Invocar el metodo mostarInfo()
        Method mostarInfo = clazz.getDeclaredMethod("mostarInfo");
        mostarInfo.invoke(persona);

        // Modificar a private el metodo saludar()
        Method saludar = clazz.getDeclaredMethod("saludar");
        saludar.setAccessible(true);
        saludar.invoke(persona);
    }
}