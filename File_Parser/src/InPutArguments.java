import java.io.IOException;
import java.util.Scanner;

public class InPutArguments {

    Scanner sc = new Scanner(System.in);

    public String inPutFileLink() {
        return sc.nextLine();
    }

    public String inPutMatchText() {
        System.out.println("Enter match word: ");
        return sc.nextLine();
    }

    public String getInPutChangeStringNumber() {
        System.out.println("Enter string which will paste: ");
        return sc.nextLine();
    }

    public int choseIndexOfString() throws IOException {
        System.out.println("Enter index of text string from 0 to 3: ");
        int stringNumber = sc.nextInt();
        while (stringNumber <= -1 || stringNumber > 3) {
            System.out.println("Enter wrong index");
            stringNumber = sc.nextInt();
        }
        return stringNumber;
    }
}