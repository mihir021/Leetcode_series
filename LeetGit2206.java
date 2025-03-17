public class LeetGit2206 {
    public static void main(String[] args) {
        Solution2206 obj = new Solution2206();
        int a[] = { 1,2,3,4 };
        obj.divideArray(a);
    }

}
class Solution2206 {
    public boolean divideArray(int[] nums) {
        boolean ans = false;

        int count[] = new int[(nums.length)];

        if (nums.length % 2 == 0) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count[i]++;
                    }
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (count[i] % 2 ==0) {
                ans = true;
            } else {
                ans = false;
                break;
            }
        }
        System.out.println(ans);
        return ans;
    }
}
