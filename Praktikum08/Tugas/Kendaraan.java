package Praktikum08.Tugas;

public abstract class Kendaraan {
    public String merk;
    public String warna;
    public double harga;

    public Kendaraan(String merk, String warna, double harga) {
        this.merk = merk;
        this.warna = warna;
        this.harga = harga;
    }

    public abstract void nyalakan();

    public void cetakInfo() {
        System.out.println("Merk         : " + this.merk);
        System.out.println("Warna        : " + this.warna);
        System.out.println("Harga        : Rp" + String.format("%,.0f", this.harga));
    }
}
