package day09;

public class Car {  //클래스를 선언하고
    int num; //차량 번호를 저장하는 변수                //필드
    double gas; //연료의 양을 저장하는 변수
    void show()
    {
        System.out.println("차량 번호는"+this.num+"입니다."); //메소드의 정의
        System.out.println("연료량은"+this.gas+"입니다.");
    }
    void showCar(){
        System.out.println("지금부터 자동차의 정보를 표시합니다.");
        show();
    }
}

//자동차 클래스의 객체 생성하기
class Sample1{
    public static void main(String[] args) {
        Car car1;           //객체를 만들고
        car1 = new Car();
        //Car car1 = new Car();

        car1.num = 1234;    //멤버에 접근해서 프로그램을 작성
        car1.gas = 20.5;
        car1.show();

        Car car2;
        car2 = new Car();
        car2.num = 5678;
        car2.gas = 30.5;


        //System.out.println("차량연료는"+car1.gas+"입니다."); //차량 정보를 표시하는 메소드
        //System.out.println("차량번호는"+car1.num+"입니다.");


    }
}
