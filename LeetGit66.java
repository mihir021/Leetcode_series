/*

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4]. 

*/
public class LeetGit66 {
    public static void main(String[] args) {
        Solution66 obj = new Solution66();
        int a[] = {  9, 9 };
        obj.plusOne(a);
    }
}

class Solution66 {
    public int[] plusOne(int[] digits) {

        boolean done = false;
        boolean add_boolen = false;
        digits[digits.length - (1)] += 1;

        for (int i = 0; i < digits.length; i++) {

            if (digits[digits.length - (i + 1)] > 9) {

                if(digits.length - (i + 1 + 1) >= 0){
                    digits[digits.length - (i + 1 + 1)] += 1;
                    digits[digits.length - (i + 1)] = 0;
                    done = true;
                }else{
                    add_boolen = true;
                }
            } else {
                done = false;
                break;
            }
        }
        int ans[] = new int[digits.length+1];
        if(add_boolen){

          ans[0] = 1;
          ans[1] = 0;

          for(int i=1 ;i<ans.length;i++){
            ans[i] = 0;
          }
           
        }
       

        if(!add_boolen){
            for (int i = 0; i < digits.length; i++) {
                System.out.print(digits[i] + " ");
            }
        }else{
            for (int i = 0; i < ans.length; i++) {
                System.out.print(ans[i] + " ");
            }
        }
       
        if(!add_boolen)
        return digits;
        else
        return ans;
    }
}
