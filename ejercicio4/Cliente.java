package ejercicio4;

public class Cliente extends Persona{
    Integer credit;

    public Cliente(Integer age, String name, Integer phone, Integer credit){
        super(age, name, phone);
        this.credit = credit;
    }

    void printDataPersona(){
        super.printDataPersona();
        System.out.println("Mi crédito es: " + credit);
    }
}
