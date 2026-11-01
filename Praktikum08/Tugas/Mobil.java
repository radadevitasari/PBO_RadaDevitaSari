package Praktikum08.Tugas;

public class Mobil extends Kendaraan {
    public int jumlahRoda;

    public Mobil(int jumlahRoda, String merk, String warna, double harga) {
        super(merk, warna, harga);
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public void nyalakan() {
        System.out.println("Memasukkan kunci dan memutar starter");
        System.out.println("Mesin mobil menyala");
    }

    public void jalanDiJalanRaya() {
        System.out.println("Mobil melaju di jalan raya dengan " + this.jumlahRoda + " roda");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Roda  : " + this.jumlahRoda);
    }
}
