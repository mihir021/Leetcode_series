import java.util.Scanner;
public class Leet6Git {

    public static void main(String[] args) {

        Solution obj = new Solution();
        obj.intToRoman(58);
       
    }// End of psvm...

}// End of LEet6 class...
class Solution {

    // i 1 
    // v 5
    // x 10 
    // l 50
    // c 100 
    // D 500
    // M 1000

    static String ans = "";
    int value[] = { 1000, 500, 100, 50, 10, 5, 1 };
    String name[] = { "M", "D", "C", "L", "X", "V", "I" };

    public String intToRoman(int num) {

        ans = "";
        Scanner Sc = new Scanner(System.in);
        // System.out.println("Enter number :");
        // num = Sc.nextInt();
        
        do {
            int temp_number = num;
            int c = 0;
            int passing_int = 0;
            int last_digit = 0;

            for (; temp_number > 0; c++) {

                last_digit = temp_number % 10;
                temp_number /= 10;
            }

            int div = (int) Math.pow(10, c - 1);

            passing_int = div * last_digit;

            //System.out.println(passing_int);
            cla(passing_int);

            // System.out.println(div);
            num = num % div;

        } while (num > 0);
        System.out.println(ans);
        return ans;

    }// End of method...

    void cla(int num) {

        boolean found = false;
        boolean direct = false;

        for(int i =0 ;i < value.length;i++){
            if(num == value[i]){
                ans += name[i];
                direct = true;
                break;
            }
        }
        if(!direct){

            for (int i = 0; i < value.length; i++) {
                for (int j = 0; j < value.length; j++) {
                    if (num == value[j] - value[i]) {
                        found = true;
                        ans += name[i] + name[j];
                        break;
                    }
                }
            }
            if (!(found)) {
    
                boolean ans_i = false;
                boolean ans_v = false;
                boolean ans_x = false;
                boolean ans_l = false;
                boolean ans_c = false;
                boolean ans_d = false;
                boolean ans_m = false;
    
                do {
                    if (num - 1000 >= 0) {
                        num = num - 1000;
                        ans += "M";
                    } else {
                        ans_m = true;
                    }
                } while (!(num == 0) && !(ans_m));
    
                do {
                    if (num - 500 >= 0) {
                        num = num - 500;
                        ans += "D";
                    } else {
                        ans_d = true;
                    }
                } while (!(num == 0) && !(ans_d));
    
                do {
                    if (num - 100 >= 0) {
                        num = num - 100;
                        ans += "C";
                    } else {
                        ans_c = true;
                    }
                } while (!(num == 0) && !(ans_c));
    
                do {
                    if (num - 50 >= 0) {
                        num = num - 50;
                        ans += "L";
                    } else {
                        ans_l = true;
                    }
                } while (!(num == 0) && !(ans_l));
    
                do {
                    if (num - 10 >= 0) {
                        num = num - 10;
                        ans += "X";
                    } else {
                        ans_x = true;
                    }
                } while (!(num == 0) && !(ans_x));
    
                do {
                    if (num - 5 >= 0) {
                        num = num - 5;
                        ans += "V";
                    } else {
                        ans_v = true;
                    }
                } while (!(num == 0) && !(ans_v));
    
                do {
                    if (num - 1 >= 0) {
                        num = num - 1;
                        ans += "I";
                    } else {
                        ans_i = true;
                    }
                } while (!(num == 0) && !(ans_i));
            }

        }// End of direct if...
        

    }// End of cal method...

}// End of solution class