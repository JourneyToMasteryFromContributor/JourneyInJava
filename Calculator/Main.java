import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Welcome to the calculator app!\n");

        Scanner scan = new Scanner(System.in);
        boolean tryAgain = true;

        // Until the user prompts "N" into the loop it will continue the sequence
        while (tryAgain) {
            System.out.print("Please enter your first number: ");
            Double firstNumber = scan.nextDouble();

            System.out.print("Please enter an operator: ");
            String operator = scan.next();

            System.out.print("Please enter the number you want to \"" + operator + "\" with: ");
            Double secondNumber = scan.nextDouble();

            Calculator calculation = new Calculator(firstNumber, operator, secondNumber);
            System.out.println("\nThe result is: " + calculation.calculate());

            System.out.print("Would you like to try again? Y/N:");
            String askTryAgain = scan.next().strip().toUpperCase();

            if (askTryAgain.equals("N")){
                System.out.print("Goodbye");
                tryAgain = false;
            }
        }
    }
}
