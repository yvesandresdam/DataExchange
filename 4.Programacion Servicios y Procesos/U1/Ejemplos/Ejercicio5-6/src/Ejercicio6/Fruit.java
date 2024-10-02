package Ejercicio6;

public class Fruit implements Runnable{

    @Override
    public void run() {
        try{
            Thread.sleep(5000);
            System.out.println("Fruta: Coger la fruta de la nevera");
            System.out.println("Fruta: Cortar la fruta en rodajas");
            System.out.println("Fruta: Colocar la fruta en el plato");
        }
        catch(InterruptedException ie){
            System.out.println("Hilo error");
        }

    }
}
