package day12;

class AllStatic{
    private AllStatic(){}
    public static int hap(int a, int b){
        int v = a + b;
        return v;
    }
}

public class AllStaticTest {
    public static void main(String[] args) {
        //AllStatic a = new AllStatic();
        int result = AllStatic.hap(10,20);
        System.out.println(result);
    }
}
