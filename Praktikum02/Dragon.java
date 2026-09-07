package Praktikum02;

public class Dragon {
    // ATRIBUT
    int x;          // tipe data int -> posisi mendatar
    int y;          // tipe data int -> posisi vertikal
    int direction;  // tipe data int -> arah (1=atas, 2=kanan, 3=bawah, 4=kiri)

    // CONSTRUCTOR
    // Otomatis dijalankan saat objek dibuat dengan "new Dragon()"
    public Dragon() {
        x = 0;
        y = 0;
        direction = 1; // diisi supaya dragon punya arah default yang VALID sejak awal dibuat
    }

    // METHOD 
    // PARAMETER: newDirection (nilai yang dikirim saat method dipanggil)
    // TIPE DATA KEMBALIAN: void (tidak mengembalikan nilai)
    public void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        } else {
            System.out.println("Arah tidak valid!");
        }
    }

    // METHOD
    // PARAMETER: steps (jumlah langkah)
    public void move(int steps) {
        switch (direction) {
            case 1: // atas
                y += steps;
                break;
            case 2: // kanan
                x += steps;
                break;
            case 3: // bawah
                y -= steps;
                break;
            case 4: // kiri
                x -= steps;
                break;
            default:
                // jaga-jaga kalau direction di luar 1-4 (misalnya tidak diinisialisasi di constructor)
                System.out.println("Arah belum ditentukan!");
        }
    }

    // METHOD  
    // Tidak punya parameter, hanya menampilkan isi atribut
    public void printStatus() {
        System.out.println("Posisi X : " + x);
        System.out.println("Posisi Y : " + y);

        if (direction == 1)
            System.out.println("Arah : Atas");
        else if (direction == 2)
            System.out.println("Arah : Kanan");
        else if (direction == 3)
            System.out.println("Arah : Bawah");
        else if (direction == 4)
            System.out.println("Arah : Kiri");

        System.out.println("------------------");
    }
}
