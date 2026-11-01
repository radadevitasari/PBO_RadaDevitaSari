package Praktikum08.Tugas;

public class Pesawat extends Kendaraan {
    public int jumlahSayap;

    public Pesawat(int jumlahSayap, String merk, String warna, double harga) {
        super(merk, warna, harga);
        this.jumlahSayap = jumlahSayap;
    }

    @Override
    public void nyalakan() {
        System.out.println("Menyalakan mesin jet satu per satu");
        System.out.println("Mesin pesawat menyala");
    }

    public void lepasLandas() {
        System.out.println("Pesawat berakselerasi di landasan pacu");
        System.out.println("Pesawat lepas landas dengan " + this.jumlahSayap + " sayap");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Sayap : " + this.jumlahSayap);
    }
}