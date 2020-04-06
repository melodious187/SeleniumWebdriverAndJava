import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter a number to indicate a month, May or less:");
        int number = input.nextInt();

        switch(number){

            case 1: System.out.println("January");
                break;
            case 2: System.out.println("February");
                break;
            case 3: System.out.println("March");
                break;
            case 4: System.out.println("April");
                break;
            case 5: System.out.println("May");
                break;

                default: System.out.println("\nWhat you entered is not a month");
        }

    }
}
