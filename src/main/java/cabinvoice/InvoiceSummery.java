package cabinvoice;

public class InvoiceSummery {

    private final double totalFare;
    private final int numberOfRides;
    private final double averageFare;

    public InvoiceSummery(int numberOfRides, double totalFare) {
        this.numberOfRides = numberOfRides;
        this.totalFare = totalFare;
        this.averageFare = this.totalFare/this.numberOfRides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummery that = (InvoiceSummery) o;
        return Double.compare(that.totalFare, totalFare) == 0 &&
                numberOfRides == that.numberOfRides &&
                Double.compare(that.averageFare, averageFare) == 0;
    }
}
