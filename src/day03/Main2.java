package day03;

import java.util.Scanner;

public class Main2 {

   static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("첫번째수입력");
        int n1=input.nextInt();
        int n2=input.nextInt();
        String operator = input.next();

        System.out.printf("%d %d %s",n1,n2,operator);

        adder(n1,n2);
        minus(n1,n2);
        multi(n1,n2);
        div(n1,n2);
    }
        static void adder(int num1, int num2){
            int result = num1 + num2;
            System.out.println("덧셈의 결과:"+result);
            System.out.printf("%d + %d = %d%n",num1,num2,result);
        }
        static void minus(int num1, int num2){
            int result = num1 - num2;
            System.out.println("뺄샘의 결과:"+result);
            System.out.printf("%d - %d = %d%n",num1,num2,result);
        }
        static void multi(int num1, int num2){
            int result = num1 * num2;
            System.out.println("곱셈의 결과:"+result);
            System.out.printf("%d * %d = %d%n",num1,num2,result);
        }
        static void div(int num1, int num2){
            int result = num1/num2;
            System.out.println("나눗셈의 결과:"+result);
            System.out.printf("%d / %d = %d",num1,num2,result);
        }

}
