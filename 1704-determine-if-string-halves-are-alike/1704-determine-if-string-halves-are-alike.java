class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int n=s.length(), c1=0, c2=0;
        String s1=s.substring(0,n/2);
        String s2=s.substring(n/2, n);
        for(int i=0; i<n/2; i++)
        {
            if(s1.charAt(i)== 'a' || s1.charAt(i)== 'e' || s1.charAt(i)== 'i' || s1.charAt(i)== 'o' || s1.charAt(i)=='u')
                c1++;
            if(s2.charAt(i)== 'a' || s2.charAt(i)== 'e' || s2.charAt(i)== 'i' || s2.charAt(i)== 'o' || s2.charAt(i)=='u')
                c2++;
        }
        if(c1!=c2)
            return false;
        else
            return true;
    }
}