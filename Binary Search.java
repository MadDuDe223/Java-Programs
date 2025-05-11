import java.util.Arrays;

public class BinarySearch {
    static int binarySearch(int[] arr, int key) {
        int result = Arrays.binarySearch(arr, key);
        return result >= 0 ? result : -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int key = 23;
        int result = binarySearch(arr, key);
        System.out.println(result != -1 ? "Found at index " + result : "Not Found");
    }
}