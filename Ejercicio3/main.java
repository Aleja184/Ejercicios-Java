package Ejercicio3;

/*
 * Crear clase Persona.

Crear variables las privadas edad, nombre y telefono de la clase Persona.

Crear gets y sets de cada propiedad.

Crear un objeto persona en el main.

Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
 */

public class main {
    public static void main(String[] args) {
        persona persona1 = new persona();
        persona1.setAge(21);
        persona1.setName("Alejandra");
        persona1.setPhone(154978954);
        System.out.println("Mi nombre es " + persona1.getName() + " tengo " + persona1.getAge() + " años y mi número de telefono es " + persona1.getPhone());
    }

}

