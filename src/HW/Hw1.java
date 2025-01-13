package HW;

public class Hw1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = (++x) + (y--); //11을 z에 먼저 대입 z(11)+20=31
        System.out.println(z);
    }

}
