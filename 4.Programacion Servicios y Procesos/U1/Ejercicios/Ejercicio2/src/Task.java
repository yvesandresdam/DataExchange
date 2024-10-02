import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task implements Runnable {

    private static int minRandomNumber = 1;
    private static int maxRandomNumber = 100;
    private static int maxPrimeNumber;

    private int threadNumber;

    private static int indexPrime = 1;
    private static int currentPrime = 2;

    private static int minRandomTime = 500;
    private static int maxRandomTime = 1000;

    private List<Integer> primeList = new ArrayList<Integer>();

    public Task(int number) {
        this.threadNumber = number;
    }

    @Override
    public void run() {
        setMaxPrimeNumber();
        displayThreadMessage();
        //setPrimeList(maxRangeNumber);
        setPrimeList();

        try {
            while (currentPrime != maxPrimeNumber) {
                setCurrentPrime(indexPrime);
                displayCurrentPrime(currentPrime);
                currentPrime++;
                indexPrime++;

                int randomTime = Utils.getRandomNumber(minRandomTime, maxRandomTime);
                Thread.sleep(randomTime);
            }
        } catch (InterruptedException ie) {
            System.out.println("El Hilo se ha interrumpido");
        }
    }

    private void setPrimeList() {
       primeList = Utils.getPrimeNumberList(1, maxPrimeNumber);
    }

    private void setCurrentPrime(int index) {
        currentPrime = primeList.get(index);
    }

    private static void setMaxPrimeNumber() {
        maxPrimeNumber = Utils.getRandomNumber(minRandomNumber, maxRandomNumber);
    }

    private void displayThreadMessage() {
        System.out.println("El Hilo numero " + threadNumber + ": Muestra los numeros primos hasta el " + maxPrimeNumber);
    }

    private void displayCurrentPrime(int value) {
        System.out.println("El Hilo numero " + threadNumber + ": " + value);
    }

    public void getUserNumbers() {
        Scanner readLine = new Scanner(System.in);
        System.out.printf("Introduzca el numero de hilos deseados: ");
        threadNumber = readLine.nextInt();
        readLine.close();
    }
}
