package lab4;
// FOR LOOP
// HOMEWORK 1
public class LogicalOp {
    public void printToHundred(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println("The number is: " + i);
        }
    }

    // HOMEWORK 2
    public void printFromHundred(int number) {
        for (int i = number; i >= 1; i--) {
            System.out.println("The number is: " + i);
        }
    }

    // EXERCISE 3
    public void fromOneToTwo(int first, int last) {
        for (int i = first; i <= last; i++) {
            System.out.println("The number is: " + i);
        }
    }
// EXERCISE 4

    public void highNumber(int one, int two) {
        int i = 0;
        if (one > two) {
            i = one;
        } else {
            i = two;
        }
    }

    public void checkNumbers(int primul, int doilea) {

    }

    // EXERCISE 5

    public void numarPar(int numerus) {
        for (int i = numerus; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("The number is: " + i);
            }
        }
    }

    // EXERCISE 6
    public void numarImpar(int nr) {
        for (int i = nr; i <= 100; i += 2) {
            if (i % 2 != 0) {
                System.out.println("The number is: " + i);
            }
        }
    }

    //EXERCISE 7
    public int total(int number) {
        int sum = 0;
        for (int i = number; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    // EXERCISE 8
    public float average(int number) {
        int sum2 = 0;
        int count = 0;
        for (int i = number; i <= 100; i++) {
            sum2 += i;
            count++;
        }
        return sum2 / count;
    }

    //EXERCISE 9
    public void stairs(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) > n) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
