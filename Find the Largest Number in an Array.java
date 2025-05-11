import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 30, 15};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Largest number: " + max);
    }
}