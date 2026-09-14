import java.util.Scanner;

public class IT22908360Lab5Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int first, second, third;
        int smallest, largest;

        System.out.print("Enter the first integer: ");
        first = input.nextInt();

        System.out.print("Enter the second integer: ");
        second = input.nextInt();

        System.out.print("Enter the third integer: ");
        third = input.nextInt();

        smallest = first;
        largest = first;

        if (second < smallest) {
            smallest = second;
        }

        if (third < smallest) {
            smallest = third;
        }

        if (second > largest) {
            largest = second;
        }

        if (third > largest) {
            largest = third;
        }

        System.out.println();
        System.out.println("User entered numbers are : " + first + " " + second + " " + third);
        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);
    }
}