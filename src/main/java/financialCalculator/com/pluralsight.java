package financialCalculator.com;

import java.util.Scanner;

public class pluralsight {
    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter principal: ");
            double principal = scanner.nextDouble();

            Scanner intrestRate = new Scanner(System.in);
            System.out.print("Enter intrest rate: ");
              double interestRate = scanner.nextDouble();

            System.out.print("Enter loan length: ");
            int loanLength = scanner.nextInt();

            int monthlydays = 30;
            int numberOfPayments = loanLength * monthlydays;

            double monthlyPayment = principal * (interestRate * (Math.pow(1 + interestRate,numberOfPayments)))
                    / ((Math.pow(1 + interestRate, numberOfPayments)) - 1);

            // (monthlyInterest * mathPower / (mathPower - 1));


            /* Calculate compound interest */
            double CI = principal * (Math.pow((1 + interestRate / 100), loanLength));

            System.out.println("Compound Interest is "+ CI);


        }
    }
}
