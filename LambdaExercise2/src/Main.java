public class Main {
    public static void main(String[] args) {
        System.out.println("Easy with Lambdas");

        // El siguiente ejemplo no se puede instanciar
        // Calculation en abstracta
        // Calculation calculus1 = new Calculation();

        // El siguiente ejemplo no compila
        // Recibe dos parametros
        // Calculation calculus2 = (()->{});

        // El siguiente ejemplo funciona
        // No realiza ninguna instruccion
        Calculation calculus3 = ((number1, number2)->{});

        // Las siguientes instruccion son la definicion de la funcion abstracta
        Calculation calculus4 = ((number1, number2)->{
            int result = number1 + number2;
            System.out.println(result);
        });

        // Esta instruccion realiza el funcionamiento de la funcion
        calculus4.makeCalculus(1,3);


        // Podemos cambiar el funcionamiento de la funcion gracias a la LAMBDA
        Calculation calculus5 = ((number1, number2)->{
            int result = number1 * number2;
            System.out.println(result);
        });

        calculus5.makeCalculus(5,5);
    }
}