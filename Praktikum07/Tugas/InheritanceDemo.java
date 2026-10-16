package Praktikum07.Tugas;

public class InheritanceDemo {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota Innova", "Hitam", 350000000);
        Pesawat pesawat1 = new Pesawat("Boeing 737", "Putih", 1500000000);

        System.out.println(mobil1.getInfo());
        System.out.println(pesawat1.getInfo());

        mobil1.jalanDiJalanRaya();
        pesawat1.lepasLandas();
    }
}
    

