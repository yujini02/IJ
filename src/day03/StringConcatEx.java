package day03;

public class StringConcatEx {
    public static void main(String[] args) {
        int result = 10 + 2 + 8;
        System.out.println("result : "+result);

        //결합연산
        String result1 = "10" + 2 + 8; // 문자열로 시작되서 1028
        System.out.println(result1);

        String result2 = "10" + (2 + 8); // ()로부터 계산
        System.out.println(result2+10); //10은 숫자이지만 연산이 안됨 (?)
    }
}
