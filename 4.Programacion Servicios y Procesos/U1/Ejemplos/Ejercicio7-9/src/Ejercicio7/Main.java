package Ejercicio7;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        try{
            for (int i = 1; i < 6; i++) {
                Thread.sleep(2000);
                System.out.println("Soy la linea numero: " + i);
            }
        }catch(InterruptedException ie){
            System.out.println("Hilo interrumpido");
        }
    }
}