package cabinvoice;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceServiceTest {
    @Test
    public void givenDistanceAndTime_shouldReturnTotalFare() {
        InvoiceService invoiceService = new InvoiceService();
        double distance = 2.0;
        int time = 2;
        double fare = invoiceService.getTotalFare(distance,time);
        Assert.assertEquals(22,fare,0.0);
    }

}
