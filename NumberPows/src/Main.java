@FunctionalInterface
interface Operacion {
    int calcular(int a, int b);
}
@FunctionalInterface
interface Calculo{
    void cal ();
}

// Clase que implementa la interfaz funcional
public class Main {
    public static void main(String[] args) {
        // Usamos una expresión lambda para implementar el método calcular
        Operacion suma = (a, b) -> a + b;
        Operacion resta = (a, b) -> a - b;

        // Usamos las operaciones
        System.out.println("Suma: " + suma.calcular(5, 3)); // Salida: Suma: 8
        System.out.println("Resta: " + resta.calcular(5, 3)); // Salida: Resta: 2

        Calculo calculo1 = () -> System.out.println("Esto es una prueba");


    }
}


