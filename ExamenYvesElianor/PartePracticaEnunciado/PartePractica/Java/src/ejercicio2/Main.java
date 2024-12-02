package ejercicio2;

import java.util.Random;

public class Main {

    private static Tarta tarta = new Tarta();
    private static Random r = new Random();

    public static void main(String[] args) {
        horno();
        bañadora();
        pastelero();
    }
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
}
