package Praktikum07.Tugas;

public class Mobil extends Kendaraan {
    // constructor tanpa parameter
    public Mobil() {
        System.out.println("Ini constructor class Mobil");
    }

    // constructor berparameter
    public Mobil(String merk, String warna, double harga) {
        // memanggil constructor berparameter milik superclass Kendaraan
        super(merk, warna, harga);
    }

    public void jalanDiJalanRaya() {
        System.out.println("Mobil berjalan di jalan raya");
    }

    @Override
    public String getInfo() {
        String info = super.getInfo();
        info += "Jenis        : Mobil\n";

        return info;
    }
}
    

