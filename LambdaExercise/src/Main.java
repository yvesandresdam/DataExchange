public class Main {
    public static void main(String[] args) {
        System.out.println("Lambda exercise");
        Calculator calcul1 = ((number1, number2) ->{
            int result = number1 + number2;
            System.out.println("El resultado de la suma es: " + result);
        });
        calcul1.calculate(1,3);
    }
}