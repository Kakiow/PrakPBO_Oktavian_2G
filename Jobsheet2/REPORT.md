|  | Pemrograman Berbasis Objek |
|--|--|
| NIM |  254107020239|
| Nama |  Oktavian Kusuma Alghifari |
| Kelas | TI - 2G |
| Repository | [link] (https://github.com/Kakiow/PrakPBO_Oktavian_2G.git) |

# Labs #2 Kelas dan Objek

##  checkpoint 2

kode berada di file Rectangle.java, Main.java, Student.java berikut adalah output nya

```
Rectangle 6x4
```

## checkpoint 3

```
Area: 24
Perimeter: 20
```

## checkpoint 4

```
package Jobsheet2;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(6,4);

        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
```

## checkpoint 5

```
Area: 24
Via original: 40
Via copy: 40
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Jobsheet2.Rectangle.area()" because "empty" is null
        at Jobsheet2.Main.main(Main.java:15)
```

## checkpoint 6

```
Area: 24
Via original: 40
Via copy: 40
Nadia (S001, GPA: 3.8)
```

## checkpoint 7

```
Area: 24, Perimeter: 20
Area: 9, Perimeter: 12
Area: 16, Perimeter: 20
Nadia (S001, GPA: 3.8)
```

## Tugas Mandiri
1. Buat kelas Circle sesuai diagram UML berikut:
Method area() dan circumference() mengembalikan double, hitung pakai rumus
lingkaran biasa (Math.PI * radius * radius untuk luas, 2 * Math.PI * radius untuk keliling). Buktikan dengan membuat satu objek Circle di Main (radius 5) dan
mencetak kedua hasilnya.
Jawab:
```
package Jobsheet2;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}
```

```
Luas: 78.53981633974483
Keliling: 31.41592653589793
```

2. Jawab singkat (2-3 kalimat masing-masing): (a) apa bedanya objek dengan referensi ke
objek? (b) tepatnya kapan konstruktor sebuah kelas dijalankan?
Jawab:
a. objek adalah hasil dari class dan di simpan di dalam heap, referensi ke objek berarti ada sebuah variabel yang menunjuk ke objek yang ada di heap
b. konstruktor sebuah kelas akan di jalankan di awal pembuatan objek
