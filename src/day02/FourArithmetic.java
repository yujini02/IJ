package day02;

public class FourArithmetic {
    public static void main(String[] args) {
        int a = 12; //a에 12할당
        int b = 2; //b에 2할당
        int result = 0; //처리 결과를 저장하는 변수

        result = a + b ;
        System.out.printf("a + b = %d%n",result);
        System.out.println("a+b=" + result);
        result = a - b ;
        System.out.printf("a + b = %d%n",result);
        result = a * b ;
        System.out.printf("a + b = %d%n",result);
        result = a / b ;
        System.out.printf("a + b = %d%n",result);
    }
}
