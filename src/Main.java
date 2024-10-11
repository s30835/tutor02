public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(1,2));
        System.out.println(adder.add(3,4));


        Substractor substractor = new Substractor();
        System.out.println(substractor.substract(1,2));
        System.out.println(substractor.substract(100,99));
    }
}
