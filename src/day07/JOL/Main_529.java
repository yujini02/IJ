package day07.JOL;

import java.util.Scanner;

public class Main_529 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height=in.nextInt();
        int weight=in.nextInt();
        int level=weight+100-height;
        System.out.println(level);
        if(level>0){
            System.out.println("Obesity");
        }
    }
}
