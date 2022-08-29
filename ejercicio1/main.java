package ejercicio1;

public class main {
        public static void main(String[] args) {
            int resultado = suma(1,2,3);
            System.out.println(resultado);
            Coche miCoche = new Coche();
            miCoche.incrementoPuertas();
            miCoche.incrementoPuertas();
            miCoche.incrementoPuertas();
            System.out.println(miCoche.puertas);

        }
    
        public static int suma(int a,int b,int c){
            return a+b+c;
        }
           
}

class Coche{
    int puertas = 0;

        public void incrementoPuertas(){
            this.puertas++;
        }
}
