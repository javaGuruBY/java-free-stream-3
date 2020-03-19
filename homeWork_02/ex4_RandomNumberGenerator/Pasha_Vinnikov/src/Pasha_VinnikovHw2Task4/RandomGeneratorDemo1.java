package Pasha_VinnikovHw2Task4;

public class RandomGeneratorDemo1 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 31);
        float y = (float) (Math.random() * 31 + 30);
        float z = (float) (Math.random() * 60 + 60);
        System.out.println("1) random x [0 - 30] = " + x);
        System.out.println("2) random y [30 - 60] = " + y);
        System.out.println("3) random z [60 - 120) = " + z);
        float total = x + y + z;
        System.out.println("TOTAL = " + total);
    }
}
