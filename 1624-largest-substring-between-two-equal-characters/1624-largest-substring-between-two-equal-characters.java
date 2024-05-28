class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] last = new int[26];
    int ans = -1;
    for(int i = 0; i < s.length(); ++i) last[s.charAt(i) - 'a'] = i;
    for(int i = 0; i < s.length(); ++i) ans = Math.max(ans, last[s.charAt(i) - 'a'] - i - 1);
    return ans;

        /*int n = s.length();
        int i=0;
        while(i<n)  // 0<n?
        {
            int j=n-1;
            while(j>i)
            {
                if(j==i+1)
                    return 0;
                else if(i<j && s.charAt(i)==s.charAt(j))
                {
                    return j-i;
                } 
                j--;
            }
            i++;
        }
        return -1;*/
    }
}