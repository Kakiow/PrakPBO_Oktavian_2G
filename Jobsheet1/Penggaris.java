package Jobsheet1;

public class Penggaris {
    private String merk;
    private int panjang;

    public void Merk(String merk) {
        this.merk = merk;
    }

    public void Panjang(int panjang) {
        this.panjang = panjang;
    }

    public void print() {
        System.out.println("Merk: " + merk);
        System.out.println("Panjang penggaris: " + panjang);
    }
}
