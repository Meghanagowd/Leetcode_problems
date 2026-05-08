import java.util.*;

public class ValidPalindrome {

    // Function to implement
    public static boolean isPalindrome(String s) {

        String newString = s.toLowerCase();

        int left = 0 ;
        int ryt = s.length()-1;

        while(left < ryt){
            char ch1 = newString.charAt(left);
            char ch2 = newString.charAt(ryt);

            if( !((ch1>='a' && ch1<='z') && (ch1>='0' && ch1<='9'))){
                left++;
                continue;

            }
            if( !((ch2>='a' && ch2<='z') && (ch2>='0' && ch2<='9'))){
                ryt--;
                continue;

            }

            if(ch1!=ch2){
                return false ;
            }

            left++;
            ryt--;

        }


        // Your logic here

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        // Function call
        boolean result = isPalindrome(s);

        // Output
        System.out.println("Is Palindrome: " + result);

        sc.close();
    }
}