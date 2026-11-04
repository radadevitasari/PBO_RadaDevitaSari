package Praktikum09.Percobaan;

public class SmartFridge extends Kulkas implements Audible{
    public int volume;
    public String ukuranLayar;

    @Override
    public void naikkanVolume() {
        volume += 1;
    }

    @Override
    public void turunkanVolume() {
        volume -= 1;
    }
    
    @Override
    public String getInfo() {
        return super.getInfo() + ", Volume: " + volume + ", Ukuran Layar: " + ukuranLayar;
    }
}

