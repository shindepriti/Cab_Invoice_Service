package cabinvoice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceServiceTest {
    private InvoiceService invoiceService;

    @Before
    public void initialize() {
    invoiceService = new InvoiceService();
    }

    @Test
    public void givenDistanceAndTime_shouldReturnTotalFare() {
        double distance = 2.0;
        int time = 2;
        double fare = invoiceService.getTotalFare(distance,time);
        Assert.assertEquals(22,fare,0.0);
    }

    @Test
    public void givenLessDistanceAndTime_shouldReturnMinimumFare() {
        double distance = 0.1;
        int time = 1;
        double fare = invoiceService.getTotalFare(distance,time);
        Assert.assertEquals(5.0,fare,0.0);
    }

    @Test
    public void givenMultipleRides_shouldReturnTotalFare() {
        Ride[] rides = {new Ride(2.0,5),
                        new Ride(0.1,1) };
        double fare = invoiceService.getTotalFare(rides);
        Assert.assertEquals(30,fare,0.0);
    }
}
