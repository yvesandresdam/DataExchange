import java.io.*;
import java.util.Scanner;

public class FileSystem {
    private String path;
    private File file;
    private static boolean overwriteFile;

    int currentLine = 1;

    public void setPath() {
        Scanner sc = new Scanner(System.in);
        path = sc.nextLine();
        file = new File(path);
    }

    public boolean checkExistence() {
        return file.exists();
    }

    public void overwriteFile() {
        System.out.println("Quiere sobreescribir el archivo?\ns/n");

        Scanner sc = new Scanner(System.in);
        String userAnswer = sc.nextLine();

        while (!(userAnswer.equals("s") || userAnswer.equals("n")))
            System.out.println("Introduzca un valor valido");

        if (userAnswer.equals("s"))
            overwriteFile = true;

    }

    public void createStringLine(boolean overwriteFile) {

        // User text input
        Scanner sc = new Scanner(System.in);
        String insertLine = sc.nextLine();

        // Flag to quit the application
        if (insertLine.equals("exit")) {
            Application.setFlagRunning(false);
            return;
        }

        // Every try/catch group inserts a new line in file
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));
            pw.printf("%d\t" + insertLine + "\n", currentLine);
            currentLine++;
        } catch (IOException e) {
            System.out.println("Error de entrada");
        } finally {
            pw.close();
        }
    }

    public static boolean getOverwriteFile() {
        return overwriteFile;
    }
}
