package ejercicio4;

public class Persona {
    Integer age;
    String name;
    Integer phone;

    public Persona(Integer age, String name, Integer phone){
        this.age = age;
        this.name = name;
        this.phone = phone;
    }
    void printDataPersona(){
        System.out.println("Mi nombre es " + name + " tengo " + age + " años y mi número es " + phone);
    }
}

