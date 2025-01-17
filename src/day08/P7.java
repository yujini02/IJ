package day08;

public class P7 {
    public static void main(String[] args) {
        int[] array = {1,5,3,8,2};
        int max = array[0];  //데이터의 범위를 모르는 경우-첫번째 데이터로 초기화
        for(int i=0;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        System.out.printf("최대값 %d",max);
    }
}
