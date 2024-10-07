@FunctionalInterface
interface Matematicas {
    int calcular(int a, int b);
}

// Clase que implementa la interfaz funcional
public class Main {
    public static void main(String[] args) {
        Matematicas mates = ((numberA, numberB) -> {
            return numberA + numberB;
        });
        int result = mates.calcular(1,2);
        System.out.println(result);
    }
}