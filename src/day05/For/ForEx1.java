package day05.For;

/*

    부동소수점 float 타입은 연산 과정에서 정확히 0.1을 표현하지 못하기 때문에 증감식에서
    x에 더해지는 실제값은 0.1 보다 약간 클 수 있다. 따라서 최종 반복횟수가 우리가 의도한 10번이
 */
public class ForEx1 {
    public static void main(String[] args) {
        for(float x = 0.1f; x<=1.0f;x+=0.1f){
            System.out.println(x);
        }
    }
}
