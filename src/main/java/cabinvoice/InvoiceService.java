package cabinvoice;

public class InvoiceService {

    private final double COST_PER_KILOMETER = 10;
    private final int PER_MINUTE_TIME = 1;
    private final double MINIMUM_FARE = 5;
    private RideRepository rideRepository;

    public InvoiceService() {
        this.rideRepository = new  RideRepository();
    }

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

    public void addRides(String userId, Ride[] rides) {
       rideRepository.addRides(userId,rides);
    }

    public InvoiceSummery getInvoiceSummery(String userId) {
        return this.getTotalFare(rideRepository.getRides(userId));
    }
}
