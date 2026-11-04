package Praktikum09.Percobaan;

public class Kipas extends AlatElektronik {
    public String jenis;

    @Override
    public String getInfo() {
        return super.getInfo() + ", Jenis: " + jenis;
    }
}

