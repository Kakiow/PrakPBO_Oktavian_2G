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
