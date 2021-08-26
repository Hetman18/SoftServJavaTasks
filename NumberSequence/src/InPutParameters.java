import java.util.Scanner;

public class InPutParameters {

    public int inPutParameters() {
        Scanner sc = new Scanner(System.in);
        int inPutNumber = 0;
        do {
            System.out.println("Please enter a positive number!");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next();
            }
            inPutNumber = sc.nextInt();
        } while (inPutNumber <= 0);
        {
            System.out.println("Thank you! Number " + inPutNumber);
        }
        return inPutNumber;
    }
}
