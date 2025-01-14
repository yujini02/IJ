package day05.Jol;

import java.util.Scanner;

public class Main537 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i=1;
        int sum=0;
        int num=sc.nextInt();

        while(i<=num){
            sum +=i++;
        }
        System.out.println(sum);
    }
}
