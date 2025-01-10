package day03;
/*강제타입의 목적은 원래 값이 유지되면서 타입을 바꾸기 위해 사용한다.
  작은 허용 범위 타입에 저장될 수 있는 값을 가지고 강제타입 변환을 해야만
  원래 목적을 달성할 수 있다.
*/
public class PromotionEx {
    public static void main(String[] args) {

        char charValue = '가';
        int intValue = charValue;
        char charValue1 = (char)intValue;
        //char 타입의 경우 int 타입으로 자동변환되면 유니코드 값이 int타입에 대입된다.
        System.out.println("가의 유니코드 값 = " + intValue);
        System.out.println(charValue1);

        intValue = 100;
        long longValue = intValue;

        float floatValue = 100.5f;
        double doubleValue = floatValue;
        System.out.println(floatValue);
        System.out.println(doubleValue);

        int intValue2 = 500;
        byte byteValue2 = (byte)intValue2;
            System.out.println(byteValue2);

        int intValue3 = 10;
        byte byteValue3 = (byte)intValue3;
        System.out.println(byteValue3);

        int intValue4 = 128;
        byte byteValue4 = (byte)intValue4;
        System.out.println(byteValue4);

        long longValue3 = 300;
        int inValue5 =(int)longValue3;
        System.out.println(inValue5);

        //int -> char
        //int 타입은 char타입으로 자동변환 되지 않고, (char)캐스팅해서 강제 변환해 주어야 한다.
        //주의할 점 : char 타입의 허용 범위인 0~065535 사이의 값만 원래 값으로 유지된다

        int intValue5 = 97;
        char charValue4 = (char)intValue5;
        System.out.println(intValue5+" "+charValue4);

        //실수 -> 정수 의 강제 캐스팅은 소수점 이하 부분은 버려지고, 정수 부분만 저장한다.
         double doubleValue5 = 3.14;
         int intValue6 = (int)doubleValue5;
         System.out.println(intValue6);

         //자바 컴파일러는 컴파일 단계에서 10+20=>30 결과를 만들고 result변수에 30을 저장하는 바이트코드
         // 이는 실행 시 덧셈연산에 대한 절차가 없으므로 실행 성능을 높일 수 있다.
         //다만, 정수 리터럴이 아닌 변수가 피연산자로 사용되면 실행 시 연산을 수행한다.

         byte result = 10 + 20;
         int a = 100;
         int b = 200;
         int result1 = a + b;
    }
}
