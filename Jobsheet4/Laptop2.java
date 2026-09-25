package Jobsheet4;

public class Laptop2 {
    private String merk;
    private Printer printer;

    public Laptop2(String merk, Printer printer) {
        this.merk = merk;
        this.printer = printer;
    }

    public void cetakDokumen(String namaFile) {
        System.out.println(merk + " mengirim dokumen ke printer...");
        printer.cetak(namaFile);
    }
}