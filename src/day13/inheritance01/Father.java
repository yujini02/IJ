package day13.inheritance01;

public class Father extends GrandFather {

    String familyName = "프로그래머";
    String houseAddress = "인천";

    void printFather(){
        System.out.println("나는 아버지입니다. 할아버지로부터 상속받습니다.");
    }

}
