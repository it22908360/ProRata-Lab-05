import java.util.Scanner;

public class IT22908360Lab5Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final double DISCOUNT_10 = 10.0;
        final double DISCOUNT_20 = 20.0;

        int startDate, endDate;
        int numberOfDays;
        double discountRate;
        double totalAmount;
        double discountAmount;

        System.out.print("Enter Start Date (1-31): ");
        startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        endDate = input.nextInt();

        // Validation 1
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        // Validation 2
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        numberOfDays = endDate - startDate;

        // Determine discount rate
        if (numberOfDays < 3) {
            discountRate = 0;
        } else if (numberOfDays <= 4) {
            discountRate = DISCOUNT_10;
        } else {
            discountRate = DISCOUNT_20;
        }

        totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;

        discountAmount = totalAmount * discountRate / 100;

        totalAmount = totalAmount - discountAmount;

        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + numberOfDays);
        System.out.println("Total Amount to be Paid: " + totalAmount);
    }
}