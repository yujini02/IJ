package day09.Jol;

import java.util.Scanner;

public class Main_9071 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 10;
        int[] array = {-5,10,-8,55,6,-31,12,-24,61,2};

        /*
         데이터 입력
        for(int i=0;i<size;i++){
            int n =input.nextInt();
            array[i] =n;
        }
        */
        int maxValue = -2147483648; //even
        int minValue = 2147483647; //odd

        for(int i =0;i<size;i++){
            if(array[i]%2 == 0){
                if(maxValue < array[i]){
                    maxValue = array[i];
                }
            }else{
                if(minValue>array[i]){
                    minValue = array[i];
                }
            }
        }
    }
}
