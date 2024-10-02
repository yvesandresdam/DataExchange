package Ejercicio2;

public class Main {
    public static void main (String[] args){
        System.out.println("Preparando el desayuno para la señora");
        try{
            MakingToasts();
            MakingCoffee();
        }
        catch (InterruptedException ie){
            System.out.println("Hilo interrumpido");
        }
    }

    public static void MakingToasts() throws InterruptedException{
        System.out.println("Tostadas: Cortar el pan");
        System.out.println("2 unidades de tiempo");
        Thread.sleep(2000);
        System.out.println("Tostadas: Introducir en tostador");
        System.out.println("2 unidades de tiempo");
        Thread.sleep(2000);
        System.out.println("Tostadas: Esperar finalizacion del programa");
        System.out.println("5 unidades de tiempo");
        Thread.sleep(5000);
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
    Para hacer funcionar este programa, necesitamos emplear la clase estatica 'Thread.sleep'
    Esta clase tiene diseñado que puede lanzar excepciones, la funcion 'sleep'.
    Por lo tanto hay que añadir en la linea de definicion de la función 'throws InterruptedException'
    Siempre que una clase contega un throws, hay que introducirla en un 'try / catch'
 */
