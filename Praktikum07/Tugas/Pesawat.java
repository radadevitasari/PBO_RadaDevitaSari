package Praktikum07.Tugas;

public class Pesawat extends Kendaraan {
    // constructor tanpa parameter
    public Pesawat() {
        System.out.println("Ini constructor class Pesawat");
    }

    // constructor berparameter
    public Pesawat(String merk, String warna, double harga) {
        // memanggil constructor berparameter milik superclass Kendaraan
        super(merk, warna, harga);
    }

    public void lepasLandas() {
        System.out.println("Pesawat lepas landas");
    }

    @Override
    public String getInfo() {
        String info = super.getInfo();
        info += "Jenis        : Pesawat\n";

        return info;
    }
}
