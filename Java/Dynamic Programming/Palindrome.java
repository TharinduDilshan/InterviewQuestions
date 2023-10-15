import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        String input;//This is the input
        String reverseNumber = "";//This is the reverse number
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string or number");
        input = in.nextLine();

        int len = input.length();
        for ( int i = len - 1; i >= 0; i-- )
            reverseNumber = reverseNumber + input.charAt(i);
        if (input.equals(reverseNumber))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }
}