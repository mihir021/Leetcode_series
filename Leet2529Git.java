package Github.Leetcode_series;
class Leet2529{
    public static void main(String[] args) {

        int a[] = {0,0,0,1,-2};

        Solution obj = new Solution();
        System.out.println(obj.maximumCount(a));
    }
}
class Solution {
    public int maximumCount(int[] nums) {

        int ans = 0;
        int positive = 0;
        int negitive = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                positive++;
            }
            if(nums[i]<0){
                negitive++;
            }
        }
        return (int)Math.max(positive, negitive);
    }
}