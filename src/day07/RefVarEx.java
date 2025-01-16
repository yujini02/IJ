package day07;

public class RefVarEx {
    public static void main(String[] args) {
        int[] array1; //배열 변수 array1 선언
        int[] array2;
        int[] array3;

        array1 = new int[]{1,2,3};
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);

        for(int i =0;i<array1.length;i++){
            System.out.println(array1[i] + " " +array1.hashCode());
        }

        for(int i : array1){
            System.out.println(i);
        }
    }
}
