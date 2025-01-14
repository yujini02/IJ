package day05.If;

public class ConditionEx4 {
    public static void main(String[] args) {
        System.out.println("메뉴를 번호(1-2로 고르세요. 1.중식 2.양식)");
        int menuChoice = 0;
        menuChoice = 1;
        if(menuChoice == 1){
            System.out.println("짜장면 맛있게 드세요");
        }else if(menuChoice == 2){
            System.out.println("파스타 맛있게 드세요");
        }else{
            System.out.println("비빔밥 맛있게 드세요");
        }
    }
}
