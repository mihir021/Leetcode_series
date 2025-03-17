public class LeetGit150 {
    public static void main(String[] args) {
        Solution150 obj = new Solution150();

        String a[] = { "2","1","+","3","*"};
        System.out.println(obj.evalRPN(a));
    }

}
class Solution150 {
    public int evalRPN(String[] tokens) {

        int n = tokens.length;
        int index = 0;
        
        for (int i = 0; i < n; i++) {
            String token = tokens[i];

            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                // Perform the operation
                int b = Integer.parseInt(tokens[index - 1]);
                int a = Integer.parseInt(tokens[index - 2]);

                int result = 0;

                if (token.equals("+"))
                 result = a + b;
                if (token.equals("-"))
                 result = a - b;
                if (token.equals("*"))
                 result = a * b;
                if (token.equals("/"))
                 result = a / b; 

                // Store the result in place of first operand
                tokens[index - 2] = String.valueOf(result);
                
                // Move index back since we replaced two elements with one
                index--;

            } else {
                tokens[index] = token;
                index++;
            }
        }

        return Integer.parseInt(tokens[0]); // The final result will be at index 0
    }
}
