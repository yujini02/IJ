package day05.Jol;

import java.util.Scanner;

public class Main634 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //행의 수
        int num=in.nextInt();

        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
