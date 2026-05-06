import java.util.*;

public class ValidAnagram {

    // Approach 1: Sorting
    public static boolean isAnagramSorting(String s, String t) {

        if(s.length() != t.length()){
            return false ;
        }

        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);
        if(Arrays.equals(string1,string2)){
            return true ;
        }
        return false ;

        // sorting logic

    }

    // Approach 2: Frequency Count
    public static boolean isAnagramFrequency(String s, String t) {

        // frequency logic

        HashMap<Character ,Integer> map = new HashMap<>();
         if(s.length() != t.length()){
            return false ;
        }
        for(int i = 0 ; i<s.length() ;i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i),0)+1);
            map.put(t.charAt(i) , map.getOrDefault(t.charAt(i),0)-1);
        }

        for(Integer x : map.values()){
            if(x!=0){
                return false;
            }
        }
        
        return true ;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        // Call any approach
        boolean result = isAnagramSorting(s, t);

        System.out.println("Are Anagrams: " + result);

        sc.close();
    }
}