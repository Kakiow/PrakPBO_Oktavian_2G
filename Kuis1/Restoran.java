//Nama: Oktavian kusuma alghifari, NIM: 254107020239
package Kuis1;

public class Restoran {
    private String nama;
    private double jarakTempuh;

    public Restoran(String nama, double jarakTempuh) {
        this.nama = nama;
        this.jarakTempuh = jarakTempuh;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJarak(double jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }

    public double hitungBiaya(double tarif) {
        return jarakTempuh * tarif;
    }
}
