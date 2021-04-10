package lab4;

public class Main {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
        op.printToHundred(1);
        op.printFromHundred(100);
        op.fromOneToTwo(5, 60);
        op.numarPar(1);
        op.numarImpar(1);
        System.out.println("The sum of the numbers is: " + op.total(1));
        System.out.println("The average of the numbers is: " + op.average(1));
        op.stairs(7);
    }

}
