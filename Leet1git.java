package Github.Leetcode_series;

import java.util.Scanner;

public class Leet1git {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter total size of array :");
        // size is use for to store the size of array.
        int size = Sc.nextInt();
        // craeating array 
        int nums[] = new int[size];

        // to Enter numbers in the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + "th element ");
            nums[i] = Sc.nextInt();
        }

        // for target input...
        System.out.print("Enter target :");
        int target = Sc.nextInt();

        // making obj of secound class...
        Solution obj = new Solution();

        // to store the ans from the retune value...
        int ans[] = new int[size];

        // meathod calling..
        ans = obj.twoSum(nums, target);

    }// End of psvm...

}// end of Leet1 class...

class Solution {

    // for cal the ans...
    public int[] twoSum(int[] nums, int target) {

        // ans is use for coprarison with target...
        int ans;

        // i and fix is use in for loops...
        int i=0;
        int fix=0;
        boolean found = false ;

        // to hold the 1st number...
        for (fix = 0; fix < nums.length; fix++) {

            // for make sure loop is running agine then value of found will be false 
            found = false;

            // to hold the secound number...
            for (i = 1; i < (nums.length); i++) {

                // for make sure loop is running agine then value of found will be false
                found = false;

                // to store the sum of the 2 element of the arrays...
                ans = nums[fix] + nums[i];

                // varificatin purpose of target and ans...
                if (ans == target){
                    found = true ;

                    // to make sure this not reapit the same number 
                    if(i != fix)
                    break;
                }
            }
            // if found then cheak coditions and brek the loop...
            if(found)
            if(i != fix)
            break;
        }

        // to print the ans...
        if (found)
        System.out.println("[" + fix  + "]" + "[" + (i)+ "]");
        else
        System.out.println("not found target !!!");

        // for retune the array...
        int ans_in_array[] = new int[2];
        
        // give values from the loop...
        ans_in_array[0]= fix;
        ans_in_array[1]= i;

        return ans_in_array;
    }
}// End of Solution class...

