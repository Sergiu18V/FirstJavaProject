package lab2;

public class Main {

    public static void main(String[] args) {
        // EXERCISE 2
        // Multiply
        System.out.println("The result of the multiplication is: " + multiply(7, 8));

        // Division
        System.out.println("The result of the division is: " + division(4, 2));

        // Addition
        System.out.println("The result of the addition is: " + addition(24, 38));

        // Subtraction
        System.out.println("The result of the substraction is: " + subtraction(66, 37));

        // EXERCISE 6 - MODULO
        System.out.println("The remainder is: " + remainder(8, 4));

        // EXERCISE 3 - JAVA SPELLING
        exercise3();

        // EXERCISE 4 - Sum of 3 numbers
        System.out.println("The sum of the three numbers is: " + sumOf3Nrs(7, 15, 22));

        //EXERCISE 5
        exercise5();
    }




    // METHODS
    public static int addition(int first, int second) {
        return first + second;
    }

    public static int subtraction(int first, int second) {
        return first - second;
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

    public static void exercise3() {
        System.out.println("   J    a   V     V  a");
        System.out.println("   J   a a   V   V  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa ");
        System.out.println(" JJ  a     a   V  a     a");
    }

    public static int sumOf3Nrs(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void exercise5() {
        System.out.println( " +\" \" \" \" \"+" );
        System.out.println("[|  o   o  |]");
        System.out.println(" |    ^    | ");
        System.out.println(" |  ' _ '  | ");
        System.out.println(" +---------+ ");
    }

}

