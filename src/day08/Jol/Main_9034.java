package day08.Jol;

import java.util.Scanner;

public class Main_9034 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        System.out.print("주사위를 두 번 던진 결과를 입력하세요. ");
        if(n1>=4 && n2>=4){
            System.out.println("이겼습니다.");
        }else if(n1>=4 || n2>=4){
            System.out.println("비겼습니다.");
        }else if(n1<4 && n2<4){
            System.out.println("졌습니다");
        }
    }
}
