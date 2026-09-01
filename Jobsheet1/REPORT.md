|  | Pemrograman Berbasis Objek |
|--|--|
| NIM |  254107020239|
| Nama |  Oktavian Kusuma Alghifari |
| Kelas | TI - 2G |
| Repository | [link] (https://github.com/Kakiow/PrakPBO_Oktavian_2G.git) |

# Labs #1 Pengantar Konsep Pemrograman Berorientasi Objek

## 3.1   Percobaan 1

kode berada di file Bike.java, BikeDemo.java berikut adalah output nya

```
Brand : Trek
Speed : 5
Gear : 2
Brand : Giant
Speed : 5
Gear : 3
```

## 3.2   Percobaan 2

kode berada di file Bike.java, BikeDemo.java, RoadBike.java berikut adalah output nya

```
Brand : Trek
Speed : 5
Gear : 2
Brand : Giant
Speed : 5
Gear : 3
Brand : Specialized
Speed : 5
Gear : 4
Tire Width : 25 mm
Bike Type : Road Bike
```

## 5 Pertanyaan
1. Jelaskan perbedaan antara object dengan class!
Jawab:
Class adalah blueprint dari sebuah object, object adalah hasil dari class yang punya atribut dan method
2. Jelaskan alasan gear dan brand dapat menjadi atribut dari object Bike!
Jawab:
Karena gear dan brand adalah sesuatu yang pasti di miliki oleh sepeda
3. Sebutkan salah satu kelebihan utama dari pemrograman berorientasi objek dibandingkan
dengan pemrograman prosedural!
Jawab:
Jika menggunakan pemrograman berorientasi objek jika kita mau membuat beberapa objek kita tidak perlu menulis atribut dan method berulang-ulang
4. Apakah diperbolehkan melakukan pendefinisian dua buah atribut dalam satu baris kode seperti
“public String nama, alamat;”?
Jawab:
Boleh selama dua atribut itu memiliki tipe data yang sama
5. Pada class RoadBike, jelaskan alasan atribut brand, speed, dan gear tidak lagi ditulis di dalam
class tersebut!
Jawab:
Karena atribut brand,speed, dan gear sudah dibuat di class bike, dan kelas RoadBike mewarisi class bike

## 6  Tugas
1. Lakukan langkah-langkah berikut supaya tugas praktikum yang dikerjakan tersistematis:

a. Foto 4 buah objek di sekitar kalian dengan 2 objek di antaranya merupakan objek yang
mengandung konsep pewarisan (inheritance), contoh: kulkas, kursi, meja ruang tamu, meja
belajar sehingga diketahui meja ruang tamu dan meja belajar mewarisi objek meja!

b. Lakukan pengamatan terhadap 4 objek tersebut untuk menentukan atribut dan methodnya!
Jawab:
- Penggaris, atribut nya merk dan panjang, method nya adalah Merk, Panjang, print
- Dompet, atribut nya merk dan bahan, method nya adalah Merk, Bahan, print
- Kompor, atribut nya merk dan tungku, method nya adalah Merk, Tungku, print
- Kompor tanam, atribut nya merk, tungku, dan material, method nya adalah Merk, Tungku, Material, print
- Televisi, atribut nya merk dan ukuran, method nya adalah Merk, Ukuran, print
- SmartTv, atribut nya merk, ukuran, dan sistem, method nya adalah Merk, Ukuran, Sistem, print

c. Berdasarkan 4 buah objek tersebut, buat class nya dalam Bahasa pemrograman Java!
Jawab:
```
package Jobsheet1;

public class Penggaris {
    private String merk;
    private int panjang;

    public void Merk(String merk) {
        this.merk = merk;
    }

    public void Panjang(int panjang) {
        this.panjang = panjang;
    }

    public void print() {
        System.out.println("Merk: " + merk);
        System.out.println("Panjang penggaris: " + panjang);
    }
}
```
```
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
```
```
package Jobsheet1;

public class Kompor {
    private String merk;
    private int tungku;

    public void Merk(String merk) {
        this.merk = merk;
    }

    public void Tungku(int tungku) {
        this.tungku = tungku;
    }

    public void print() {
        System.out.println("Merk: " + merk);
        System.out.println("Jumlah tungku: " + tungku);
    }
}
```
```
package Jobsheet1;

public class Televisi {
    private String merk;
    private int ukuran;

    public void Merk(String merk) {
        this.merk = merk;
    }

    public void Ukuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public void print() {
        System.out.println("Merk: " + merk);
        System.out.println("Ukuran layar: " + ukuran);
    }
}
```
d. Perlu diperhatikan bahwa terdapat dua class hasil pewarisan sehingga perlu menambah satu
class baru sebagai class yang mewarisi dua class tersebut!
Jawab:
```
package Jobsheet1;

public class KomporTanam extends Kompor {
    private String material;

    public void Material(String material) {
        this.material = material;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Material kompor: " + material);
    }
}
```
```
package Jobsheet1;

public class SmartTv extends Televisi {
    private String sistem;

    public void Sistem(String sistem) {
        this.sistem = sistem;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Sistem tv: " + sistem);
    }
}
```
e. Tambahkan dua atribut untuk setiap class!
Jawab:
```
package Jobsheet1;

public class Penggaris {
    private String merk;
    private int panjang;
```
```
package Jobsheet1;

public class Dompet {
    private String merk;
    private String bahan;
```
```
package Jobsheet1;

public class Kompor {
    private String merk;
    private int tungku;
```
```
package Jobsheet1;

public class KomporTanam extends Kompor {
    private String material;
```
```
package Jobsheet1;

public class Televisi {
    private String merk;
    private int ukuran;
```
```
package Jobsheet1;

public class SmartTv extends Televisi {
    private String sistem;
```
f. Tambahkan tiga method untuk setiap class termasuk method cetak informasi!
Jawab:
```
package Jobsheet1;

public class Penggaris {
    private String merk;
    private int panjang;

    public void Merk(String merk) {
        this.merk = merk;
    }

    public void Panjang(int panjang) {
        this.panjang = panjang;
    }

    public void print() {
        System.out.println("Merk: " + merk);
        System.out.println("Panjang penggaris: " + panjang);
    }
}
```
```
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
```
```
package Jobsheet1;

public class Kompor {
    private String merk;
    private int tungku;

    public void Merk(String merk) {
        this.merk = merk;
    }

    public void Tungku(int tungku) {
        this.tungku = tungku;
    }

    public void print() {
        System.out.println("Merk: " + merk);
        System.out.println("Jumlah tungku: " + tungku);
    }
}
```
```
package Jobsheet1;

public class KomporTanam extends Kompor {
    private String material;

    public void Material(String material) {
        this.material = material;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Material kompor: " + material);
    }
}
```
```
package Jobsheet1;

public class Televisi {
    private String merk;
    private int ukuran;

    public void Merk(String merk) {
        this.merk = merk;
    }

    public void Ukuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public void print() {
        System.out.println("Merk: " + merk);
        System.out.println("Ukuran layar: " + ukuran);
    }
}
```
```
package Jobsheet1;

public class SmartTv extends Televisi {
    private String sistem;

    public void Sistem(String sistem) {
        this.sistem = sistem;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Sistem tv: " + sistem);
    }
}
```
g. Tambahkan satu class Demo sebagai main!
Jawab:
```
package Jobsheet1;

public class Demo {
    public static void main(String[] args) {
        Penggaris penggaris = new Penggaris();
        Dompet dompet = new Dompet();
        Kompor kompor = new Kompor();
        KomporTanam kompor2 = new KomporTanam();
        Televisi tv = new Televisi();
        SmartTv tv2 = new SmartTv();

        penggaris.Merk("butterfly");
        penggaris.Panjang(30);
        penggaris.print();

        dompet.Merk("eiger");
        dompet.Bahan("kain");
        dompet.print();

        kompor.Merk("rinnai");
        kompor.Tungku(2);
        kompor.print();

        kompor2.Merk("catristo");
        kompor2.Tungku(2);
        kompor2.Material("kaca");
        kompor2.print();

        tv.Merk("sharp");
        tv.Ukuran(32);
        tv.print();

        tv2.Merk("samsung");
        tv2.Ukuran(40);
        tv2.Sistem("tizen");
        tv2.print();

    }
}
```
h. Instansiasikan satu buah objek untuk setiap class!
Jawab:
```
package Jobsheet1;

public class Demo {
    public static void main(String[] args) {
        Penggaris penggaris = new Penggaris();
        Dompet dompet = new Dompet();
        Kompor kompor = new Kompor();
        KomporTanam kompor2 = new KomporTanam();
        Televisi tv = new Televisi();
        SmartTv tv2 = new SmartTv();
```
i. Terapkan setiap method untuk setiap objek yang dibuat!
Jawab:
```
package Jobsheet1;

public class Demo {
    public static void main(String[] args) {
        Penggaris penggaris = new Penggaris();
        Dompet dompet = new Dompet();
        Kompor kompor = new Kompor();
        KomporTanam kompor2 = new KomporTanam();
        Televisi tv = new Televisi();
        SmartTv tv2 = new SmartTv();

        penggaris.Merk("butterfly");
        penggaris.Panjang(30);
        penggaris.print();

        dompet.Merk("eiger");
        dompet.Bahan("kain");
        dompet.print();

        kompor.Merk("rinnai");
        kompor.Tungku(2);
        kompor.print();

        kompor2.Merk("catristo");
        kompor2.Tungku(2);
        kompor2.Material("kaca");
        kompor2.print();

        tv.Merk("sharp");
        tv.Ukuran(32);
        tv.print();

        tv2.Merk("samsung");
        tv2.Ukuran(40);
        tv2.Sistem("tizen");
        tv2.print();

    }
}
```
j. Contoh yang telah disebutkan pada poin 1.a tidak diperbolehkan dipakai dalam pengerjaan
tugas praktikum ini!
