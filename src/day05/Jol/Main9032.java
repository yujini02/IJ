package day05.Jol;

import java.util.Scanner;

public class Main9032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력하세요. ");
        int score = sc.nextInt();

        if(score>=80){
            System.out.println("축하합니다.합격입니다.");
        }else {
            System.out.println("불합격입니다.");
        }
    }
}
