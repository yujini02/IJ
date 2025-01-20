package day09.Jol;

import java.util.Scanner;

public class Main_143 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();

        for(int i=row;i>=1;i--){ //위쪽 삼각형
            for(int j = 0;j<=(row-i-1);j++){ //한 행에 뿌려질 공백
                System.out.print(" ");
            }
            for(int j=0;j<=i*2-1;j++){ //한 행에 뿌려질 별
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 2; i<=row;i++){ //아랫쪽 삼각형
            for(int j=0;j<=(row-i-1);j++){
                System.out.print(" ");
            }
            for(int j =0;j<i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
