package Praktikum09.Percobaan;

public class Main {
    public static void main(String[] args) {
        Kulkas kulkas = new Kulkas();
        kulkas.merk = "Sharp";
        kulkas.warna = "Silver";
        kulkas.harga = 3500000;
        kulkas.jumlahPintu = 2;

        TV tv = new TV();
        tv.merk = "Samsung";
        tv.warna = "Hitam";
        tv.harga = 5000000;
        tv.jenisLayar = "LED";
        tv.volume = 10;

        System.out.println("Info Kulkas:");
        System.out.println(kulkas.getInfo());

        System.out.println("\nInfo TV:");
        System.out.println(tv.getInfo());
    }
}
    
