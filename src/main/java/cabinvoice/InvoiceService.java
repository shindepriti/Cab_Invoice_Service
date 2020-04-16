package cabinvoice;

public class InvoiceService {

    double COST_PER_KILOMETER = 10;
    int PER_MINUTE_TIME = 1;
    double MINIMUM_FARE = 5;

    public double getTotalFare(double distance, int time) {
        double totalFare = COST_PER_KILOMETER*distance+PER_MINUTE_TIME*time;
        return Math.max(totalFare,MINIMUM_FARE);
    }

    public InvoiceSummery getTotalFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride:rides) {
           totalFare += this.getTotalFare(ride.distance,ride.time);
        }
        return new InvoiceSummery(rides.length,totalFare);
    }
}
