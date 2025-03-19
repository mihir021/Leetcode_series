public class LeetGit3191 {
    public static void main(String[] args) {
        Solution3191 obj = new Solution3191();
        int a[] = {0,1,1,1};
        System.out.println(obj.minOperations(a));
    }
}
class Solution3191 {
    public int minOperations(int[] nums) {
        int ans = 0;
        boolean found = false;

        for(int i =0 ; i<(nums.length-2) ; i++){
            if(nums[i] == 0){
                nums[i] = 1;
                if(nums[i+1] == 1) nums[i+1] = 0;
                else if(nums[i+1] == 0) nums[i+1] = 1;
                if(nums[i+2] == 0) nums[i+2] = 1;
                else if(nums[i+2] == 1) nums[i+2] = 0;
                ans++;
            }
        }
        for(int i = 0 ; i < nums.length;i++){

            if(nums[i]==1)  found = true;

            else { found = false; break; }
        }
        if(found)  return ans;
        else  return -1;
    }
}
