import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

class EnvelopeAnalyse extends InPutEnvelopesParameters {
    private float sideA;
    private float sideB;
    private float sideC;
    private float sideD;
    private Scanner sc = new Scanner(System.in);

    EnvelopeAnalyse() {
        this.sideA = getEnvelopeSideA();
        this.sideB = getEnvelopeSideB();
        this.sideC = getEnvelopeSideC();
        this.sideD = getEnvelopeSideD();
    }

    boolean analyseEnvelopesNested() {
        String CDnestedAB = "Envelope CD can be nested to envelope AB!";
        String ABnestedCD = "Envelope AB can be nested to envelope CD!";
        if (sideA > sideC && sideA > sideD && sideB > sideC || sideB > sideD) {
            System.out.println(CDnestedAB);
        } else if (sideB > sideC && sideB > sideD && sideA > sideC || sideA > sideD) {
            System.out.println(CDnestedAB);
        } else if (sideC > sideB && sideC > sideA && sideD > sideB || sideD > sideA) {
            System.out.println(ABnestedCD);
        } else if (sideD > sideB && sideD > sideA && sideC > sideB || sideC > sideA) {
            System.out.println(ABnestedCD);
        } else {
            System.out.println("No one envelope can't be nested to another");
        }
        return inPutValidStringParameters();
    }

    private boolean inPutValidStringParameters(){
        String strAnswer;
        ArrayList<String> list = new ArrayList<>();
        list.add("y");
        list.add("Y");
        list.add("yes");
        list.add("YES");
        while (true) {
            System.out.println("If you want to continue enter 'y' or 'yes': ");
            strAnswer = sc.nextLine();
            if (!list.contains(strAnswer)) {
                continue;
            } else {
            }
        }
        return analyseEnvelopesNested();
    }
}


