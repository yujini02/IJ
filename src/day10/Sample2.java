package day10;

public class Sample2 {
    public static void main(String[] args) {
        Scar scar1 = new Scar();
        scar1.setNumGas(1234,20.5);
        scar1.show();

        scar1.setNumGas(1234,-10.0);
        scar1.show();
    }
}
