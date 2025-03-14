import java.util.Scanner;

public class Vowel{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
         int vowelCount = 0;
        for (char ch : input.toLowerCase().toCharArray()) {
            if (isVowel(ch)) {
                System.out.println(ch + " is a vowel.");
                vowelCount++;
            }
        }

        System.out.println("Total number of vowels: " + vowelCount);
        scanner.close();
    }
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
