package day07;

public class RefVarEx1 {
    public static void main(String[] args) {
        String kind1 = "자동차";
        String kind2 = kind1;
        System.out.println(kind1.hashCode() + " " + kind2.hashCode());
        System.out.println(kind1 + " "+kind2);
        kind1 = null;

        System.out.println(kind2.hashCode());
        System.out.println(kind1 + " "+kind2);

    }
}
