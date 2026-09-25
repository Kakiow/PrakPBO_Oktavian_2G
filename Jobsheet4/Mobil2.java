package Jobsheet4;

public class Mobil2 {
    private String merek;
    private Mesin mesin;

    public Mobil2(String merek) {
        this.merek = merek;
        this.mesin = new Mesin();
    }

    public Mobil2(String merek, Mesin mesin) {
        this.merek = merek;
        this.mesin = mesin;
    }

    public void tampilkanInfo() {
        System.out.println("Mobil: " + merek);
        System.out.println("Mesin: " + mesin.getTipe());
    }
}
