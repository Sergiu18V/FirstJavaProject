package lab3;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("The result of the addition is: " + calculator.addition(5, 10));
        System.out.println("The result of the subtraction is: " + calculator.subtraction(6, 2));
        System.out.println("The result of the multiplication is: " + calculator.multiply(5, 2));
        System.out.println("The result of the division is: " + calculator.division(20, 2));
        System.out.println("The result of the remainder is: " + calculator.remainder(20, 2));
        System.out.println("The average sum is: " + calculator.sumOf3Nrs(20, 2, 8));

        LogicalOp operator = new LogicalOp();
        int biggest = operator.checkBiggerNumber(2,3);
        System.out.println("The bigger number is: " + biggest);
        System.out.println(operator.compText("FastTrackIT"));
        System.out.println(operator.textAndNr("FastTrackIT", 3));
        System.out.println(operator.snow(6));
        System.out.println(operator.greatNumber(5));
        System.out.println(operator.whatNumber(2));
        System.out.println(operator.isNumberEven(2));
        System.out.println(operator.isEligibleToVote(17));
        System.out.println(operator.threeNr(5, 3, 8));
    }
}
