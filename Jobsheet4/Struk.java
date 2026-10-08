package Jobsheet4;

public class Struk {
    private String toko;

    public Struk(String toko) {
        this.toko = toko;
    }

    public void cetakStruk(String pembeli, String buku, double total) {
        System.out.println(toko);
        System.out.println("Pembeli: " + pembeli);
        System.out.println("Judul buku:" + buku);
        System.out.println("Total: " + total);
    }
}
