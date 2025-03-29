public class LeetGit189 {
    public static void main(String[] args) {
        Solution189 obj = new Solution189();
        int a[] = {1,2,3,4,5};
        obj.rotate(a, 10);
    }
}
class Solution189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
         // Handle cases where k > n
        
        // Reverse the whole array
        reverse(nums, 0, n - 1);
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Reverse the remaining elements
        reverse(nums, k, n - 1);
    }
    
    void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

/*
 * for(int i=0;i<k;i++)
 * nums[i] = nums[i] + nums[nums.length- (-i+k)] - (nums[nums.length - (-i+k)] =
 * nums[i]);
 * 
 * for(int m = 0 ; m<nums.length ; m++) System.out.print(nums[m] + " ");
 * 
 * System.out.println();
 * 
 * 
 * if((k*2) != nums.length)
 * for(int i = 1 ;i<(nums.length-k);i++)
 * nums[(nums.length - (i))] = nums[(nums.length - (i))] + nums[(nums.length -
 * (i)) - 1] -(nums[(nums.length - (i))-1]= nums[(nums.length - (i)) ]);
 */