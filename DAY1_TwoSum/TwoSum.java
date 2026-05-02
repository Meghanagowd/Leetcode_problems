import java.util.*;

public class TwoSum {

    // Function to implement
    public static int[] twoSum(int[] arr, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ;i< arr.length ; i++){
            int req = target - arr[i] ;
            if (map.containsKey(req)){
                return new int[] { map.get(req) , i};
            }

            map.put(arr[i] , i);
        }


        return new int[] {-1,-1};

         
        
        
        // Your logic here
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // Call function
        int [] ans  = twoSum(arr, target);
        for(int x : ans){
            System.out.print(x + " ");
        }

        sc.close();
    }
}