package day03;

public class Main {
    public static void main(String[] args) {
        adder(10,20);
        minus(100,10);
    }

    static void adder(int num1,int num2){
        int result = num1 +num2;
        System.out.println("덧셈결과 : "+result);
        System.out.printf("%d + %d = %d%n",num1,num2,result);  // 10 + 20 = 30
    }
    static void minus(int num1, int num2){
        int result = num1 - num2;
        System.out.println("뺄셈결과 : "+result);
        System.out.printf("%d -%d = %d%n", num1,num2,result);
    }
    void multi(int num1, int num2){
        int result = num1 * num2;
        System.out.println("곱셈결과 : "+result);
        System.out.printf("%d * %d =%d%n", num1,num2,result);
    }
    void div(int num1, int num2){
        int result = num1 / num2;
        System.out.println("나눗셈결과 : "+result);
        System.out.printf("%d / %d =%d%n", num1,num2,result);
    }
}
