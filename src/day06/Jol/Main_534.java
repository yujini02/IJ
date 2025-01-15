package day06.Jol;

import java.util.Scanner;

public class Main_534 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int i = 2;

        while(true){
            System.out.printf(i+ " ");
            i += 2;
            if(i>=num)break;
        }
    }

}
