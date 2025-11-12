import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (N) for the Fibonacci series: ");
        
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.close();
            return;
        }
        
        int N = scanner.nextInt();
        scanner.close();

        if (N < 1) {
            System.out.println("N must be a positive integer.");
            return;
        }

        System.out.println("Fibonacci Series up to " + N + " terms:");
        
        long t1 = 0, t2 = 1; 

        for (int i = 1; i <= N; ++i) {
            System.out.print(t1 + (i == N ? "" : ", "));

            
            long nextTerm = t1 + t2;
            t1 = t2;
            t2 = nextTerm;
        }
        System.out.println(); 
    }
}