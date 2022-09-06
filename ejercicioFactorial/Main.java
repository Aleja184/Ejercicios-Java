package ejercicioFactorial;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static int factorial(int numero){
        if(numero==0){
            return 1;
        }else{
            return numero*factorial(numero-1);
        }
    }
}
