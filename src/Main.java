public class Main {
// 1. Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
    public static void main(String[] args) {
        // Print Hello and my name
        printMyName();
//	System.out.println("Hello");
//	System.out.println("Sergiu");
	// Print an addition
//	System.out.println(3 + 2);
        addition();
	// Print a division
//	System.out.println(7/2f);
	    division();
	// Print the following mathematical operations
        mathOperations();


    }

    public static void printMyName(){
        System.out.println("Hello \nSergiu!");
    }

    public static void addition() {
        System.out.println(2 + 11);
    }

    public static void division() {
        System.out.println(9 / 2f);
    }

    public static void mathOperations() {
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9 );
        System.out.println(20 + -3*5 / 8f);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }
}

