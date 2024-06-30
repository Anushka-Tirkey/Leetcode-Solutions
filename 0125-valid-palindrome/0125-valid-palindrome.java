class Solution {
    public boolean isPalindrome(String s) {
        s=s.toUpperCase();
        String s1="";
        for(int i=0; i<s.length(); i++)
        {
            int check=(int)s.charAt(i);
            if((check>=0 && check<=9) || (check>=65 && check<=90))
                s1+=s.charAt(i);            
        }
        //int s2=s1;
        for(int i=0; i<s1.length()/2; i++)
        {
            if(s1.charAt(i)!=s1.charAt(s1.length()-1-i))
                return false;
        }
        return true;
    }
}