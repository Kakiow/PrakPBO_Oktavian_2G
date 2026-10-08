|  | Pemrograman Berbasis Objek |
|--|--|
| NIM |  254107020239|
| Nama |  Oktavian Kusuma Alghifari |
| Kelas | TI - 2G |
| Repository | [link] (https://github.com/Kakiow/PrakPBO_Oktavian_2G.git) |

# Labs #3 Enkapsulasi Pada Pemrograman Berorientasi Objek

## Checkpoint 1 Percobaan 1

kode berada di file Motor.java, MotorDemo.java  berikut adalah output nya

```
nilai x: 20
nilai y: 30
nilai z: 5
jumlah: 55
```

## Pertanyaan Percobaan 1
1. Mengapa kompilasi pada Langkah 5 gagal? Tuliskan pesan error pertama beserta file dan
baris tempat error muncul.
Jawab:
Karena classB tidak melakukan inheritence dari classA
2. Baris kode mana yang diubah pada Langkah 6, dan apa artinya? Sebutkan class yang
berperan sebagai superclass dan subclass.
Jawab:
```
public class ClassB extends ClassA {
```
artinya classB adalah turunan dari classA dan yang jadi superclass adalah classA dan classB adalah subclass nya
3. Setelah diperbaiki, sebutkan atribut dan method yang dapat dipakai oleh objek hitung.
Kelompokkan mana yang dideklarasikan di ClassA dan mana yang dideklarasikan di ClassB.
Jawab:
Atribut x,y dari classA dan method getNilai dan atribut z dan method getNilaiZ dan getJumlah dari classB
4. Pada MainPercobaan1, hitung.x = 20 ditulis pada objek ClassB, padahal atribut x tidak
dideklarasikan di ClassB. Mengapa hal ini diperbolehkan?
Jawab:
Karena classB adalah pewaris dari classA jadi dia mewarisi atribut x dari classA juga
5. Atribut x dan y pada ClassA dibuat public, sehingga dapat diubah langsung dari
MainPercobaan1. Apa risiko dari desain seperti ini? (jawaban ini akan kita telusuri pada
Percobaan 2)
Jawab:
Data bisa di ubah tanpa ada validasi yang dilakukan dan melanggar enkapsulasi
6. Coba tambahkan class ClassD lalu ubah deklarasi menjadi public class ClassB extends
ClassA, ClassD. Apa yang terjadi? Apa yang dapat Anda simpulkan tentang jumlah
superclass langsung pada Java?
Jawab:
Akan terjadi error karena java tidak bisa multiple inheritence

## Checkpoint 1 Percobaan 2

kode berada di file Motor.java, MotorDemo.java  berikut adalah output nya

```
nilai x: 20
nilai y: 30
nilai z: 5
jumlah: 55
```

## Checkpoint 2 Percobaan 2
```
nilai x: 20
nilai y: 30
nilai z: 5
jumlah: 55
```

## Pertanyaan Percobaan 2
1. Di file dan baris mana error pada Langkah 5 muncul, dan apa pesannya? Mengapa error
tidak muncul di MainPercobaan2?
Jawab:
Di file classB, karena class MainPercobaan2 hanya memanggil method nya saja
2. Jelaskan penyebab error tersebut dengan merujuk pada tabel kontrol pengaksesan
(Langkah 1).
Jawab:
Karena atribut di set private jadi atribut tersebut hanya bisa di akses oleh class nya sendiri
3. Pada kode awal, MainPercobaan2 memanggil hitung.setX(20) dan tidak error, padahal x
bersifat private. Mengapa pemanggilan ini diperbolehkan, dan di mana nilai x tersimpan?
Jawab:
Karena method setX di set public sehingga class MainPercobaan2 bisa mengakses langsung method itu
4. Bandingkan Perbaikan A (protected) dan Perbaikan B (private + getter) dari sisi
encapsulation. Mana yang Anda pilih untuk program sungguhan? Jelaskan alasannya.
Jawab:
Saya pilih perbaikan B karena itu memastikan bahwa data tidak bisa di ubah sembarangan
5. Andaikan ClassA dan ClassB berada di package yang berbeda. Berdasarkan tabel, apakah
ClassB tetap dapat mengakses atribut protected milik ClassA? Bagaimana jika atributnya
default (tanpa modifier)?
Jawab:
ClassB tetap bisa mengakses atribut protected, kalau atribut nya default ClassB tidak bisa mengakses
atribut nya karena beda package
 

## Checkpoint 1 Percobaan 3

kode berada di file Anggota.java, KoperasiDemo.java  berikut adalah output nya

```
Volume Tabung adalah: 942.0
```

## Checkpoint 2 Percobaan 3

```
Volume Tabung adalah: 942.0
```

## Checkpoint 3 Percobaan 3

```
r          = 5
this.r     = 5
super.r    = 10
```

## Pertanyaan Percobaan 3
1. Jelaskan fungsi super pada super.phi = phi; dan super.r = r; di method setSuperPhi()
dan setSuperR() milik Tabung.
Jawab:
Untuk mengakses atribut dari superclass
2. Jelaskan fungsi super dan this pada ekspresi super.phi * super.r * super.r * this.t di
method volume().
Jawab:
Super untuk mengakses atribut superclass nya dan this untuk mengakses atribut dengan nama yang sama
punya class itu sendiri
3. Mengapa Tabung tidak mendeklarasikan atribut phi dan r, tetapi tetap dapat
mengaksesnya? Apa yang terjadi bila pada Bangun keduanya diubah menjadi private?
Jawab:
Karena tabung adalah pewaris dari class bangun dan atribut phi dan r di set protected di class bangun
jadi class tabung punya akses ke atribut itu, jika atribut phi dan r di set private di class bangun
class tabung tidak punya akses ke atribut tersebut
4. Pada Eksperimen 1, apakah output berubah ketika super.phi diganti this.phi? Jelaskan
mengapa.
Jawab:
Output nya tidak berubah karena class tabung tidak melakukan deklarasi atribut phi jadi akan otomatis
mengambil atribut phi dari superclass nya
5. Pada Eksperimen 2, mengapa r, this.r, dan super.r menghasilkan nilai yang berbeda?
Pada kondisi apa awalan super. menjadi wajib dipakai?
Jawab:
Awalan super di pakai ketika subclass punya nama atribut yang sama yang ada di superclass nya

## Checkpoint 1 Percobaan 4

```
konstruktor A dijalankan
konstruktor B dijalankan
konstruktor C dijalankan
```

## Checkpoint 2 Percobaan 4

```
konstruktor A dijalankan
konstruktor B dijalankan
konstruktor C dijalankan
```

## Checkpoint 3 Percobaan 4

```
konstruktor C dijalankan
konstruktor A dijalankan
konstruktor B dijalankan
```

## Pertanyaan Percobaan 4
1. Sebutkan class yang berperan sebagai superclass dan subclass pada percobaan ini beserta
alasannya. Mengapa ClassB disebut berperan ganda?
Jawab:
ClassA superclass dari classB, classB subclass dari classA dan superclass dari classC, classC
subclass dari classA
2. Program hanya membuat satu objek (new ClassC()), tetapi tiga baris tercetak. Jelaskan
mengapa konstruktor ClassA dan ClassB ikut dijalankan.
Jawab:
Karena saat membuat objek java memanggil konstruktor superclass nya dulu
3. Pada Modifikasi 1, mengapa output tidak berbeda dari sebelumnya meskipun super();
ditambahkan secara eksplisit?
Jawab:
Karena secara default java selalu menambahkan super() di awal konstruktor
4. Pada Modifikasi 2 terjadi error. Aturan apa yang dilanggar, dan mengapa Java menetapkan
aturan tersebut?
Jawab:
Aturan super() harus ada di baris pertama konstruktor, aturan ini ada supaya superclass dibuat terlebih
dahulu
5. Tuliskan urutan proses (bernomor) yang terjadi ketika new ClassC() dieksekusi, dimulai
dari pemanggilan konstruktor ClassC hingga seluruh output tercetak.
Jawab:
Main memanggil new ClassC, konstruktor classC di panggil super() ke classB, konstruktor classB di panggil super() ke classA
konstruktor classA dijalankan

## Checkpoint 1 Percobaan 5

```
Merk            : Dell
Kapasitas Memory: 2048 MB
Kecepatan CPU   : 3500 Mhz
Printer         : Canon

Merk            : Asus
Kapasitas Memory: 4096 MB
Kecepatan CPU   : 2500 Mhz
Resolusi Layar  : 720p

Komputer Dell dinyalakan
```

## Pertanyaan Percobaan 5
1. Jelaskan fungsi super(merk, memory, cpu) pada konstruktor Desktop. Atribut apa saja yang
diisi oleh baris tersebut, dan atribut apa yang diisi oleh baris berikutnya?
Jawab:
Memanggil konstruktor berparameter punya superclass, atribut yang di isi merk, kapasitasMemory, kecepatanCPU,
atribut printer punya desktop
2. Pada Eksperimen 1, mengapa error muncul di sini, padahal pada Percobaan 4 super() juga
tidak ditulis tetapi program tetap berjalan?
Jawab:
Karena class komputer cuma punya konstruktor berparameter dan tidak punya konstruktor kosong
3. Method showInfo() ditulis di Komputer sekaligus di Desktop. Apa istilah untuk kondisi ini?
Apa yang tercetak bila baris super.showInfo(); pada Desktop dihapus?
Jawab:
Istilah nya adalah overriding, info atribut class komputer tidak akan muncul
4. Pada Eksperimen 2, jelaskan perbedaan hasil kompilasi dengan dan tanpa @Override. Apa
manfaat menuliskan @Override?
Jawab:
Dengan @Override akan error karena nama method nya tidak cocok dengan method superclassnya,
tanpa @Override tidak akan terjadi error karena akan di anggap jadi method biasa,
manfaat @Override adalah ketika ingin mengubah fungsi method tanpa membuat method baru
5. Tantangan. Buat class Workstation sebagai turunan Desktop dengan atribut gpu (String).
Class ini harus menimpa showInfo() sehingga menampilkan seluruh informasi Desktop
ditambah baris GPU. Ketika new Workstation(...) dibuat, konstruktor class apa saja yang
terpanggil, dan dalam urutan apa?
Jawab:
```
package Jobsheet6;

public class Workstation extends Desktop {
    protected String gpu;

    public Workstation(String merk, int memory, int cpu, String printer, String gpu) {
        super(merk, memory, cpu, printer);
        this.gpu = gpu;
    }

    @Override 
    public void showInfo() {
        super.showInfo();
        System.out.println("GPU: " + gpu);
    }
}
```

## Tugas 1
```
package Jobsheet6;

public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int jumlah;

    public DaftarGaji(int kapasitas) {
        this.listPegawai = new Pegawai[kapasitas];
        this.jumlah = 0;
    }

    public void addPegawai(Pegawai p) {
       listPegawai[jumlah] = p;
       jumlah++;
    }

    public void printSemuaGaji() {
        for (int i = 0; i < jumlah; i++) {
            System.out.println(listPegawai[i].getNama() + ":" + listPegawai[i].getGaji());
        }
    }
}
```
```
package Jobsheet6;

public class Pegawai {
    protected String nip;
    protected String nama;
    protected String alamat;

    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat; 
    }

    public String getNama() {
        return nama;
    }

    public int getGaji() {
        return 1500000;
    }
}
```
```
package Jobsheet6;

public class Dosen extends Pegawai {
    protected int jumlahSKS;
    protected static final int TARIF_SKS = 100000;
    
    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    @Override 
    public int getGaji() {
        return super.getGaji() + (jumlahSKS * TARIF_SKS);
    }
}
```
```
package Jobsheet6;

public class MainTugas1 {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai("01", "Budi", "test");
        Dosen dosen = new Dosen("02", "Siti", "test2");
        dosen.setSKS(12);
        DaftarGaji gaji = new DaftarGaji(10);
        gaji.addPegawai(pegawai);
        gaji.addPegawai(dosen);
        gaji.printSemuaGaji();
    } 
}
```
```
Budi:1500000
Siti:2700000
```

## Tugas 2


