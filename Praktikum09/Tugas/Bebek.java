package Praktikum09.Tugas;

public class Bebek implements Swimmer {

    @Override
    public void berenang() {
        System.out.println("Bebek berenang di permukaan air");
    }

    @Override
    public void selam() {
        System.out.println("Bebek menyelam sebentar di dalam air");
    }

    public void bertelur() {
        System.out.println("Bebek bertelur");
    }
}
