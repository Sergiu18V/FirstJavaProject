package lab2;

public class Main {
//    static int mulNum1 = 8;
//    static int mulNum2 = 4;

    public static void main(String[] args) {
        // Multiply
//        int multiply1 = multiply(mulNum1, mulNum2);
        int multiply = multiply(6, 3);
//        int divide1 = division(num1, num2);
//        int divide2 = division(4, 2);
        System.out.println(multiply);
//        System.out.print(multiply(mulNum1, mulNum2));
//        System.out.println(divide1);
//        System.out.print(division(num1, num2));
        // Division
        double divide2 = division(34, 5);
        System.out.println(divide2);
    }

    public static int multiply(int first, int second) {
        int multiply = first * second;
        return multiply;
    }

    public static int division(int first, int second) {
        int division = first / second;
        return division;
    }

}

