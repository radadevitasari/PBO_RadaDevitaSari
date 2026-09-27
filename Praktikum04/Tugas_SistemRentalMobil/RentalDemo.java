package Praktikum04.Tugas_SistemRentalMobil;

public class RentalDemo {
    public static void main(String[] args) {
        // membuat 3 objek Mobil yang berbeda
        Mobil avanza = new Mobil("N1234ABC", "Toyota Avanza", 300000);
        Mobil hrv = new Mobil("N5678XYZ", "Daihatsu Xenia", 280000);
        Mobil innova = new Mobil("N9012PQR", "Toyota Innova", 400000);

        // membuat 1 objek Pelanggan
        Pelanggan p1 = new Pelanggan("3573010101990001", "Devita", "081234567890");

        // pelanggan menyewa 3 mobil berbeda, masing-masing dengan lama hari berbeda
        p1.sewaMobil(avanza, 3);
        p1.sewaMobil(hrv, 2);
        p1.sewaMobil(innova, 1);

        // menampilkan semua info pelanggan sekaligus riwayat sewanya
        p1.tampilkanInfo();

        System.out.println();
        // menampilkan status mobil innova (harusnya "Sedang Disewa" karena baru saja disewa)
        innova.tampilkanInfo();
    }
}
    

