package Praktikum07.Tugas;

public class Kendaraan {
    private String merk;
    private String warna;
    private double harga;

    // constructor tanpa parameter
    public Kendaraan() {
        System.out.println("Ini constructor class Kendaraan");
    }

    // constructor berparameter
    public Kendaraan(String merk, String warna, double harga) {
        this.merk = merk;
        this.warna = warna;
        this.harga = harga;
    }

    public void nyalakan() {
        System.out.println("Kendaraan dinyalakan");
    }

    public String getInfo() {
        String info = "";
        info += "Merk         : " + merk + "\n";
        info += "Warna        : " + warna + "\n";
        info += "Harga        : RP " + harga + "\n";

        return info;
    }
}
    

