import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Initial investment: ");
        double investment = Double.parseDouble(scan.nextLine());

        System.out.print("Interest: ");
        double interest = Double.parseDouble(scan.nextLine());

        System.out.print("Years: ");
        int years = Integer.parseInt(scan.nextLine());

        MortgageCalculator calc = new MortgageCalculator(investment, interest, years);

        System.out.println("Total value: " + calc.calculateTotal());
    }
}

