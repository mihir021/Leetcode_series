public class LeetGit26 {
    public static void main(String[] args) {
        int[] a = { 0,-1,0,1, 1, 2, 3, 4, 4 ,4,5};

        Solution obj = new Solution();
        obj.removeDuplicates(a);

    }

}
class Solution {
    public int removeDuplicates(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    nums[j] = -999;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= -998) {
                nums[ans] = nums[i];
                ans++;
            }
        }
        for (int i = ans; i < nums.length; i++) {
                nums[i] = 0;
        }
        for (int i = 0; i < nums.length ; i++)
            System.out.print(nums[i] +" ");     // 1 2 3 4 4 0 4
            
        return ans;
    }
}