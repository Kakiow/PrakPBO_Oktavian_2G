package Jobsheet1;

public class Kompor {
    private String merk;
    private int tungku;

    public void Merk(String merk) {
        this.merk = merk;
    }

    public void Tungku(int tungku) {
        this.tungku = tungku;
    }

    public void print() {
        System.out.println("Merk: " + merk);
        System.out.println("Jumlah tungku: " + tungku);
    }
}
