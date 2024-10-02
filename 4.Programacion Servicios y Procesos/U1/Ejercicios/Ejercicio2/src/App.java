import java.util.Scanner;

public class App {

    private static int threadNumber;

    public void startProgram(){
        setThreadNumber();
        startTask();
    }

    public void setThreadNumber(){
        Scanner textInput = new Scanner(System.in);
        System.out.print("Indique el numero de hilos que desea lanzar: ");
        threadNumber = textInput.nextInt();
        textInput.close();
    }

    public void startTask() {
        for(int i = 1; i <= threadNumber; i++){
            Runnable r = new Task(i);
            Thread t = new Thread(r);
            t.start();
        }
    }
}
