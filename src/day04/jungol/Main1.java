package day04.jungol;

public class Main1 {
    public static void main(String[] args) {
        //swtiching
        int n1, n2, temp;
        n1 = 10;
        n2 = 20;

        temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.printf("%d %d",n1,n2);
    }
}
