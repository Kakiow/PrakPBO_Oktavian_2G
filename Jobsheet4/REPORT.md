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
Merk Laptop = Thinkpad
Merk Processor = Intel i5
Cache Memory = 3.00
```

## Checkpoint 2 Percobaan 1

kode berada di file Motor.java, MotorDemo.java  berikut adalah output nya

```
Merk Laptop = Thinkpad
Merk Processor = Intel i5
Cache Memory = 3.00
Merk Laptop = Thinkpad
Merk Processor = Intel i5
Cache Memory = 4.00
```

## Checkpoint 3 Percobaan 1
```
Merk Laptop = Thinkpad
Merk Processor = Intel i5
Cache Memory = 3.00
Merk Laptop = Thinkpad
Merk Processor = Intel i5
Cache Memory = 4.00
Merk Laptop = Thinkpad
Merk Processor = Intel i5
Cache Memory = 3.00
```

## Pertanyaan Percobaan 1
1. Di dalam class Processor dan class Laptop, terdapat method setter dan getter untuk masing-masing atributnya.
Apakah gunanya method setter dan getter tersebut?
Jawab:
Untuk mengisi dan mengambil nilai dari atribut yang bersifat private
2. Di dalam class Processor dan class Laptop, masing-masing terdapat konstruktor default dan
konstruktor berparameter. Bagaimanakah beda penggunaan dari kedua jenis konstruktor
tersebut?
Jawab:
Konstruktor default dipakai jika kita tidak mau mengisi nilai awal untuk object tersebut, konstruktor berparameter
dipakai jika kita mau mengisi nilai awal untuk object
3. Perhatikan class Laptop, di antara 2 atribut yang dimiliki (merk dan proc), atribut manakah yang
bertipe object? Baris kode manakah yang menunjukkan bahwa class Laptop memiliki relasi dengan
class Processor?
Jawab:
Atribut yang bertipe object adalah proc
```
private Processor proc;
```
4. Perhatikan pada class Laptop, apakah guna dari sintaks proc.info()?
Jawab:
Untuk menjalankan method info yang ada di class processor
5. Pada Langkah 8, objek p dibuat lebih dulu baru diberikan ke constructor Laptop. Pada Langkah 10,
objek Processor dibuat langsung di dalam argumen constructor Laptop (tanpa variabel p). Apakah
keduanya menghasilkan output yang berbeda? Mengapa?
Jawab:
Hasil outputnya sama karena, kedua object punya nilai parameter yang sama
6. Secara kode, apakah relasi Laptop-Processor pada percobaan ini termasuk Aggregation atau
Composition? Tunjukkan baris kode yang menjadi bukti jawabanmu.
Jawab:
Termasuk Aggregation
```
private Processor proc;
```
```
public void setProc(Processor proc) {
        this.proc = proc;
    }
```
7. Andaikan constructor Laptop diubah menjadi seperti berikut, sehingga Processor dibuat sendiri di
dalam Laptop, bukan diterima sebagai parameter:
```
public Laptop (String merk) {
 this.merk = merk;
 this.proc = new Processor ("Generic", 1);
}
```
Apakah relasi Laptop-Processor pada versi ini masih Aggregation? Jelaskan alasannya (jawaban ini
akan kita buktikan sendiri lewat kode pada Percobaan 5).
Jawab:
Tidak, versi ini akan menjadi composition karena object processor langsung di buat di class laptop sehingga
jika class laptop hilang maka processor juga ikut hilang
 

## Checkpoint 1 Percobaan 2

kode berada di file Anggota.java, KoperasiDemo.java  berikut adalah output nya

```
Biaya Total = 1100000
```

## Checkpoint 2 Percobaan 2

```
Biaya Total = 1100000
Avanza
```

## Pertanyaan Percobaan 2
1. Perhatikan class Pelanggan. Pada baris program manakah yang menunjukkan bahwa class Pelanggan
memiliki relasi dengan class Mobil dan class Sopir?
Jawab:
```
private Mobil mobil;
    private Sopir sopir;
