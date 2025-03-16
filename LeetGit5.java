import java.util.Scanner;

public class LeetGit5 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Solution5 obj = new Solution5();

        System.out.print("Enter number :");
        int x = Sc.nextInt();
        System.out.println(obj.isPalindrome(x));
    }// End of psvm...
}// End of Leet5 class...

class Solution5 {
    public boolean isPalindrome(int x) {

        boolean ans = false;
        String number = String.valueOf(x);
        String rev_number = "";

        for(int i = 0 ;i<number.length();i++){
            rev_number = rev_number + number.charAt(number.length()-(i+1));
            //System.out.println(rev_number);
        }

        if(rev_number.equals(number)){
            ans = true;
        }


        return ans;

    }
}