package day04.lecture;

public class SignOperatorEx {
    public static void main(String[] args) {
    /* 1. 부호 연산자 +, -변수 : +연산자는 생략하고 -연산자는 변수값의 부호를 바꿀때

        byte b = 100;
        System.out.println(-b);
        System.out.println(-(-(b)));

        2.증감연산자 (++,--)
     */

     int x = 1;
     int y = 1;
     /*
     int result1 = ++x;
     System.out.println(x + " " +result1);

     int result2 = x++; //result2 = x(2) => x=x+1(3)
     System.out.println(x + " " + result2);
     //System.out.println(result1 + " "+result2 + " " + x);
     */
      int result1 = ++x + 10;
      System.out.println(result1); //12  선증가
      int result2 = y++ +10;
      System.out.println(result2); //11  후증가
    }
}
