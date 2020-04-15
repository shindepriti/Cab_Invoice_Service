package cabinvoice;

public class InvoiceService {
    double COST_PER_KILOMETER = 10;
    int PER_MINUTE_TIME = 1;

    public double getTotalFare(double distance, int time) {
        return COST_PER_KILOMETER*distance+PER_MINUTE_TIME*time;
    }
}
