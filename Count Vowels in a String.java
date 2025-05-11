public class VowelCount {
    static int countVowels(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Vowel count: " + countVowels(str));
    }
}