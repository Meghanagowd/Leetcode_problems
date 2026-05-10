import java.util.*;

public class MissingNumber {

    // Function to implement
    public static int missingNumber(int[] nums) {

        // Your logic here
        int n = nums.length;
        int ans = n * (n+1)/2;
        int sum = 0;
        for(int x: nums){
            sum += x;
        }

        return ans-sum;
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

        // Function call
        int result = missingNumber(nums);

        // Output
        System.out.println("Missing Number: " + result);

        sc.close();
    }
}