package Ejercicio8;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Runnable r = new Runnable() {
            @Override
            public void run() {
                try{
                    System.out.println("Tiempo de 1 segundo");
                    Thread.sleep(1000);
                }
                catch(InterruptedException ie){
                    System.out.println("Hilo interrumpido");
                }
            }
        };
        Thread t1 = new Thread(r);
        t1.start();
        ContadorLineas();

    }
    public static void ContadorLineas(){
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