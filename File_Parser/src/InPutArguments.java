import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class InPutArguments {

    Scanner sc = new Scanner(System.in);

    public String inPutFileLink() {
        return sc.nextLine();
    }

    public String inPutMatchText() throws IOException {
        System.out.println("Enter match word: ");
        return sc.nextLine();
    }

    public String inPutChangeStringNumber() {
        System.out.println("Enter string which will paste: ");
        return sc.nextLine();
    }

    public int choseIndexOfString() {
        System.out.println("Enter index of text string from 0 to 3: ");
        int stringNumber = sc.nextInt();
        while (stringNumber <= -1 || stringNumber >= 4){
            System.out.println("Enter wrong index");
            stringNumber = sc.nextInt();
        }
        return stringNumber;
    }
}