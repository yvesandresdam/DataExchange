import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utils {
    public static int getRandomNumber(int minValue, int maxValue) {
        Random random = new Random();
        return random.nextInt(minValue, maxValue);
    }

    public static List<Integer> getPrimeNumberList(int minValue, int maxValue) {

        List<Integer> listNumbersResult = new ArrayList<Integer>();
        for (int i = minValue; i < maxValue; i++) {
            if (isPrime(i))
                listNumbersResult.add(i);
        }
        return listNumbersResult;
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
