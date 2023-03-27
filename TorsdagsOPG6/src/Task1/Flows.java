package Task1;

public class Flows {


    public void methodA(String input) {
        System.out.println("Java");
        if (!input.equals("start")) {
            System.out.println("er");
            methodB("start");
        } else {
            System.out.println("d");
            System.out.println(methodC(input));

        }
        System.out.println("!");
    }

    public void methodB(String start) {
        System.out.println("sjovt");
    }

    public int methodC(String input) {
        System.out.println("e");
        methodD(input.length());
        return input.length() * 2;
    }

    public void methodD(int number) {
        System.out.println("f");
        if (number > 5) {
            System.out.println("g");
        }
        System.out.println("h");

    }
}
