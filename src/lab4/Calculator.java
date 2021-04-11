package lab4;
// EXERCISE 1
public class Calculator {
    public void printTo100(int number) {
        int i = 0;
        while (i <= number) {
            System.out.println(i);
            i++;
        }
    }

    // EXERCISE 2

    public void minusHundred(int num) {
        int i = num;
        while (i >= -100) {
            System.out.println(i);
            i--;
        }
    }

    // EXERCISE 3
    public void oneToTwo(int first, int last) {
        int i = first;
        while (i < last) {
            System.out.println(i);
            i++;
        }
    }

    int x;
    int y;

    //EXERCISE 4
    public void smallAndBig(int first, int second) {
        int x = 0;
        int y = 0;
        if (x < y) {
            x += first;
            y += second;
        } else {
            y += first;
            x += second;
            int i = first;
            while (i < second) {
                System.out.println(i);
                i++;
            }
        }
    }

    // EXERCISE 5
    public void evenNr() {
        int i = 0;
        while (i <= 100) {
            i++;

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //EXERCISE 6
    public void oddNr() {
        int i = 0;
        while (i < 100) {
            i++;
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //EXERCISE 7
    public void average() {
        int sum = 0;
        int count = 0;
        int i = 111;
        while (i <= 8899) {
            i++;
            sum += i;
            count++;
        }
        System.out.println("The average is: " + sum / count);
    }

    //EXERCISE 8
    public void nrSeven(int first, int second) {
        int i = first;
        int sum = 0;
        int count = 0;
        while (i < second) {
            i++;
            if (i % 7 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println("The average is: " + sum / count);
    }

    public void cozaLozaWoza() {
        int i = 1;
        while (i <= 110) {
//            i++;
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print("CozaLozaWoza ");
            }
            else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("WozaLoza ");
            }
            else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("CozaWoza ");
            }
            else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza ");
            }
            else if (i % 3 == 0) {
                System.out.print("Coza ");
            }
            else if (i % 5 == 0) {
                System.out.print("Loza ");
            }
            else if (i % 7 == 0) {
                System.out.print("Woza ");
            }
            if (i % 11 == 0) {
                System.out.println(" ");
            }
            else {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}

