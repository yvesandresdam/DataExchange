import java.io.*;
import java.util.Scanner;

public class FileManager {
    private FileReader fileReading = null;
    private BufferedReader fileBuffered = null;
    private FileWriter fileWriting = null;
    private BufferedWriter fileWritingBuffer = null;

    private String contentFile = "";

    private String filePath = "";

    public void fileOperations() {
        setFilePath("resultFolder/inputFile.txt");
        //readFile();
        writeFile();
    }

    private void setFilePath(String path) {
        filePath = path;
    }

    private void readFile() {
        try {
            fileReading = new FileReader(filePath);
            fileBuffered = new BufferedReader(fileReading);

            String readedLine = "";
            while (readedLine != null) {
                contentFile += readedLine;
                readedLine = fileBuffered.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void writeFile() {
        try {
            fileWriting = new FileWriter("resultFolder/outputFile.txt", true);
            fileWritingBuffer = new BufferedWriter(fileWriting);


            String contentLine = "";
            boolean running = true;
            Scanner scInput = new Scanner(System.in);
            PrintWriter fileWriter = new PrintWriter("resultFolder/outputFile.txt");
            while (running) {
                contentLine = scInput.nextLine();
                if (contentLine.equals("exit"))
                    running = false;
                else
                    fileWriter.println(contentLine);
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
