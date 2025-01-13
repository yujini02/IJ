package day04.jungol;

import java.util.Scanner;

public class Main518 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,num3,sum,average;

        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        sum = num1 + num2 + num3;
        average = (num1 + num2 + num3)/3;

        System.out.println("sum : "+sum);
        System.out.println("avg : "+average);

        /*
        result =Integer.sum(Integer.sum(a,b),c);
         */
    }
}
