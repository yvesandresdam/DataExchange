import java.util.Random;

public class Utils {

    public static int getRandomIntNumber(int min, int max){
        Random random = new Random();
        return random.nextInt() * max;
    }



}
