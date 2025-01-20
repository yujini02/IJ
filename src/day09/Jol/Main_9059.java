package day09.Jol;

import java.util.Scanner;

public class Main_9059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++){   //row

            for(int j=(5-1); j>i;j--){  //colum
                System.out.print(" ");
            }
            for(int j =0; j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
