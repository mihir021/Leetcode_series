//package leetcode;
import java.util.Scanner;

public class LeetGit2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1534236469
        System.out.println("Enter number :");
        int number = sc.nextInt();

        // creating obj of Solution class...
        Solution2 obj = new Solution2();

        // passing value of input in the meathod...
        obj.reverse(number);

    }// End of psvm

}// End of Leet3 class

class Solution2 {

    // for revers the number...
    public int reverse(int x) {

        int sum = 0;
        String fix = String.valueOf(x);

        String last_number = fix.charAt(fix.length() - 1) + "";
        int last_int;
        // System.out.println(last_number);

        if (x > 0) {

            int temp = x;
            int count = 0;

            for (; temp > 0; temp = temp / 10, count++) {
                sum = sum * 10 + temp % 10;
            }

        } else {

            int temp = -x;
            int count = 0;

            for (; temp > 0; temp = temp / 10, count++) {
                sum = sum * 10 + temp % 10;
            }

        }

        String number_rev = String.valueOf(sum); // rev number i string

        String first_number = number_rev.charAt(0) + "";

        // System.out.println(first_number);
        // System.out.println(last_number);

        if (first_number.equals(last_number) || fix.charAt(fix.length() - 1) == '0') {
            if (x > 0)
                x = sum;
            else
                x = -sum;
        } else {
            x = 0;
        }

        System.out.println(x);

        return x;
    }// End of reverse method..

}// End of Soluton class...