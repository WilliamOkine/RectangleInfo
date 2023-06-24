import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double height = 0;
        double width = 0;

        System.out.print(" Enter the width of the rectangle? ");
        while (true) {
            if (scan.hasNextDouble()) {
                width = scan.nextDouble();
                break;
            } else {
                System.out.print(" Please enter a valid number? ");
                scan.nextLine();
            }
        }

        System.out.print(" Enter the height of the rectangle? ");
        while (true) {
            if (scan.hasNextDouble()) {
                height = scan.nextDouble();
                break;
            } else {
                System.out.print(" Please enter a valid number? ");
                scan.nextLine();
            }
        }
        double area = height * width;
        double diagonal1 = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
        double diagonal2 = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
        System.out.println(" The area of your triangle is " + area);
        System.out.println  (" The diagonal of your triangle is " + diagonal2);
    }
}