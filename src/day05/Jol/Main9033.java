package day05.Jol;

import java.util.Scanner;

public class Main9033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        System.out.print("점수를 입력하세요. ");

        if(score>=90){
            System.out.println("A");
        }else if(score<90 && score>=80){
            System.out.println("B");
        }else if(score<80 && score>=70) {
            System.out.println("C");
        }else if(score<70 && score>=60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
