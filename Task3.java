import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        final int COUNT = numbers.length;

        System.out.println("Please enter 5 integers:");

        
        for (int i = 0; i < COUNT; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            if (scanner.hasNextInt()) {
                numbers[i] = scanner.nextInt();
                sum += numbers[i]; 
            } else {
                System.out.println("Invalid input, using 0 for this number.");
                numbers[i] = 0;
                scanner.next(); 
            }
        }

        
        double average = (double) sum / COUNT;

     
        System.out.println("\n--- Results ---");
        System.out.print("Numbers entered: ");
        for (int i = 0; i < COUNT; i++) {
            System.out.print(numbers[i] + (i == COUNT - 1 ? "" : " "));
        }
        System.out.println("\nTotal Sum: " + sum);
        System.out.printf("Average: %.2f%n", average); 

        scanner.close();
    }
}