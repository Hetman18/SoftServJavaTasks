import java.util.ArrayList;
import java.util.Scanner;

class TriangleSorter extends InPutTriangleParameters {
    private Scanner sc = new Scanner(System.in);
    private String name;
    private double sideA;
    private double sideB;
    private double sideC;

    TriangleSorter(String name, double sideA, double sideB, double sideC) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    TriangleSorter() {

    }

    private String getName() {
        return name;
    }

    private void setName() {
        System.out.println("Please enter name of triangle: ");
        this.name = inPutStringParameters();
    }

    double getSideA() {
        return sideA;
    }

    private void setSideA() {
        System.out.println("Please enter double length of sideA: ");
        this.sideA = inPutFloatParameters();
    }

    double getSideB() {
        return sideB;
    }

    private void setSideB() {
        System.out.println("Please enter double length of sideB: ");
        this.sideB = inPutFloatParameters();
    }

    double getSideC() {
        return sideC;
    }

    private void setSideC() {
        System.out.println("Please enter double length of sideC: ");
        this.sideC = inPutFloatParameters();
    }


    private double calculateTriangleSquare(){
        String [] parameterArray = new String[] {};
        setName();
        setSideA();
        setSideB();
        setSideC();
        new TriangleHelpfulMethods().getControTriangle();
        double squareTriangle;
        double p = new TriangleHelpfulMethods().getHalfTrianglePerimeter();
        squareTriangle = Math.sqrt(p * (p - getSideA()) * (p - getSideB()) * (p - getSideC()));
        triangleArray();
        return squareTriangle;
    }
    double getTriangleSquare(){
        return calculateTriangleSquare();
    }

    String triangleArray() {
        ArrayList<String> triangleList = new ArrayList<>();
        triangleList.add(getName());
        triangleList.add(getTriangleSquare());
        new TriangleHelpfulMethods().selectProcess();
        return outPrint();
    }
    private String outPrint(){
        return (getName() + getTriangleSquare());
    }

    }


