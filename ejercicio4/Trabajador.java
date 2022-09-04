package ejercicio4;


public class Trabajador extends Persona {
    Integer salario;

    public Trabajador(Integer age, String name, Integer phone, Integer salario){
        super(age, name, phone);
        this.salario = salario;
    }

    @Override
    void printDataPersona() {
        // TODO Auto-generated method stub
        super.printDataPersona();
        System.out.println("Mi salario es: " + salario);
    }
}
