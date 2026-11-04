package Praktikum09.Tugas;

public class KapalSelam implements Swimmer {

    @Override
    public void berenang() {
        System.out.println("Kapal selam berlayar di permukaan laut");
    }

    @Override
    public void selam() {
        System.out.println("Kapal selam menyelam ke dalam laut");
    }

    public void isiBallast() {
        System.out.println("Kapal selam mengisi tangki ballast");
    }
}
