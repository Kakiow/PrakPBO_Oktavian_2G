package Jobsheet4;

public class MainTugas {
    public static void main(String[] args) {
        Pembeli pembeli = new Pembeli("okta", "test");
        Buku buku = new Buku("test", 7000);
        Transaksi transaksi = new Transaksi(pembeli, buku);
        transaksi.info();
        Struk struk = new Struk("toko buku");
        transaksi.cetak(struk);
    }
}
