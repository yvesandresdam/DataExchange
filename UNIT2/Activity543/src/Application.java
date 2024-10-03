import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Application {
    private static String filePath;
    private BufferedReader fileRead = null;
    private String fileContinue = "";

    public void launch() {
        // ask user file path
        UI.displayFilePath();

        // save the file path
        storeFilePath();

        // working with filepath
        readFile();

        // display the file
        showFile();
    }

    private void storeFilePath() {
        // ask the user for the file path
        Scanner scInput = new Scanner(System.in);
        filePath = scInput.nextLine();

        // Debugging file path
        filePath = "resources/testing.txt";
    }

    private void readFile() {
        try {
            fileRead = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            System.out.println("File not found error");
        }
    }

    private void showFile() {
        try {
            String textLine = fileRead.readLine();
            int numberLine = 0;
            while (textLine != null) {
                System.out.println(textLine);
                textLine = fileRead.readLine();
                numberLine++;

                if (lineStopping(numberLine)) {
                    System.out.println(TranslatorDistribution.PRESS_TO_CONTINUE);

                    Scanner scInput = new Scanner(System.in);
                    fileContinue = scInput.nextLine();
                }
            }
            fileRead.close();
        } catch (IOException e) {
            System.out.println("Input Error");
        }
    }

    private boolean lineStopping(int number) {
        return number % 23 == 0;
    }
}
