package Praktikum02;

public class DragonMain {

    public static void main(String[] args) {

        // OBJEK 1: dragon1 
        Dragon dragon1 = new Dragon(); // INSTANSIASI OBJEK dragon1

        System.out.println("=== Status Awal Dragon 1 ===");
        dragon1.printStatus(); // cek kondisi dragon tepat setelah dibuat

        System.out.println("=== Dragon 1 bergerak (move() persis setelah instansiasi) ===");
        dragon1.move(5); // PARAMETER 5 -> karena direction default = 1 (atas), maka y bertambah
        dragon1.printStatus();

        System.out.println("=== Dragon 1 ganti arah ke Kanan ===");
        dragon1.changeDirection(2); // PARAMETER 2 -> ubah direction jadi kanan
        dragon1.printStatus();

        System.out.println("=== Dragon 1 bergerak (setelah ganti arah) ===");
        dragon1.move(5); // sekarang direction = 2 (kanan), maka x bertambah
        dragon1.printStatus();


        // OBJEK 2: dragon2 
        Dragon dragon2 = new Dragon(); // INSTANSIASI OBJEK dragon2 (terpisah dari dragon1)

        System.out.println("=== Status Awal Dragon 2 ===");
        dragon2.printStatus();

        System.out.println("=== Dragon 2 ganti arah ke Atas ===");
        dragon2.changeDirection(1);
        dragon2.printStatus();

        System.out.println("=== Dragon 2 bergerak ===");
        dragon2.move(3);
        dragon2.printStatus();

    }
}    

