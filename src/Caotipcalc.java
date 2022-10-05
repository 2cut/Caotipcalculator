import java.util.Scanner;

public class Caotipcalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* asking questions */
        System.out.println("How much was the bill?");
        double bill = scan.nextDouble();
        System.out.println("What percent would you like to tip?");
        double percent = scan.nextDouble();
        System.out.println("How many people are there?");
        double people = scan.nextDouble();

        /* Calculating */
        double tip = bill*percent/100;
        double tipPer = tip/people;
        double roundTipper = Math.round(tipPer*100.0);
        double billTip = bill + tip;
        double totalPer = billTip/people;

        /* Results */
        System.out.println("Your total tip is " + tip);
        System.out.println("The total bill including tip is " + billTip);
        System.out.println("The tip per person is " + roundTipper/100.0);
        System.out.println("The total for each person is " + totalPer);
    }
}
