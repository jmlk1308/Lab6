import java.util.Scanner;

public class Task5 {

    
    static class Rectangle {
        double length;
        double width;

        
        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        
        double calculateArea() {
            return length * width;
        }
    }

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = input.nextDouble();

        System.out.print("Enter width: ");
        double width = input.nextDouble();

        Rectangle rect = new Rectangle(length, width);

        
        System.out.println("The area of the rectangle is: " + rect.calculateArea());

        input.close();
    }
}
