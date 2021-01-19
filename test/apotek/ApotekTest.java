package apotek;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ApotekTest {
    
    @Test
    public void testHitungPenjualanPerTahun() {
        Apotek ap = new Apotek();
        System.out.println("Test untuk Perhitungan Penjualan Per Tahun :");
        ap.setPenjualanPerBulan(20);
        double expResult = 240;
        double result = ap.PenjualanPerTahun(ap);
        System.out.println(result);
        assertEquals(expResult, result, 0); //(expected, ectual, tolerance)
    }
    
     @Test
    public void testKembalian() {
        Apotek ap = new Apotek();
        System.out.println("Test untuk Test Kembalian :");
        double result = ap.Kembalian(5000, 2000);
         System.out.println(result);
        double result2 = ap.Kembalian(4500, 5000);
         System.out.println(result2);
        double result3 = ap.Kembalian(6000, 3000);
         System.out.println(result3);
        assertEquals(3000, result, 0);
        assertEquals(500, result2, 0);
        assertEquals(3000, result3, 0);
    }
    
     @Test
    public void testStok() {
        Apotek ap = new Apotek();
         System.out.println("Test untuk Test Stok :");
        double result = ap.Stok(100, 50, 20);
         System.out.println(result);
        double result2 = ap.Stok(200, 100, 50);
         System.out.println(result2);
        double result3 = ap.Stok(150, 120, 100);
         System.out.println(result3);
        assertEquals(70, result, 0);
        assertEquals(100, result2, 0);
        assertEquals(130, result3, 0);
    }
}
