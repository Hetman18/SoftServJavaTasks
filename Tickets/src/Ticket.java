import java.util.ArrayList;
import java.util.List;

public class Ticket {

    private int ticketNumber;
    static ArrayList<Ticket> ticketsNumberList;

    public Ticket(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Ticket() {

    }

    public int[] numberArray() {
        int [] arrayNumbers = new int[] {0, 0, 0, 0, 0, 0};
        for (Integer arr : arrayNumbers) {
            for (int i = arr; i < 9; i++) {
                arr++;
            }
        }
//            for (int j = 0; j < arrayNumbers.length; j++) {
//                arrayNumbers[j] = j;
//                for (arrayNumbers[j] = 0; arrayNumbers[j] < 9; arrayNumbers[j]++) {
//
//                }
//        }
//        List<Ticket> ticketsArray = new ArrayList<>();
//        for (int i = 0; i < ; i++) {
//
//        }
    return arrayNumbers;
    }

//    public List<Integer> inPutNumbers() {
//
//        for (int i = this.ticketNumber; i < 1000000; i++) {
//        }
//        return ticketsNumberList.add(new Ticket (this.ticketNumber));;
//    }

//    public ArrayList<Integer> segregationTicketsNumber() {
//        for (Integer number : inPutNumbers()) {
//            if (number < 1001) {
//                continue;
//            }
//            ArrayList<Integer> numberArray = new ArrayList<>();
//            while (number > 0) {
//                numberArray.add(number % 10);
//                number /= 10;
//            }
//            return numberArray;
//        }
//        return null;
//    }
//    public int easyMethod() {
//        int happyEasyCounter = 0;
//        ArrayList<Integer> numbers;
//        numbers = segregationTicketsNumber();
//        int sumLeft = numbers.get(0) + numbers.get(1) + numbers.get(2);
//        int sumRight = numbers.get(3) + numbers.get(4) + numbers.get(5);
//        if (sumLeft == sumRight) {
//            happyEasyCounter++;
//        }
//        return happyEasyCounter;
//    }
//
//    public int hardMethod() {
//        int happyHardCounter = 0;
//        ArrayList<Integer> numbers;
//        numbers = segregationTicketsNumber();
//        int sumEven = numbers.get(0) + numbers.get(2) + numbers.get(4);
//        int sumOdd = numbers.get(1) + numbers.get(3) + numbers.get(5);
//        if (sumEven == sumOdd) {
//            happyHardCounter++;
//        }
//        return happyHardCounter;
//    }

    public void outPutEasyMethod(){
        for (Integer number : numberArray()) {
            System.out.println(number);
        }
    }
}

