package lab2;

public class Main {

    public static void main(String[] args) {
        // Multiply
        System.out.println("The result of the multiplication is: " + multiply(7, 8));

        // Division
        System.out.println("The result of the division is: " + division(4, 2));

        // Modulo
        System.out.println("The remainder is: " + remainder(8, 4));
    }

    public static int multiply(int first, int second) {
//        int multiplyResult = first * second;
        return first * second;
//        return multiplyResult;
    }

    public static float division(float first, int second) {
//        float divisionResult = first / second;
        return first / second;
//        return divisionResult;
    }

    public static int remainder(int first, int second) {
//        int remainderResult = (first % second);
        return first % second;
//        return remainderResult;
    }

}

