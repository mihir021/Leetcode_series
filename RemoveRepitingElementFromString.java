class l5 {

    static String ans = "";

    public static void main(String[] args) {
        m5("aabbcc",0);
        //System.out.println(ans);  
    }
    static void m5(String s,int i){
        if(i >= s.length()) {
            System.out.println(s);
            return;
        }
        for(int j=i+1;j<s.length();j++){
            if(s.charAt(i) == s.charAt(j) ){
               s = s.substring(0, j) + s.substring(j+1);
               break;
            }
        }
        m5(s, i+1);

    }
    
}
