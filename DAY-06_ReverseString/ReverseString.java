import java.util.*;

public class ReverseString {

    // Function to implement
    public static void reverseString(char[] s) {

        int i = 0;
        int j = s.length-1;
        while(i<=j){
            char ch = s[i] ;
            s[i] = s[j] ;
            s[j] = ch ;
            i++;
            j--;

        }

        // Your logic here

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert string to char array
        char[] s = input.toCharArray();

        // Function call
        reverseString(s);

        // Output reversed string
        System.out.print("Reversed String: ");

        for (char ch : s) {
            System.out.print(ch);
        }

        sc.close();
    }
}