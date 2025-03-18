class Solution2401 {
    public int longestNiceSubarray(int[] nums) {
        
        int left = 0, currentAnd = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            while ((currentAnd & nums[i]) != 0) {
                currentAnd -= nums[left];
                left++;
            }
            currentAnd += nums[i];
            if (i - left + 1 > count) {
                count = (i) - left + 1;
            }
        }
        return count;
    }
}

public class LeetGit2401{
    public static void main(String[] args) {
        Solution2401 solution = new Solution2401();
        int arr[] = {1,3,8,48,10};
        System.out.println("->"+ solution.longestNiceSubarray(arr));
    }
}