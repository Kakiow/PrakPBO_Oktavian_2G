//Nama: Oktavian kusuma alghifari, NIM: 254107020239
package Kuis1;

public class Kurir {
    private String nama;
    private double tarif;

    public Kurir(String nama, double tarif) {
        this.nama = nama;
        this.tarif = tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    public double hitungKirim(Restoran restoran) {
        return restoran.hitungBiaya(tarif);
    }
}
