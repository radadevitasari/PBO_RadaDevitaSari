package Praktikum08.Tugas;

public class KendaraanDemo {
     public static void main(String[] args) {
        Mobil mobil1 = new Mobil(4, "Toyota", "Merah", 250000000);
        mobil1.cetakInfo();
        mobil1.nyalakan();
        mobil1.jalanDiJalanRaya();

        System.out.println();

        Pesawat pesawat1 = new Pesawat(2, "Boeing", "Putih", 1500000000);
        pesawat1.cetakInfo();
        pesawat1.nyalakan();
        pesawat1.lepasLandas();
    }
}
    

