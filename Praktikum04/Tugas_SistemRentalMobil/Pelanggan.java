package Praktikum04.Tugas_SistemRentalMobil;

import java.util.ArrayList; // dibutuhkan untuk mendeklarasikan atribut riwayatSewa
import java.time.LocalDate;  // dibutuhkan untuk mengisi tanggal sewa otomatis dengan tanggal hari ini

public class Pelanggan {
    private String nik;
    private String nama;
    private String noTelepon;
    private ArrayList<Sewa> riwayatSewa; // RELASI: Pelanggan menyimpan banyak objek Sewa (asosiasi 1—0..*)

    // constructor: mengisi data dasar pelanggan + menyiapkan ArrayList kosong untuk riwayat sewa
    public Pelanggan(String nik, String nama, String noTelepon) {
        this.nik = nik;
        this.nama = nama;
        this.noTelepon = noTelepon;
        this.riwayatSewa = new ArrayList<Sewa>();
        // PENTING: kalau baris di atas dihilangkan, riwayatSewa akan bernilai null,
        // dan pemanggilan .add() di bawah akan error NullPointerException
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    // mencatat penyewaan mobil baru:
    // 1. buat objek Sewa baru dengan tanggal hari ini, lama hari, dan mobil yang dipilih
    // 2. ubah status mobil jadi tidak tersedia (dipanggil lewat objek mobil-nya langsung)
    // 3. simpan objek Sewa itu ke dalam riwayatSewa milik pelanggan ini
    public void sewaMobil(Mobil mobil, int lamaHari) {
        Sewa sewaBaru = new Sewa(LocalDate.now(), lamaHari, mobil);
        mobil.setTersedia(false);
        riwayatSewa.add(sewaBaru);
    }

    // menampilkan semua riwayat sewa pelanggan ini satu per satu
    public void tampilkanRiwayat() {
        if (!riwayatSewa.isEmpty()) {
            System.out.println("Riwayat Sewa:");
            for (Sewa sewa : riwayatSewa) {
                sewa.tampilkanDetail(); // memanggil method milik objek Sewa untuk tampilkan detailnya
                System.out.println("---");
            }
        } else {
            System.out.println("Belum ada riwayat sewa");
        }
    }

    // menampilkan info dasar pelanggan, lalu memanggil tampilkanRiwayat() untuk riwayat sewanya
    public void tampilkanInfo() {
        System.out.println("NIK          : " + nik);
        System.out.println("Nama         : " + nama);
        System.out.println("No Telepon   : " + noTelepon);
        tampilkanRiwayat();
    }
}
    

