import java.util.ArrayList;
import java.util.Scanner;

class InPutEnvelopesParameters {
    private Scanner sc = new Scanner(System.in);
//    private EnvelopeAnalyse reAnalyse = new EnvelopeAnalyse();

    float getEnvelopeSideA() {
        System.out.println("Enter float side A: ");
        return inputValidFloatParameters();
    }

    float getEnvelopeSideB() {
        System.out.println("Enter float side B: ");
        return inputValidFloatParameters();
    }

    float getEnvelopeSideC() {
        System.out.println("Enter float side C: ");
        return inputValidFloatParameters();
    }

    float getEnvelopeSideD() {
        System.out.println("Enter float side D: ");
        return inputValidFloatParameters();
    }

    private float inputValidFloatParameters() {
        float parameter;
        while (true) {
            try {
                parameter = Float.parseFloat(sc.nextLine());
                while (parameter <= 0) {
                    System.err.println("Please enter positive float parameter!");
                    parameter = Integer.parseInt(sc.nextLine());
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong input format");
                continue;
            }
            return parameter;
        }
    }
    String inPutValidStringParameters(){
        String strAnswer;
        ArrayList<String> list = new ArrayList<>();
        list.add("y");
        list.add("Y");
        list.add("yes");
        list.add("YES");
        while (true){
            try {
                System.out.println("If you want to continue enter 'y' or 'yes': ");
                strAnswer = sc.nextLine();
                if (list.contains(strAnswer)) {
                   inputValidFloatParameters();
                }
            } catch (IllegalArgumentException e){
            System.out.println("Wrong enter!");
            System.exit(0);
            }
        }
    }
}

