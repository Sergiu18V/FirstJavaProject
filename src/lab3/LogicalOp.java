package lab3;
// Using return "" - https://stackoverflow.com/questions/23058029/missing-return-statement-within-if-for-while

public class LogicalOp {
    // EXERCISE 3
    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }
// EXERCISE 4
    public String compText(String text) {
        if (text.equals("FastTrackIT")) {
            return ("Learning text comparison");
        } else {
            return ("Got to try some more");
        }
    }
// EXERCISE 5
    public String textAndNr(String text, int num) {
        if (text.equals("FastTrackIT") && num <= 3) {
            return (text + " " + num);
        } else if (!text.equals("FastTrackIT") && num >= 4) {
            return (num + " " + text);
        }
        return "";
    }

    // EXERCISE 6
    public String snow(int number) {
        if (number > 8 || number == 6) {
            return ("The amount of snow this winter was(cm): " + number);
        } else {
            System.out.println("The forecast snow is(cm): " + number);
        }
        return "";
    }

    // EXERCISE 7
    public String greatNumber(int nr) {
        if (nr > 3 && nr != 4) {
            return ("The number is greater than 3 and not equal to 4");
        } else if (nr == 4) {
            return ("The number is equal to 4");
        } else if (nr < 3) {
            return ("The number is lower than 3");
        }
        return "";
    }

    // EXERCISE 8 - Doesn't seem to work
    public String whatNumber(int number) {
        switch (number) {
            case 1:
                System.out.println("The number is 1");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            case 3:
                System.out.println("The number is 3");
                break;
            case 4:
                System.out.println("The number is 4");
                break;
        }
        return "";
    }

    // EXERCISE 9
    public boolean isNumberEven(int numeral) {
        if(numeral % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // EXERCISE 10
    public boolean isEligibleToVote(int age) {
        if (age > 18) {
            return true;
        } else {
            return false;
        }
    }

    // EXERCISE 11
    public int threeNr(int one, int two, int three) {
        if (one > two && one > three) {
            return one;
        } else if (two > one && two > three) {
            return two;
        } else {
            return three;
        }
    }
    }

