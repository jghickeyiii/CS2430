import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a single letter and you will get the corresponding digit on the telephone: ");
        String letter = in.next();

        if (letter.equals("A") || letter.equals("B") || letter.equals("C")){
            System.out.println("The digit 2 corresponds to " + letter);
        }
        else if (letter.equals("D") || letter.equals("E") || letter.equals("F")){
            System.out.println("The digit 3 corresponds to " + letter);
        }
        else if (letter.equals("G") || letter.equals("H") || letter.equals("I")){
            System.out.println("The digit 4 corresponds to " + letter);
        }
        else if (letter.equals("J") || letter.equals("K") || letter.equals("L")){
            System.out.println("The digit 5 corresponds to " + letter);
        }
        else if (letter.equals("M") || letter.equals("N") || letter.equals("O")){
            System.out.println("The digit 6 corresponds to " + letter);
        }
        else if (letter.equals("P") || letter.equals("R") || letter.equals("S")){
            System.out.println("The digit 7 corresponds to " + letter);
        }
        else if (letter.equals("T") || letter.equals("U") || letter.equals("V")){
            System.out.println("The digit 8 corresponds to " + letter);
        }
        else if (letter.equals("W") || letter.equals("X") || letter.equals("Y")){
            System.out.println("The digit 9 corresponds to " + letter);
        }
        else if (letter.equals("Z") || letter.equals("Q") ){
            System.out.println("There is no number that corresponds with " + letter);
        }
        else {
            System.out.println("No special characters or lowercase allowed");
        }
    }
}
