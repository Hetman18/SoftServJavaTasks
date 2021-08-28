import java.util.ArrayList;
import java.util.Scanner;

public class Ticket {

    private int maxTicketNumber;
    private int minTicketNumber;
    Scanner sc = new Scanner(System.in);

    public Ticket(int maxTicketNumber, int minTicketNumber) {
        this.maxTicketNumber = maxTicketNumber;
        this.minTicketNumber = minTicketNumber;
    }

    public int getMaxTicketNumber() {
        return maxTicketNumber;
    }

    public void setMaxTicketNumber(int maxTicketNumber) {

        this.maxTicketNumber = maxTicketNumber;
    }

    public int getMinTicketNumber() {
        return minTicketNumber;
    }

    public void setMinTicketNumber(int maxTicketNumber) {
        this.minTicketNumber = maxTicketNumber;
    }

    public ArrayList<Integer> ticketCounter () {
//        Ticket counter = new Ticket(getMaxTicketNumber(), getMinTicketNumber());
        ArrayList <Integer> ticketsArray = new ArrayList<>();
        for (int i = getMinTicketNumber(); i <= getMaxTicketNumber(); i++) {
            ticketsArray.add(i);
        }
        return ticketsArray;
    }

    public boolean chek(){
        for (Integer ticketNumber : ticketCounter()) {
            String strNumber = String.valueOf(ticketNumber);
            if (strNumber.length() / 6 == 0) {
                System.out.println("Six digits value.");
            } else {
                System.out.println("Not six numbers value.");
                return false;
            }
        char[] charDigit = strNumber.toCharArray();
        int valueFirstThree = 0;
        int valueSecondThree = 0;

        for (int i = 0; i < charDigit.length; i++) {
            if(charDigit.length/2 > i){
                valueFirstThree += Character.getNumericValue(charDigit[i]);
            }
            else{
                valueSecondThree += Character.getNumericValue(charDigit[i]);
            }
        }

        if(valueFirstThree == valueSecondThree){
            return true;
        }
        else return false;

    }

    public int[] tickets() {
        int[] arrayNumbers = new int[6];
        for (Integer arr : arrayNumbers) {
            for (int i = arr; i < 9; i++) {
                arr++;
            }
        }
        return arrayNumbers;
    }

}


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



