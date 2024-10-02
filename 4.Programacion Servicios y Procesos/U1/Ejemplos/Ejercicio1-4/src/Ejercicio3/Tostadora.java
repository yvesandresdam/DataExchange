package Ejercicio3;

public class Tostadora extends Thread{

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
    La clase MakingToast hereda 'implements' de Thread
    Hay que sobreescribir la clase con nuestras funciones
    Utilizamos @Override y creamos el metodo run.
    El metodo run es el que crea y ejecuta un nuevo hilo
 */
