// package Github.Leetcode_series;
// // 27 remove element

// public class Leet27 {

//     public static void main(String[] args) {
//        int a[] ={1,2,3};
//        int n = 2;

//        Solution obj = new Solution();
//        obj.removeElement(a, n);
//     }
// }
// class Solution {
//     public int removeElement(int[] nums, int val) {

//         int i = 0;
//         for (int j = 0; j < nums.length; j++) {
//             if (nums[j] != val) {
//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;
//                 i++;
//             }
//         }
//         for(int m=0;m<nums.length;m++){
//             System.out.println(nums[m]);
//         }
//         return i;
//     }
// }
