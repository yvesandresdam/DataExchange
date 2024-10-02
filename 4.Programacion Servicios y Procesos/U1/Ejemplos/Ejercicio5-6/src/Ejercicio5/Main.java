package Ejercicio5;

public class Main {
    public static void main(String[] args) {

        System.out.println("Preparar el desayuno para su alteza el fin de semana");

        //Fruit fruta = new Fruit();
        //Thread t1 = new Thread(fruta);

        //En este ejercicio podemos utilizar clases anonimas

        Runnable runner = new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(5000);
                    System.out.println("Fruta: Coger la fruta de la nevera");
                    System.out.println("Fruta: Cortar la fruta en rodajas");
                    System.out.println("Fruta: Colocar la fruta en el plato");
                }
                catch(InterruptedException ie){
                    System.out.println("Hilo interrumpido");
                }
            }
        };

        Thread t1 = new Thread(runner);
        t1.start();
        PrepararCereales();
    }

    public static void PrepararCereales(){
        System.out.println("Cereales: Sacar los cereales de la despensa, la leche de la nevera");
        System.out.println("Cereales: Verter los cereales en el tazón");
        System.out.println("Cereales: Añadir leche al gusto");
    }

    /*
    Otra opcion de sintaxis:
    Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(5000);
                    System.out.println("Fruta: Coger la fruta de la nevera");
                    System.out.println("Fruta: Cortar la fruta en rodajas");
                    System.out.println("Fruta: Colocar la fruta en el plato");
                }
                catch(InterruptedException ie){
                    System.out.println("Hilo interrumpido");
                }
            }
        });


     */
}