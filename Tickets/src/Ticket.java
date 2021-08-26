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

    public void setMaxTicketNumber() {
        System.out.println("Enter max value with 6 digits of ticket");
        this.maxTicketNumber = sc.nextInt();
    }

    public int getMinTicketNumber() {
        return minTicketNumber;
    }

    public void setMinTicketNumber() {
        System.out.println("Enter min value with 6 digits of ticket");
        this.minTicketNumber = sc.nextInt();
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
        for (Integer ticketNumber : ticketCounter()){
        String strChislo = String.valueOf(ticketNumber);
        if(strChislo.length()/6 == 0){
            System.out.println("Six digits value.");
        }
        else {
            System.out.println("Not six numbers value.");
            return false;
        }
        char[] chaChislo = strChislo.toCharArray();
        int value1 = 0;
        int value2 = 0;

        for (int i = 0; i < chaChislo.length; i++) {
            if(chaChislo.length/2 > i){
                value1 += Character.getNumericValue(chaChislo[i]);
            }
            else{
                value2 += Character.getNumericValue(chaChislo[i]);
            }
        }

        if(value1 == value2){
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



