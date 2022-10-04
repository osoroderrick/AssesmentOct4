package assesment;

public class PlaneTicket extends Ticket{
    protected boolean isFrequentFlyer;

    public PlaneTicket(int id, String origin, String destination, String seatNumber, double price) {
        super(id, origin, destination, seatNumber, price);
    }


    @Override
    public void printPaymentAmount() {
        System.out.println(this.getPrice());
    }
}
