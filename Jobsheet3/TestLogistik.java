package Jobsheet3;

import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
     Scanner okta = new Scanner(System.in);
     Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);
     
     System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
     System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

     System.out.println("\nMemasukkan muatan baru");
     double muat1 = okta.nextDouble();
     kontainerAlfa.tambahMuatan(muat1);
     System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

     System.out.println("\nMemasukkan muatan baru");
     double muat2 = okta.nextDouble();
     kontainerAlfa.tambahMuatan(muat2);
     System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

     System.out.println("\nMembongkar muat/menurunkan barang seberat");
     double bongkar1 = okta.nextDouble();
     kontainerAlfa.turunkanMuatan(bongkar1);
     System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

     System.out.println("\nMembongkar muat/menurunkan barang seberat");
     double bongkar2 = okta.nextDouble();
     kontainerAlfa.turunkanMuatan(bongkar2);
     System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
    }
}
