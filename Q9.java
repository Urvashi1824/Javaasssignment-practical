import movieticket.RegularTicket;
import movieticket.PremiumTicket;
import movieticket.VIPTicket;

public class Q9
{
    public static void main(String args[])
    {
        RegularTicket r = new RegularTicket("Dhurandhar","PVRcinema",10);
        r.confirmBooking();
        System.out.println("---------------");

        PremiumTicket p = new PremiumTicket("Dhurandhar","PVRcinema",10);
        p.confirmBooking();
        System.out.println("---------------");

        VIPTicket v = new VIPTicket("Dhurandhar","PVRcinema",10);
        v.confirmBooking();
    }
}