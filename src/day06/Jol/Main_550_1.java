package day06.Jol;

import java.util.Scanner;

public class Main_550_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int row = 0; row <n ; row++){ //행 반복
            for(int column = 0; column<=row;column++){
                System.out.print(" ");
            }
            System.out.println();
            for(int star = 0; star < n-row;star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