```
2. Perhatikan method hitungBiayaSopir pada class Sopir, serta method hitungBiayaMobil pada
class Mobil. Mengapa method tersebut harus memiliki argument hari, padahal hari sendiri adalah
atribut milik Pelanggan, bukan milik Mobil atau Sopir?
Jawab:
Karena class sopir dan class mobil tidak punya method atau atribut untuk menyimpan nilai hari sedangkan,
nilai hari dibutuhkan class sopir dan class mobil untuk menghitung biaya
3. Perhatikan kode dari class Pelanggan. Untuk apakah perintah mobil.hitungBiayaMobil(hari)
dan sopir.hitungBiayaSopir(hari)?
Jawab:
Untuk menghitung biaya sopir dan biaya mobil berdasarkan nilai hari dari class pelanggan
4. Perhatikan class MainPercobaan2. Untuk apakah sintaks p.setMobil(m) dan p.setSopir(s)?
Jawab:
Untuk menghubungkan object mobil dan object sopir ke object pelanggan dengan cara memasukkan object mobil dan sopir
ke atribut mobil dan sopir yang ada di class pelanggan
5. Untuk apakah proses p.hitungBiayaTotal()?
Jawab:
Untuk menghitung total biaya dengan cara menjumlah hasil biaya dari mobil dan dari sopir
6. Pada Langkah 7, p.getMobil().getMerk() memanggil dua method sekaligus secara berantai.
Jelaskan urutan eksekusinya: objek apa yang dikembalikan p.getMobil(), dan objek apa yang
kemudian dipanggil .getMerk()-nya?
Jawab:
Object yang dikembalikan p.getMobil() adalah object mobil yang berisi merk avanza yang sudah dibuat diawal,
.getMerk() method ini di jalankan dari class mobil langsung untuk mendapatkan nilai atribut merk dari class mobil
7. Andaikan p.setMobil(m) tidak pernah dipanggil lalu p.hitungBiayaTotal() dijalankan, error
apa yang akan muncul? Jelaskan mengapa error itu terjadi, dikaitkan dengan konsep referensi objek
yang sudah kita pelajari sebelumnya
Jawab:
Error yang akan muncul adalah nullpointerexception karena p.setMobil(m) tidak dipanggil maka referensi
object m di object pelanggan bernilai null

## Checkpoint 1 Percobaan 3

```
Nama: Gaya Baru
Kelas: Bisnis
Masinis: Nip: 1234
Nama: Spongebob Squarepants

Asisten: Nip: 4567
Nama: Patrick Star
```

## Checkpoint 2 Percobaan 3

```
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Jobsheet4.Pegawai.info()" because "this.asisten" is null
        at Jobsheet4.KeretaApi.info(KeretaApi.java:43)
        at Jobsheet4.MainPertanyaan.main(MainPertanyaan.java:7)
```

## Checkpoint 3 Percobaan 3

```
Nama: Gaya Baru
Kelas: Bisnis
Masinis: Nip: 1234
Nama: Spongebob Squarepants
```

## Pertanyaan Percobaan 3
1. Di dalam method info() pada class KeretaApi, baris this.masinis.info() dan
this.asisten.info() digunakan untuk apa?
Jawab:
Untuk memanggil method info yang ada di class pegawai
2. Apa hasil output dari MainPertanyaan sebelum diperbaiki (Langkah 8)? Mengapa hal tersebut dapat
terjadi?
Jawab:
Output nya nullpointerexception karena atribut asisten tidak dibuat sehingga atribut asisten bernilai null
3. Kaitkan dengan materi referensi objek: apa isi variabel asisten di dalam objek KeretaApi yang
dibuat lewat constructor 3-parameter, sebelum guard clause ditambahkan?
Jawab:
Isi variabel asisten adalah null, karena nilai variabel asisten tidak di isi
4. Setelah guard clause ditambahkan (Langkah 9), apakah objek masinis juga perlu dicek dengan cara
yang sama? Perhatikan kedua constructor KeretaApi, apakah mungkin masinis bernilai null?
Jelaskan.
Jawab:
Object masinis tidak perlu di cek, tapi masinis masih mungkin bernilai null jika nilai masinis tidak di isi
5. Kelas Pegawai dipakai lewat dua atribut berbeda (masinis dan asisten) pada KeretaApi. Apakah
ini membuat KeretaApi punya dua objek Pegawai yang berbeda, atau satu objek Pegawai yang
dipakai dua kali? Jelaskan berdasarkan kode pada Langkah 6.
Jawab:
Dua object yang beda karena ada dua kali instansiasi yang terjadi

## Checkpoint 1 Percobaan 4

```
Kode: A
Nomor: 1
Penumpang: Ktp: 12345
Nama: Mr. Krab

