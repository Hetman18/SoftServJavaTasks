import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Ticket {
    private int minValueNumber;
    private int maxValueNumber;

    public ArrayList<Integer> ticketsNumber() {
        minValueNumber = 000000;
        maxValueNumber = 999999;
        ArrayList<Integer> ticketsNumbers = new ArrayList<>();

        for (int i = 0; i < maxValueNumber; i++) {
            ticketsNumbers.add(i);
            System.out.println(ticketsNumbers);
        }
        return ticketsNumbers;
    }
}
