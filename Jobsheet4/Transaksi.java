package Jobsheet4;

public class Transaksi {
    private Pembeli pembeli;
    private Nota nota;
    private Buku buku;

    public Transaksi(Pembeli pembeli, Buku buku) {
        this.pembeli = pembeli;
        this.buku = buku;
        this.nota = new Nota(buku.getHarga());
    }

    public void cetak(Struk struk) {
        struk.cetakStruk(pembeli.getNama(), buku.getJudul(), nota.getTotal());
    }

    public void info() {
        System.out.println("Pembeli: " + pembeli.getNama());
        System.out.println("Alamat: " + pembeli.getAlamat());
        System.out.println("Judul buku: " + buku.getJudul());
        System.out.println("Total: " + nota.getTotal());
    }
}
