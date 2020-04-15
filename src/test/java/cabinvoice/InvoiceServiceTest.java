package cabinvoice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceServiceTest {
    InvoiceService invoiceService;

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
}
