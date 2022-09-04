package ejercicio4;

/*Crea una clase Persona con las siguientes variables:

La edad

El nombre

El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador. */

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(20, "Alejandra", 32145779, 10000);
        cliente1.printDataPersona();

        Trabajador trabajador1 = new Trabajador(24, "Diego", 3214598, 20000);
        trabajador1.printDataPersona();
    }
}
