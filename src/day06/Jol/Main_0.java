package day06.Jol;

import java.util.Scanner;

public class Main_0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char ch = 'A';
        int number = 1;

        for(int row = 0; row <n ; row++){ //행 반복
            for(int i = 0; i<n-row;i++){ //숫자 블럭
                System.out.print(number++ + " ");
            }
            for(int c = 0; c< row + 1; c++){ //문자 블럭
                System.out.println(ch++ + " ");
            }
            System.out.println();
        }

    }
}
