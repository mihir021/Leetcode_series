public class LeetGit168 {
    public static void main(String[] args) {
        Solution168 obj = new Solution168();
        System.out.println(obj.convertToTitle(704));;
    }
}

class Solution168 {

    String a[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
    public String convertToTitle(int columnNumber) {

        String ans = "";
        // 703   AAA
        do{
            if(columnNumber >= 0){

                if((columnNumber % 26) > 0)           ans += a[(columnNumber % 26) -1 ];
                else if((columnNumber % 26) == 0)     ans += "Z";

                if((columnNumber % 26) != 0)    columnNumber /= 26;
                else   columnNumber =(columnNumber/26) - 1;
            }
            else{
                break;
            }
        }while(columnNumber != 0);
        
        String final_ans = new StringBuilder(ans).reverse().toString();
        
        return final_ans;
    }
}
// s - 1  (x / 26)  
/*
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * 701  -->  ZY    701/26 = 26   701 % 26 = 25
 * 702  -->  ZZ
 * 703  -->  AAA    703 / 26 = 27  27 / 26 
 * 
 */