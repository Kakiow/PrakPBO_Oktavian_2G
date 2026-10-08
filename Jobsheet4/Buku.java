package Jobsheet4;

public class Buku {
    private String judul;
    private double harga;

    public Buku(String judul, double harga) {
        this.judul = judul;
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public double getHarga() {
        return harga;
    }
}
