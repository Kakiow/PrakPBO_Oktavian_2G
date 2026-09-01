package Jobsheet1;

public class Dompet {
    private String merk;
    private String bahan;

    public void Merk(String merk) {
        this.merk = merk;
    }

    public void Bahan(String bahan) {
        this.bahan = bahan;
    }

    public void print() {
        System.out.println("Merk: " + merk);
        System.out.println("Bahan: " + bahan);
    }
}
