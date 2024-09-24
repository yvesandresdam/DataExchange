import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TypeFinder {
    public enum FileType {
        BMP,
        UNKNOWN
    }

    public static void getType() {

    }

    public static void FileWork(){
        String path = "images/imagen1.bmp";
        try {
            FileInputStream fileInput = new FileInputStream(path);

            byte[] buffer2Bytes = new byte[2];
            int valueReaded = fileInput.read(buffer2Bytes);

            FileType fileType = getFileType(buffer2Bytes);
            UI.DisplayFileType(fileType);

            byte[] buffer6Bytes = new byte[6];
            int valueReaded6Bytes = fileInput.readNBytes(buffer6Bytes,2,4);
            int fileSize = getFileSize(buffer6Bytes);

        } catch (FileNotFoundException f) {
            System.out.println("Error");
        } catch (IOException io){
            System.out.println("Error");
        }
    }
    private static FileType getFileType(byte[] buffer){
        FileType result;
        String hexadecimalValue = "";

        for(byte b : buffer){
            int value = (int)b;
            hexadecimalValue += Integer.toHexString(value & 0xFF);
        }
        System.out.println(hexadecimalValue);

        switch(hexadecimalValue){
            case "424d":
                result = FileType.BMP;
                break;
            default:
                result = FileType.UNKNOWN;
                break;
        }
        return result;
    }

    private static int getFileSize(byte[] buffer){
        String value = "";
        int number;
        for(byte b : buffer){
            number = (int)b;
            value += Integer.toHexString(number & 0xFF);
        }
        System.out.println(value);
        getSize(buffer);
        return 1;
    }

    private static int getSize(byte[] buffer){

    }
}
