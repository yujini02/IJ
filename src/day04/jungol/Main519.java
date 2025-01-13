package day04.jungol;

import java.util.Scanner;

public class Main519 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 , n2;

        n1 = input.nextInt();
        n2 = input.nextInt();

        n1 = n1 + 100;
        n2 = n2 % 10;

        System.out.printf("%d %d", n1,n2);


    }
}
