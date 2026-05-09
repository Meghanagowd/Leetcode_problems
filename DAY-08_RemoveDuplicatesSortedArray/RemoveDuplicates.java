import java.util.*;

public class RemoveDuplicates {

    // Function to implement
    public static int removeDuplicates(int[] nums) {

        int i = 0 ;
        int j = 1 ;
        int count = 1;
        while(j<nums.length){
            if(nums[i] != nums[j]){
                nums[i+1]= nums[j];
                count++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }

        // Your logic here

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input elements
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Function call
        int k = removeDuplicates(nums);

        // Output updated array
        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\nNumber of unique elements: " + k);

        sc.close();
    }
}