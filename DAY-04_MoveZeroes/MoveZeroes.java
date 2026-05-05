import java.util.*;

public class MoveZeroes {

    // Function to implement
    public static void moveZeroes(int[] nums) {
        int j = 0 ;
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i] !=0 ){
                int temp = nums[i] ;
                nums[i] = nums[j] ;
                nums[j] = temp ;
                j++;

            }
        }
        // Your logic here
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call function
        moveZeroes(nums);

        // Output result
        System.out.println("Array after moving zeroes:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}