package day05.For;

import java.util.Scanner;

public class LoopEx02 {
    public static void main(String[] args) {
        int sum = 0; //누적값 저장
        System.out.println("5개의 숫자를 입력");
        int i = 0;

        for(i = 1;i <= 5;i++){
            Scanner input = new Scanner(System.in);
            int sum1 = 0;
            System.out.println("순서"+ i + " 입력해 주세요");
            int num = input.nextInt();

            sum +=num; //sum = sum + num;
        }

        System.out.println("합계 : "+sum + " 평균 : " +(sum/i));
    }
}
