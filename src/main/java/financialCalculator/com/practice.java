package financialCalculator.com;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Number of donuts: ");
        int donuts = scanner.nextInt();

        System.out.print("how many glazed: ");
        int glazed = scanner.nextInt();

        System.out.print("how many hours till pick up: ");
        int timeTill = scanner.nextInt();

        int hoursWaited = 3;
        int HoursLeft = timeTill - hoursWaited;
       System.out.println("You have: " + HoursLeft + " hour left till pick up");

    }

}
