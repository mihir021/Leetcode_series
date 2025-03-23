public class LeetGit202 {
    public static void main(String[] args) {
        Solution202 obj = new Solution202();
        System.out.println(obj.isHappy(19));
    }
}

class Solution202 {
    public boolean isHappy(int n) {
        boolean ans = false;
            do {
                n = sum(n);
            } while (n >= 3);
    
            if (n == 1)   ans = true;

            return ans;
    }

    int sum(int n) {

        int sum_of_number = 0;

        do {
            sum_of_number += Math.pow(n % 10, 2);
            n = n / 10;
        } while (n != 0);

        return sum_of_number;
    }
}
/*
 * 
 * Input: n = 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 * 
 */