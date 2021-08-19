import java.util.Scanner;

public class InPutParameters {
    Scanner sc = new Scanner(System.in);

    public int inPutParameters() {
        int inPut = 0;
        try {
            inPut = sc.nextInt();
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Enter wrong format! ");
        }
        if (inPut > 0) {
            return inPut;
        } else {
            System.out.println("Wrong enter, please, enter integer number more then 0: ");
            return inPutParameters();
        }
    }
}
