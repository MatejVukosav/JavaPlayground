import java.util.Random;

/**
 * Created by Vuki on 9.9.2017..
 */
public class Main {


    private static int MAX = 1000;
    private static boolean[] numbers;

    public static void main(String[] args) {

        Random generator = new Random();
        numbers = new boolean[MAX + 1];

        for (int i = 0; i < MAX; i++) {
            System.out.println(getRandomWithoutDuplicates(generator));
        }
    }

    private static int getRandomWithoutDuplicates(Random generator) {
        int randomNum;
        do {
            randomNum = generator.nextInt(MAX);
        } while (numbers[randomNum]);
        numbers[randomNum] = true;
        return randomNum;
    }
}
