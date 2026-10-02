//Nama: Oktavian kusuma alghifari, NIM: 254107020239
package Kuis1;

public class Pesanan {
    private String kode;
    private double totalHarga;
    private Kurir kurir;

    public Pesanan(String kode, double totalHarga) {
        this.kode = kode;
        this.totalHarga = totalHarga;
    }

    public double hitungTotal() {
        return kurir.hitungKirim(null) + totalHarga;
    }
}
