import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String name = "";
        System.out.print("Enter your name: ");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            name = reader.readLine();
        } catch (IOException e) {
            System.err.println("Error reading name: " + e.getMessage());
            return;
        }

       
        int age = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
            } else {
                System.out.println("Invalid age input. Using default age 0.");
            }
        }

        
        System.out.println("\nHello, " + name + "! You are " + age + " years old.");
    }
}