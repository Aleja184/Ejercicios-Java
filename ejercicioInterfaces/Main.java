package ejercicioInterfaces;

public class Main {
    public static void main(String[] args) {
        diaPierna diaPierna1 = new diaPierna();
        diaPecho diaPecho1 = new diaPecho();
        barraGym(diaPecho1);
        barraGym(diaPierna1);
    }

    public static void barraGym(Gym musculo){
        musculo.barra();
    }
}

interface Gym{
    void prensa();
    void barra();
}

class diaPierna implements Gym{
    public void prensa(){
        System.out.println("Pierna con prensa");
    }
    public void barra(){
        System.out.println("Pierna con barra");
    }
}

class diaPecho implements Gym{
    public void prensa(){
        System.out.println("Pecho con prensa");
    }

    public void barra(){
        System.out.println("Pecho con barra");
    }

}
