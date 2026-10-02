//Nama: Oktavian kusuma alghifari, NIM: 254107020239
package Kuis1;

public class Main {
    public static void main(String[] args) {
        Restoran resto = new Restoran("Resto1", 5);
        Kurir kurir = new Kurir("kurir1", 5000);
        Pesanan pesan = new Pesanan("PS-01", 35000);
        resto.hitungBiaya(5000);
        System.out.println("Biaya resto = " + resto.hitungBiaya(5000));
        System.out.println("Biaya total = " + pesan.hitungTotal());
    }
}
