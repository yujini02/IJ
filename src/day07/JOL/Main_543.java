package day07.JOL;

import java.util.Scanner;

public class Main_543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while(true) {
            n = sc.nextInt();
            if (n <= 50 && n >= 1) {
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

        for(int i=1; i<=n; i++){
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }
    }
}