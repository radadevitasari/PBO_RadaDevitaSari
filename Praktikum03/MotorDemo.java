package Praktikum03;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.platNomor = "B 0838 XZ";
        motor1.kecepatan = 50;
        motor1.displayInfo();

        Motor motor2 = new Motor();
        motor2.platNomor = "N 9840 AB";
        motor2.statusMesin = true;
        motor2.kecepatan = 40;
        motor2.displayInfo();

        Motor motor3 = new Motor();
        motor3.platNomor = "D 8343 CV";
        motor3.kecepatan = 60;
        motor3.displayInfo();
    }
}
    

