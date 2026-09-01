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
