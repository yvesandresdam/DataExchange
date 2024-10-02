package Ejercicio4;

public class Tostadora implements Runnable{

    @Override
    public void run() {
        try{
            System.out.println("Tostadas: Cortar el pan");
            System.out.println("5 unidades de tiempo");
            Thread.sleep(5000);
            System.out.println("Tostadas: Introducir en tostador");
            System.out.println("2 unidades de tiempo");
            Thread.sleep(2000);
            System.out.println("Tostadas: Esperar finalizacion del programa");
            System.out.println("5 unidades de tiempo");
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
            System.out.println("Hilo interrumpido");
        }
    }
}

/*
    La clase MakingToast implementa la interfaz 'Runnable'
    La ventaja es que puedo heredar de la clase que quiera.
    Con Herencia solo puedo heredar de una clase.
    La preferencia es implementar 'Runnable'.
 */
