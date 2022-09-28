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
        double tip = (double) bill*percent/100;
        double tipper = (double) tip/people;
        System.out.println("Your total tip is " + tip);
        System.out.println("The total tip for each person is " + tipper);
    }
}
