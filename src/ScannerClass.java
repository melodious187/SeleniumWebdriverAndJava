import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args){
        //Create scanner object
        Scanner input = new Scanner(System.in);

        //output the prompt
        //System.out.println("\nEnter a line of text to be input into the scanner:");
        System.out.println("\nEnter an Integer to be input into the scanner:");

        //Wait for the user tp input a line of text
        //String myLine = input.nextLine();
        int myInt = input.nextInt();

        //System.out.println("You entered: " + myLine);
        System.out.println("You entered: " + myInt);
    }
}
