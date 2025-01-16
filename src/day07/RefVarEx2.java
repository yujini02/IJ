package day07;
class Phone{
    String bander;  //삼성, 샤오미
    String version; //버전
    String model;
}
public class RefVarEx2 {
    public static void main(String[] args) {
        /*
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = null;
        System.out.println(phone3);

        System.out.println(phone1 == phone2);
        System.out.println(phone1 == phone3);
        System.out.println(phone2 != phone3);
        */

        //자바는 프로그램 실행 도중에 발생하는 오류를 예외(Exception)라고 한다.
        //참조 변수에 null 상태에서 객체의 데이터나 메소드를 사용하려면 예외가 발생한다.
        int[] intArray=new int[]{0,0,0,0}; //null  //int[] intArray = null;
        intArray[0] = 10;
        for(int data : intArray){
            System.out.print(data + " ");
        }
        for(int index=0;index < intArray.length;index++){
            System.out.println(intArray[index]);
        }
        for(int i=0;i < 4;i++){
            System.out.println(intArray[i]);
        }

    }
}
