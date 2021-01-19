package apotek;

public class Apotek {
   private int idObat;
   private String namaObat;
   private double hargaObat;
   private double penjualanPerBulan ;

    public int getIdObat() {
        return idObat;
    }

    public void setIdObat(int idObat) {
        this.idObat = idObat;
    }

    public String getNamaObat() {
        return namaObat;
    }

    public void setNamaObat(String namaObat) {
        this.namaObat = namaObat;
    }

    public double getHargaObat() {
        return hargaObat;
    }

    public void setHargaObat(double hargaObat) {
        this.hargaObat = hargaObat;
    }

    public double getPenjualanPerBulan() {
        return penjualanPerBulan;
    }

    public void setPenjualanPerBulan(double penjualanPerBulan) {
        this.penjualanPerBulan = penjualanPerBulan;
    }
    

    public double PenjualanPerTahun(Apotek ap) {
      double penjualanPerTahun = 0;
      penjualanPerTahun = ap.getPenjualanPerBulan() * 12;
      return penjualanPerTahun;
   }
    
    public double Kembalian (double jual, double bayar){
        double kembalian = 0;
        
        if(bayar>jual){
            kembalian = bayar - jual;
        }else if(bayar < jual){
            kembalian = jual - bayar;
        }else {
            kembalian = 0;
        }
        return kembalian;
    }
    
    public double Stok (double gudang, double jual, double reStok){
        double stok = 0;
        stok = gudang - jual;
        if(stok <= 50){
            stok = gudang + reStok - jual;
        } else if(stok > 51){
            stok = gudang - jual;
        }
        
        return stok;
    }
    
   void tampil(){
        Apotek ap = new Apotek();
        System.out.println("\nId Obat : "+ this.idObat);
        System.out.println("Nama Obat : "+ this.namaObat);
        System.out.println("Harga Obat : "+ this.hargaObat);
        System.out.println("Penjualan Per Bulan : "+ this.penjualanPerBulan);
        System.out.println("Penjualan Per Tahun : "+ ap.PenjualanPerTahun(this));
    }
     

public static void main (String [] args){
    Apotek ap = new Apotek ();
    System.out.println("Data Obat: ");
    ap.setIdObat(1234);
    ap.setNamaObat("Panadol");
    ap.setHargaObat(2000);
    ap.setPenjualanPerBulan(80); 
    ap.tampil();
   } 
}
