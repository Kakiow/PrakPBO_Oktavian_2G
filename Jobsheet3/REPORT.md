|  | Pemrograman Berbasis Objek |
|--|--|
| NIM |  254107020239|
| Nama |  Oktavian Kusuma Alghifari |
| Kelas | TI - 2G |
| Repository | [link] (https://github.com/Kakiow/PrakPBO_Oktavian_2G.git) |

# Labs #3 Enkapsulasi Pada Pemrograman Berorientasi Objek

## 3.1  Percobaan 1

kode berada di file Motor.java, MotorDemo.java  berikut adalah output nya

```
Kontak Off
Kecepatan 0

Kontak Off
Kecepatan 50
```

## 3.2 Percobaan 2

kode berada di file Motor.java, MotorDemo.java  berikut adalah output nya

```
Kontak Off
Kecepatan 0

Kecepatan tidak bisa bertambah karena mesin off! 

Kontak On
Kecepatan 0

Kontak On
Kecepatan 5

Kontak On
Kecepatan 10

Kontak On
Kecepatan 15

Kontak Off
Kecepatan 0
```

## 3.3 Pertanyaan
1. Pada class Motor, saat kita menambah kecepatan untuk pertama kalinya, mengapa
muncul peringatan “Kecepatan tidak bisa bertambah karena Mesin Off!”?
Jawab:
Karena pada saat kita memanggil fungsi tambahkecepatan kontakOn masih bernilai false
2. Mengapa atribut kecepatan dan kontakOn diset private?
Jawab:
Agar mencegah class lain untuk langsung mengakses dan mengubah nilai atribut tersebut
3. Ubah class Motor sehingga kecepatan maksimalnya adalah 100!
Jawab:
```
package Jobsheet3;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontakOn == true) {
            if (kecepatan + 5 <= 100) {
                kecepatan += 5;
            } else {
                kecepatan = 100;
            }
        }
        else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin off! \n");
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 5;
        }
        else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin off \n");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        }
        else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan +"\n");
    }
}
```
 

## 3.4 Percobaan 3

kode berada di file Anggota.java, KoperasiDemo.java  berikut adalah output nya

```
Simpanan Iwan Setiawan : Rp 100000.0
Simpanan Iwan Setiawan : Rp 95000.0
```

## 3.5 Percobaan 4

kode berada di file Anggota.java, KoperasiDemo.java  berikut adalah output nya

```
Simpanan Iwan : Rp 0.0
Simpanan Iwan Setiawan : Rp 100000.0
Simpanan Iwan Setiawan : Rp 95000.0
```

## 3.6 Pertanyaan – Percobaan 3 dan 4
1. Apa yang dimaksud getter dan setter?
Jawab:
Getter adalah sebuah method untuk mendapatkan sebuah nilai, setter adalah method yang digunakan untuk memanipulasi nilai atribut private
2. Apa kegunaan dari method getSimpanan()?
Jawab:
Untuk mendapatkan nilai dari atribut simpanan
3. Method apa yang digunakan untuk menambah saldo?
Jawab:
Method setor
4. Apa yang dimaksud konstruktor?
Jawab:
Sebuah method yang akan di panggil saat membuat objek pertama kali
5. Sebutkan aturan dalam membuat konstruktor?
Jawab:
Nama konstruktor harus sama dengan nama class, konstruktor tidak memiliki return, konstruktor tidak boleh menggunakan modifier abstract, static, final, dan
synchronized
6. Apakah boleh konstruktor bertipe private?
Jawab:
Boleh, ketika kita mau memastikan bahwa hanya ada satu objek
7. Kapan menggunakan konstruktor dengan passing parameter?
Jawab:
Ketika kita mau mengisi sebuah nilai ketika objek pertama kali dibuat
8. Apa perbedaan inisialisasi atribut dan instansiasi atribut?
Jawab:
Inisialisasi atribut adalah ketika kita memberi nilai atribut dari awal, instansiasi atribut adalah proses pembuatan objek dan atribut nya
9. Apa perbedaan inisialisasi method dan instansiasi method?
Jawab:
Inisialisasi method adalah mendeklarasikan method dari sebuah class, instansiasi method adalah proses pembuatan objek dan menggunakan method nya

## 5 Tugas
1. Cobalah program dibawah ini dan tuliskan hasil outputnya
Jawab:
```
package Jobsheet3;

public class EncapDemo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge > 30) {
            age = 30;
        }
        else {
            age = newAge;
        }
    }
}
```
```
package Jobsheet3;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(35);

        System.out.println("Name : " + encap.getName());
        System.out.println("Age : " + encap.getAge());
    }
}
```
```
Name : James
Age : 30
```

2. Pada program diatas, pada class EncapTest kita mengeset age dengan nilai 35, namun pada
saat ditampilkan ke layar nilainya 30, jelaskan mengapa.
Jawab:
Karena di method setAge jika nilai umur yang di isi lebih dari 30 maka nilai umur akan di set jadi 30
3. Ubah program diatas agar atribut age dapat diberi nilai maksimal 30 dan minimal 18.
Jawab:
```
public void setAge(int newAge) {
        if (newAge > 30) {
            age = 30;
        }
        else if (newAge < 18) {
            age = 18;
        } else {
            age = newAge;
        }
    }
```
4. Pada sebuah sistem manajemen pergudangan kargo ekspedisi, terdapat class Kontainer yang
memiliki atribut antara lain nomorResi, namaPemilik, kapasitasMaksimal (dalam kg), dan
beratMuatanSaatIni. Kontainer dapat menerima tambahan muatan barang dengan batasan
kapasitas maksimal yang telah ditentukan. Kontainer juga dapat diturunkan muatannya
(bongkar muat). Ketika barang diturunkan, maka jumlah muatan saat ini akan berkurang
sesuai dengan nominal berat yang dikeluarkan.Buatlah class Kontainer tersebut, berikan atribut (private), method getter, dan konstruktor
sesuai dengan kebutuhan arsitektur enkapsulasi. Uji dengan kelas driver TestLogistik berikut
ini untuk memeriksa apakah manajemen state kelas Anda telah berjalan dengan benar:
Jawab:
```
package Jobsheet3;

public class Kontainer {
    private String nomorResi;
    private String namaPemilik;
    private double kapasitasMaksimal;
    private double beratMuatanSaatIni;
    
    public Kontainer(String nomorResi, String namaPemilik, double kapasitasMaksimal) {
        this.nomorResi = nomorResi;
        this.namaPemilik = namaPemilik;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.beratMuatanSaatIni = 0.0;
    }

    public String getResi() {
        return nomorResi;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public double getBeratMuatanSaatIni() {
        return beratMuatanSaatIni;
    }

    public void tambahMuatan(double muat) {
        if (beratMuatanSaatIni + muat > kapasitasMaksimal) {
            System.out.println("Maaf, berat muatan melebihi kapasitas maksimal kontainer.");
        } else {
            beratMuatanSaatIni += muat;
        }
    }

    public void turunkanMuatan(double muat) {
        if (beratMuatanSaatIni - muat < 0) {
            beratMuatanSaatIni = 0;
        } else {
            beratMuatanSaatIni -= muat;
        }
    }
}
```
```
package Jobsheet3;

public class TestLogistik {
    public static void main(String[] args) {
     Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);
     
     System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
     System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

     System.out.println("\nMemasukkan muatan baru seberat 6.000 kg...");
     kontainerAlfa.tambahMuatan(6000);
     System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

     System.out.println("\nMemasukkan muatan baru seberat 4.000 kg...");
     kontainerAlfa.tambahMuatan(4000);
     System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

     System.out.println("\nMembongkar muat/menurunkan barang seberat 500 kg...");
     kontainerAlfa.turunkanMuatan(500);
     System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

     System.out.println("\nMembongkar muat/menurunkan barang seberat 1.500 kg...");
     kontainerAlfa.turunkanMuatan(1500);
     System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
    }
}
```
```
Nama Pemilik Kontainer: PT. Maju Bersama
Kapasitas Maksimal: 5000.0 kg

Memasukkan muatan baru seberat 6.000 kg...
Maaf, berat muatan melebihi kapasitas maksimal kontainer.
Berat muatan saat ini: 0.0 kg

Memasukkan muatan baru seberat 4.000 kg...
Berat muatan saat ini: 4000.0 kg

Membongkar muat/menurunkan barang seberat 500 kg...
Berat muatan saat ini: 3500.0 kg

Membongkar muat/menurunkan barang seberat 1.500 kg...
Berat muatan saat ini: 2000.0 kg
```
5. Modifikasi soal kargo logistik di atas agar nominal berat muatan yang dibongkar/diturunkan
dalam satu kali pemanggilan method turunkanMuatan() maksimal hanya boleh sebesar 50% dari total berat muatan saat ini.
Langkah ini diterapkan demi alasan keselamatan kerja
operasional alat berat (crane). Jika operator mencoba menurunkan muatan melebihi batas
50% tersebut, sistem harus memblokir aksi dan memunculkan peringatan: "Maaf, demi
keselamatan, pembongkaran muatan satu kali jalan tidak boleh melebihi 50% dari muatan
saat ini!".
Jawab:
```
public void turunkanMuatan(double muat) {
        if (muat > (beratMuatanSaatIni * 0.5)) {
            System.out.println("Maaf, demi keselamatan, pembongkaran muatan satu kali jalan tidak boleh melebihi 50% dari muatan saat ini!");
        } else {
            beratMuatanSaatIni -= muat;
        }
    }
```
6. Modifikasi kelas Main TestLogistik agar parameter jumlah berat barang yang dimasukkan
(tambahMuatan) maupun berat barang yang dibongkar (turunkanMuatan) dapat menerima
input nilai dinamis dari pengguna secara interaktif melalui terminal menggunakan utilitas
java.util.Scanner.
Jawab:
```
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
```
```
Nama Pemilik Kontainer: PT. Maju Bersama
Kapasitas Maksimal: 5000.0 kg

Memasukkan muatan baru
4250
Berat muatan saat ini: 4250.0 kg

Memasukkan muatan baru
275
Berat muatan saat ini: 4525.0 kg

Membongkar muat/menurunkan barang seberat
100
Berat muatan saat ini: 4425.0 kg

Membongkar muat/menurunkan barang seberat
1500
Berat muatan saat ini: 2925.0 kg
```
7. Sebuah aplikasi pemesanan tiket bioskop memerlukan kelas Tiket untuk mengelola data
pemesanan secara aman. Kelas ini harus memiliki atribut private: judulFilm (String),
hargaDasar (double), dan statusPembayaran (boolean).
Ketentuan pengesetan nilai objek:
● Konstruktor harus menerima parameter judulFilm dan hargaDasar. Nilai awal
statusPembayaran selalu diset false (Belum Dibayar).
● Atribut hargaDasar tidak boleh bernilai negatif. Jika input yang dimasukkan kurang dari 0,
otomatis set nilai default ke Rp 35.000.
● Sediakan method lakukanPembayaran() untuk mengubah statusPembayaran menjadi
true.
● Nilai statusPembayaran hanya boleh dibaca (Read-Only) menggunakan getter, tidak boleh
memiliki fungsi setter langsung dari luar kelas demi alasan keamanan transaksi.
● Uji kode Anda menggunakan kelas TestBioskop berikut:
Jawab:
```
package Jobsheet3;

public class Tiket {
    private String judulFilm;
    private double hargaDasar;
    private boolean statusPembayaran;

    public Tiket(String judulFilm, double hargaDasar) {
        this.judulFilm = judulFilm;
        if (hargaDasar < 0) {
            this.hargaDasar = 35000;
        } else {
            this.hargaDasar = hargaDasar;
        }
        this.statusPembayaran = false;
    }

    public String getJudulFilm() {
        return judulFilm;
    }

    public double getHargaDasar() {
        return hargaDasar;
    }

    public void lakukanPembayaran() {
        statusPembayaran = true;
    }

    public boolean isStatusPembayaran() {
        return statusPembayaran;
    }
}
```
```
package Jobsheet3;

public class TestBioskop {
    public static void main(String[] args) {
        Tiket tiket1 = new Tiket("Avengers: Endgame", -50000);
        System.out.println("Film: " + tiket1.getJudulFilm());
        System.out.println("Harga Tiket: " + tiket1.getHargaDasar());
        System.out.println("Status Lunas? " + tiket1.isStatusPembayaran());

        System.out.println("\nMemproses pembayaran...");
        tiket1.lakukanPembayaran();
        System.out.println("Status Lunas Terbaru? " + tiket1.isStatusPembayaran());
    }
}
```
```
Film: Avengers: Endgame
Harga Tiket: 35000.0
Status Lunas? false

Memproses pembayaran...
Status Lunas Terbaru? true
```
