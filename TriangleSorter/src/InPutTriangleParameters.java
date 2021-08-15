import java.util.Scanner;

class InPutTriangleParameters {

    Scanner sc = new Scanner(System.in);

    protected float inPutFloatParameters() {
        float parameter;
        while (true) {
            try {
                parameter = sc.nextFloat();
                while (parameter <= 0) {
                    System.err.println("Please enter float parameter more than 0:");
                    parameter = sc.nextFloat();
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Enter float number please!");
                continue;
            }
            return parameter;
        }
    }

    protected String inPutStringParameters() {
        return sc.nextLine();
    }


}
