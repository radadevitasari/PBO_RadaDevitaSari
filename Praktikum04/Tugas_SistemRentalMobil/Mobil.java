package Praktikum04.Tugas_SistemRentalMobil;

public class Mobil {
    // atribut disimpan private supaya hanya bisa diakses lewat getter/setter (encapsulation)
    private String platNomor;
    private String merk;
    private double tarifPerHari;
    private boolean tersedia; // status: true = bisa disewa, false = sedang disewa

    // constructor: saat mobil baru dibuat, statusnya otomatis "tersedia"
    public Mobil(String platNomor, String merk, double tarifPerHari) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.tarifPerHari = tarifPerHari;
        this.tersedia = true; // default: mobil baru pasti belum disewa siapa-siapa
    }

    // getter: dipakai class lain (Sewa) untuk mengambil data mobil ini
    public String getPlatNomor() {
        return platNomor;
    }
    // mengambil nilai merk mobil, dipanggil misalnya di Sewa.tampilkanDetail()
    public String getMerk() {
        return merk;
    }
    // mengambil tarif per hari, dipakai Sewa untuk hitungBiaya()
    public double getTarifPerHari() {
        return tarifPerHari;
    }
    // mengambil status ketersediaan mobil (true/false)
    public boolean isTersedia() {
        return tersedia;
    }

    // setter: mengubah status ketersediaan mobil
    // dipanggil dari class Pelanggan saat mobil mulai/selesai disewa
    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    // menampilkan seluruh informasi mobil ke layar
    public void tampilkanInfo() {
        System.out.println("Plat Nomor   : " + platNomor);
        System.out.println("Merk         : " + merk);
        System.out.println("Tarif/Hari   : Rp" + tarifPerHari);
        // operator ternary: kalau tersedia true -> tampilkan "Tersedia", kalau false -> "Sedang Disewa"
        System.out.println("Status       : " + (tersedia ? "Tersedia" : "Sedang Disewa"));
    }
}
    

