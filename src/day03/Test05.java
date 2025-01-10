package day03;

public class Test05 {

    public static void main(String[] args) {
        byte bb=10;
        int cc=(int)bb;
        long dd = cc;
        float ff = dd;
        double doub = ff;
        System.out.printf("%f",doub);

        char charValue = 'A';
        int intValue = charValue;
         System.out.println(charValue);
         System.out.println(intValue);

         //byte byteValue = 65;
         // char charValue3 = byteValue; //byte타입은 음수를 포함하고 있어서 char에 담을 수 없다
         // 위 코드는 에러



    }

}
