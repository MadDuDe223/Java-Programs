import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 5, min = 10, max = 50;
        System.out.print("Random numbers: ");
        for (int i = 0; i < n; i++)
            System.out.print(rand.nextInt(max - min + 1) + min + " ");
    }
}