Nomor: 2
Nomor: 3
Nomor: 4
Nomor: 5
Nomor: 6
Nomor: 7
Nomor: 8
Nomor: 9
Nomor: 10
```

## Pertanyaan Percobaan 4
1. Pada main program dalam class MainPercobaan4, berapakah jumlah kursi dalam Gerbong A?
Jawab:
10 kursi
2. Perhatikan potongan kode if (this.penumpang != null) { ... } pada method info()
dalam class Kursi. Apa maksud kode tersebut?
Jawab:
Untuk melakukan cek kondisi apakah variabel penumpang berisi null atau tidak
3. Mengapa pada method setPenumpang() dalam class Gerbong, nilai nomor dikurangi dengan angka
1?
Jawab:
Supaya tetap pada batas awal indeks array yaitu indeks ke 0
4. Instansiasi objek baru budi dengan tipe Penumpang, kemudian masukkan objek baru tersebut pada
gerbong dengan gerbong.setPenumpang(budi, 1), menimpa Mr. Krab yang sudah duduk di
sana. Apakah yang terjadi? Apakah Java memberi peringatan/error?
Jawab:
Yang terjadi data Mr. Krab akan di timpa dengan data budi, java tidak akan error
5. Modifikasi program sehingga tidak diperkenankan menduduki kursi yang sudah ada penumpang lain
(tambahkan pengecekan pada Gerbong.setPenumpang() sebelum baris arrayKursi[nomor -
1].setPenumpang(...) dijalankan)
Jawab:
```
public void setPenumpang(Penumpang penumpang, int nomor) {
        if (this.arrayKursi[nomor - 1].getPenumpang() != null) {
            System.out.println("Kursi sudah di isi");
        } else {
            this.arrayKursi[nomor - 1].setPenumpang(penumpang);
        }
    }
```
6. Bandingkan tiga bentuk relasi has-a yang sudah kita praktikkan: Laptop-Processor (Percobaan 1, 1-
1), KeretaApi-Pegawai (Percobaan 3, dua relasi 1-1 bernama), dan Gerbong-Kursi (Percobaan 4, 1..*).
Untuk kasus seperti apa kita akan memilih array, dan untuk kasus seperti apa kita akan memilih
atribut bernama satu-satu?
Jawab:
Kita akan memilih array ketika jumlah object banyak dan perlu perulangan,
kita akan memilih atribut bernama satu-satu ketika jumlah dari object nya sudah pasti
7. Terapkan kriteria kode (siapa yang memanggil new) pada dua relasi has-a di Percobaan ini: GerbongKursi dan Kursi-Penumpang. Manakah yang Aggregation dan manakah yang Composition? Tunjukkan
baris kode yang menjadi bukti untuk masing-masing.
Jawab:
Gerbang - kursi adalah composition
```
private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }
```
Kursi - penumpang adalah Aggregation
```
private Penumpang penumpang;
```
```
public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }
```

## Checkpoint 1 Percobaan 5
```
Mobil: Avanza
Mesin: 4-silinder
```

## Pertanyaan Percobaan 5
1. Pada class Mobil, baris manakah yang menunjukkan bahwa Mesin adalah bagian yang “dimiliki
secara eksklusif” oleh Mobil (bukan sekadar “dipinjam”)?
Jawab:
```
public Mobil2(String merek) {
        this.merek = merek;
        this.mesin = new Mesin();
    }
