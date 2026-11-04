package Praktikum09.Tugas;

public class Main {
    public static void main(String[] args) {
        Bebek bebek = new Bebek();
        bebek.berenang();
        bebek.selam();
        bebek.bertelur();

        System.out.println();

        KapalSelam kapalSelam = new KapalSelam();
        kapalSelam.berenang();
        kapalSelam.selam();
        kapalSelam.isiBallast();
    }
}

