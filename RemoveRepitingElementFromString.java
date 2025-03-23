class l5 {
    
    static String ans = "";
    public static void main(String[] args) {
        m5("abcabcabcabccccbbbbiooou",0);
        //System.out.println(ans);  
    }
    static void m5(String s,int i){
        if(i > s.length()) {
            System.out.println(s);
            return;
        }
        for(int j=i+1;j<s.length();j++){
            if(s.charAt(i) == s.charAt(j) ){

                // to hold the removed ch...
                String add = s.charAt(j) + "";

                // remove all same ch from string... (replaced " " caz of String index out of bound error)
                s = s.replace(s.charAt(j)+"", " ");

                // add ch in to strin in 1st occrance place from ith index...
                s = s.substring(0 , i) + add + s.substring(i);

                // after complition of task remove extra space from string...
                s = s.replace(" ", ""); 
            }
        }
        m5(s, i+1);
    }
    
}