```
2. Apa yang terjadi secara desain jika ditambahkan method setMesin(Mesin mesin) pada class
Mobil? Apakah relasi ini akan tetap menjadi Composition? Jelaskan.
Jawab:
Tidak menjadi composition karena object mesin tidak lagi dimiliki secara eksklusif oleh class mobil,
sehingga object mesin bisa di ubah dari luar class mobil
3. Bandingkan dengan Percobaan 1 (Laptop-Processor): sebutkan satu perbedaan baris kode yang
membuat salah satunya Aggregation dan yang lain Composition.
Jawab:
Baris kode yang membedakan Aggregation dan composition adalah di class mobil:
```
public Mobil2(String merek) {
        this.merek = merek;
        this.mesin = new Mesin();
    }
```
di class laptop:
```
public Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }
```
4. Jika objek mobil di MainPercobaan5 di-set null setelah tampilkanInfo() dipanggil, apa yang
terjadi pada objek Mesin miliknya? Bandingkan dengan nasib objek Processor pada Percobaan 1
seandainya objek Laptop-nya dihapus, apakah Processor tersebut masih bisa “diselamatkan” oleh
kode lain? Kenapa Mesin tidak bisa?
Jawab:
Jika object mobil di set null maka object mesin juga akan ikut hilang karena object mesin dibuat langsung di dalam class mobil, jika nasib object processor tidak akan hilang karena object processor tidak dibuat di dalam class laptop
5. Coba (secara terpisah, boleh di file/package percobaan sendiri) tambahkan constructor kedua pada
Mobil yang menerima parameter Mesin, mirip pola Percobaan 1: public Mobil(String merek,
Mesin mesin) { this.merek = merek; this.mesin = mesin; }. Kalau constructor ini yang
dipakai, apakah Mobil-Mesin berubah menjadi Aggregation? Jelaskan alasannya.
Jawab:
Mobil-mesin akan menjadi Aggregation karena object mesin tidak lagi dibuat di dalam class mobil, sehingga object mesin akan menjadi class sendiri

## Checkpoint 1 Percobaan 6
```
Thinkpad mengirim dokumen ke printer...
[Epson L3110] Mencetak Laporan.pdf.....
[Epson L3110] Selesai.
```

## Pertanyaan Percobaan 6
1. Apakah class Laptop pada percobaan ini memiliki atribut bertipe Printer? Bandingkan dengan
Percobaan 1, di mana Processor disimpan sebagai atribut Laptop.
Jawab:
Class laptop tidak punya atribut printer
2. Setelah method cetakDokumen() selesai dijalankan, apakah Laptop masih menyimpan referensi ke
objek printer yang tadi dipakai? Jelaskan berdasarkan baris kode class Laptop.
Jawab:
Laptop tidak lagi menyimpan referensi ke object printer, referensi object printer ada selama method digunakan, setelah method selesai referensi nya juga ikut hilang
3. Mengapa relasi Laptop-Printer pada percobaan ini disebut Dependency (uses-a), bukan Aggregation,
meskipun sama-sama melibatkan dua objek yang saling berinteraksi?
Jawab:
Karena class laptop hanya menyimpan referensi dari object printer
4. Coba ubah kode Laptop supaya Printer disimpan sebagai atribut (mis. private Printer
printerDefault, diisi lewat constructor atau setter, lalu dipakai kembali di cetakDokumen()
tanpa parameter Printer). Apakah relasi ini sekarang berubah dari Dependency menjadi
Aggregation? Jelaskan.
Jawab:
```
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
```
Relasi nya berubah dari Dependency menjadi Aggregation karena printer di simpan jadi atribut di class laptop
