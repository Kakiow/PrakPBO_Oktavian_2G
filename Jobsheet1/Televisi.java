package Jobsheet1;

public class Televisi {
    private String merk;
    private int ukuran;

    public void Merk(String merk) {
        this.merk = merk;
    }

    public void Ukuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public void print() {
        System.out.println("Merk: " + merk);
        System.out.println("Ukuran layar: " + ukuran);
    }
}
