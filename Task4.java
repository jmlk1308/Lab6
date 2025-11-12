import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String originalString = scanner.nextLine();
        scanner.close();

       
        String cleanedString = originalString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = check(cleanedString);

        if (isPalindrome) {
            System.out.println("\n\"" + originalString + "\" IS a palindrome.");
        } else {
            System.out.println("\n\"" + originalString + "\" is NOT a palindrome.");
        }
    }

   
    private static boolean check(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
           
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
      
        return true;
    }
}