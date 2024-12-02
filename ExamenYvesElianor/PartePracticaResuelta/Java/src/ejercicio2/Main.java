package ejercicio2;

import java.util.Random;

public class Main {

    private static Tarta tarta = new Tarta();
    private static Random r = new Random();

    // Creamos dos objetos monitores para controlar
    // la ejecucion de los hilos 'bañadora' y 'pastelero'

    static Object monitor1 = new Object();
    static Object monitor2 = new Object();


    public static void main(String[] args) {

        Runnable horno = new Horno(tarta, monitor1);
        Thread tareaHorno = new Thread(horno);
        tareaHorno.start();

        Runnable bañadora = new Bañadora(tarta, monitor1, monitor2);
        Thread tareaBañadora = new Thread(bañadora);
        tareaBañadora.start();

        Runnable pastelero = new Pastelero(tarta, monitor1, monitor2);
        Thread tareaPastelero = new Thread(pastelero);
        tareaPastelero.start();

        try {
            tareaHorno.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            tareaBañadora.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            tareaPastelero.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Horno implements Runnable {
    Tarta tarta;
    Object monitor1;

    @Override
    public void run() {
        synchronized (monitor1) {
            System.out.println("Horno: Precalentando a 220 grados...");
            Utils.esperaAleatoria();
            System.out.println("Horno: Temperatura alcanzada. Horneamos el bizcocho...");
            Utils.esperaAleatoria();
            tarta.setEstadoTarta(EstadoTarta.BIZCOCHO_HORNEADO);
            monitor1.notify();
            System.out.println("Horno: Bizcocho horneado!");
        }
    }

    public Horno(Tarta tarta, Object monitor1) {
        this.tarta = tarta;
        this.monitor1 = monitor1;
    }
}

class Bañadora implements Runnable {
    Tarta tarta;
    Object monitor1;
    Object monitor2;

    @Override
    public void run() {
        System.out.println("Bañadora: Calentando el chocolate...");
        Utils.esperaAleatoria();
        synchronized (monitor1) {
            //try {
                //monitor1.wait();
                System.out.println("Bañadora: Temperatura alcanzada. Bañamos el bizcocho en chocolate...");
                Utils.esperaAleatoria();
                tarta.setEstadoTarta(EstadoTarta.BIZCOCHO_CON_CHOCOLATE);
                System.out.println("Bañadora: Bizcocho bañado en chocolate");
                monitor2.notify();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }

        }
    }

    public Bañadora(Tarta tarta, Object monitor1, Object monitor2) {
        this.tarta = tarta;
        this.monitor1 = monitor1;
        this.monitor2 = monitor2;
    }
}


class Pastelero implements Runnable {
    Tarta tarta;
    Object monitor1;
    Object monitor2;

    @Override
    public void run() {
        synchronized (monitor2) {
            try {
                monitor2.wait();

                System.out.println("Pastelero: Ponemos la guinda.");
                Utils.esperaAleatoria();
                tarta.setEstadoTarta(EstadoTarta.BIZCOCHO_CON_GUINDA);
                System.out.println("Pastelero: Tarta terminada!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Pastelero(Tarta tarta, Object monitor1, Object monitor2) {
        this.tarta = tarta;
        this.monitor1 = monitor1;
        this.monitor2 = monitor2;
    }
}


class Utils {
    private static Random r = new Random();

    public static void esperaAleatoria() {
        int random = r.nextInt(2000, 5000);
        try {
            Thread.sleep(random);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

// CODIGO ORIGINAL

/*
    public static void horno(){
        System.out.println("Horno: Precalentando a 220 grados...");
        esperaAleatoria();
        System.out.println("Horno: Temperatura alcanzada. Horneamos el bizcocho...");
        esperaAleatoria();
        tarta.setEstadoTarta(EstadoTarta.BIZCOCHO_HORNEADO);
        System.out.println("Horno: Bizcocho horneado!");
    }

    public static void bañadora(){
        System.out.println("Bañadora: Calentando el chocolate...");
        esperaAleatoria();
        System.out.println("Bañadora: Temperatura alcanzada. Bañamos el bizcocho en chocolate...");
        esperaAleatoria();
        tarta.setEstadoTarta(EstadoTarta.BIZCOCHO_CON_CHOCOLATE);
        System.out.println("Bañadora: Bizcocho bañado en chocolate");
    }


    public static void pastelero(){
        System.out.println("Pastelero: Ponemos la guinda.");
        esperaAleatoria();
        tarta.setEstadoTarta(EstadoTarta.BIZCOCHO_CON_GUINDA);
        System.out.println("Pastelero: Tarta terminada!");
    }

    public static void esperaAleatoria(){
        int random = r.nextInt(2000,5000);
        try {
            Thread.sleep(random);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
 */
