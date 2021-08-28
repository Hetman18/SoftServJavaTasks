public class TicketsMain {

    public static void main(String[] args) {
        InPutValue inPut = new InPutValue();
        Tickets ticket = new Tickets(inPut.getMinMax(), inPut.getMinMax());
        ticket.outHappyEasyTickets();
    }
}
