package day08.Jol;

import java.util.Scanner;

public class Main_539 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=0;
        int sum=0;
        double avg=0.0;

        while(true){
            int num = in.nextInt();
            count++;
            sum +=num;
            if(num>100)break;
        }
        avg = (double)sum/count;
        System.out.printf("%d%n",sum);
        System.out.printf("%.1f%n",avg);
    }


}
