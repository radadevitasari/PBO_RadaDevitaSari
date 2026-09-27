package Praktikum04.Tugas_SistemRentalMobil;

import java.time.LocalDate; // dibutuhkan karena atribut tanggalSewa bertipe LocalDate

public class Sewa {
    private LocalDate tanggalSewa;
    private int lamaHari;
    private Mobil mobil; // RELASI: Sewa menyimpan referensi ke satu objek Mobil (asosiasi 0..*—1)

    // constructor: satu objek Sewa dibuat dengan tanggal, lama hari, dan mobil yang disewa
    public Sewa(LocalDate tanggalSewa, int lamaHari, Mobil mobil) {
        this.tanggalSewa = tanggalSewa;
        this.lamaHari = lamaHari;
        this.mobil = mobil;
    }

    public LocalDate getTanggalSewa() {
        return tanggalSewa;
    }

    public int getLamaHari() {
        return lamaHari;
    }

    public Mobil getMobil() {
        return mobil;
    }

    // menghitung total biaya sewa = lama hari dikali tarif per hari milik objek Mobil
    // ini contoh Sewa "meminjam" data dari Mobil lewat getter, bukan menyimpan sendiri
    public double hitungBiaya() {
        return lamaHari * mobil.getTarifPerHari();
    }

    // menampilkan detail satu transaksi sewa: tanggal, lama, mobil, dan total biaya
    public void tampilkanDetail() {
        System.out.println("Tanggal Sewa : " + tanggalSewa);
        System.out.println("Lama Sewa    : " + lamaHari + " hari");
        System.out.println("Mobil        : " + mobil.getMerk() + " (" + mobil.getPlatNomor() + ")");
        System.out.println("Total Biaya  : Rp" + hitungBiaya());
    }
}
    

