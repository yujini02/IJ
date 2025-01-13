package day04;

import java.util.Scanner;

public class Main9018 {
    public static void main(String[] args) {
        //입력기생성
        Scanner input = new Scanner(System.in);
        //변수선언
        int num1 , num2 , result ;
        //데이터입력받기
        num1 = input.nextInt();
        num2 = input.nextInt();
        //데이터연산처리
        result = num1 + num2;
        System.out.printf("%d + %d = %d%n" , num1, num2, result);
        result = num1 - num2;
        System.out.printf("%d - %d = %d%n" , num1, num2, result);
        result = num1 * num2;
        System.out.printf("%d * %d = %d%n" , num1, num2, result);
        result = num1 / num2;
        System.out.printf("%d / %d = %d%n" , num1, num2, result);
        result = num1 % num2;
        System.out.printf("%d %% %d = %d%n" , num1, num2, result);

    }

}
