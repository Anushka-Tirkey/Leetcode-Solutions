class Solution {
    public String restoreString(String s, int[] indices) {
        int n=s.length();
        String s1="";
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(indices[j]==i)
                    s1+=s.charAt(j);
            }
        }
        return s1;
    }
}