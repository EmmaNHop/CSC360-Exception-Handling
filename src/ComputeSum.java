import java.util.InputMismatchException;
import java.util.Scanner;

public class ComputeSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = readIntGreaterThanOrEqualTo(input, 0);
        int num2 = readIntGreaterThanOrEqualTo(input, num1);
        double exp = readDouble(input);

        System.out.println("sum = " + calculations(num1,num2,exp));
    }

    public static int readIntGreaterThanOrEqualTo(Scanner input, int lowerBound) {
        boolean continueInput = true;
        int nextNum = 0;
        do {
            try {
                System.out.print("Enter an integer greater than or equal to " + lowerBound + ": ");  // Prompts the user for an integer that is >= lowerBound.
                nextNum = input.nextInt(); // Keeps prompting and reading from the input scanner until it receives
                System.out.println("The number entered is " + nextNum); //Displays the result

                if (nextNum >= lowerBound){
                    continueInput = false;
                }
                else {
                    System.out.println("Try again. The number must be grater than or equal to "+lowerBound+"");
                }
            }
            catch (InputMismatchException ex) {
                System.out.println("Try again. An integer is required.");
                input.nextLine(); // discard input
            }
        } while (continueInput);
        return nextNum; // a valid entry. Returns that entry
    }

    public static double readDouble(Scanner input){
        double nextDouble= 0.0;
        boolean continueInput = true;
        do {
            try {
                System.out.print("Enter a floating point number: ");  // Prompts the user for a double.
                nextDouble = input.nextDouble(); // Keeps prompting and reading from the input scanner until it receives
                continueInput=false;
            }
            catch(InputMismatchException ex)
            {
                System.out.println("Try again. A floating point number is required");
                input.nextLine();
            }
        }while(continueInput);
        return (nextDouble); // a valid entry. Returns that entry.
    }

    public static double calculations(int n1, int n2, double n3) {
        double total=0.0;
        for(int x=n1;x<=n2;x++) {
            total+=Math.pow(x,n3);
        }
        return (total);
    }
}
