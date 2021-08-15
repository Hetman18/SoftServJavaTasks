import java.util.ArrayList;
import java.util.Scanner;

class TriangleHelpfulMethods extends TriangleSorter {
    private Scanner sc = new Scanner(System.in);
    private boolean controlTriangle() {
        while (getSideA() + getSideB() <= getSideC() ||
                getSideA() + getSideC() <= getSideB() || getSideB() + getSideC() <= getSideA()) {
            System.out.println("Triangle with this parameters can't be.");
            getTriangleSquare();
        }
        return true;
    }
boolean getControTriangle(){
        return controlTriangle();
}
   private double calculateHalfPerimeter(){
        double halfPerimeter;
        halfPerimeter = (getSideA() + getSideB() + getSideC()) / 2;
        return halfPerimeter;
    }
    double getHalfTrianglePerimeter() {
        return calculateHalfPerimeter();
    }
    double selectProcess() {

        System.out.println("Do you want to continue? Print 'y' or 'yes', if don't another: ");
        ArrayList<String> list = new ArrayList<>();
        list.add("y");
        list.add("yes");
        list.add("Y");
        list.add("YES");
        String answer = sc.nextLine();
        try {
            if (true) {
                list.contains(answer);
            }
            return getTriangleSquare();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return triangleArray();
    }

}
