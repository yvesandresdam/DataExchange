package Ejercicio3;

public class Main {
    public static void main (String[] args){
        System.out.println("Preparando el desayuno para la señora");
        try{
            Tostadora tostadora = new Tostadora();
            tostadora.start();
            MakingCoffee();
        }
        catch (InterruptedException ie){
            System.out.println("Hilo interrumpido");
        }
    }

    public static void MakingCoffee() throws InterruptedException{
        System.out.println("Cafe: Preparar la taza con el café instantaneo");
        System.out.println("2 unidades de tiempo");
        Thread.sleep(2000);
        System.out.println("Cafe: Calentar agua en el microondas");
        System.out.println("5 unidades de tiempo");
        Thread.sleep(5000);
        System.out.println("Cafe: Verter el agua caliente en la taza");
        System.out.println("5 unidades de tiempo");
        Thread.sleep(5000);
    }
}

/*
    Este ejercicio hace que las funciones se ejecuten en distintos hilos.
    Creamos un hilo para tostadora, y el cafe se queda en el hilo principal.
 */
