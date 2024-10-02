public class Main {
    public static void main(String[] args) {

        System.out.println("Ejercicio 2");
        System.out.println("Programacion con Hilos");

        App application = new App();
        application.startProgram();
    }

    public static void startTask() {

        Runnable runnable1 = new Task(1);
        Thread h1 = new Thread(runnable1);


        Runnable runnable2 = new Task(2);
        Thread h2 = new Thread(runnable2);

        h1.start();
        h2.start();
    }
}