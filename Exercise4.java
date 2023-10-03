import java.util.Scanner;

class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

            System.out.print("Do you want to perform the operation again? (yes/no): ");
            choice = scanner.next().toLowerCase();

        } while (choice.equals("yes"));
        scanner.close();
    }
}
