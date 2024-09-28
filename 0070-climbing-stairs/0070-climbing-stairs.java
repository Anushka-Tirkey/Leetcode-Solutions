class Solution {
    public int climbStairs(int n) {
        int a=0,b=1,c=0;
        //no. of steps
        //0,1,2,3,5,8 -> ways
        //0,1,2,3,4,5 -> n
        for(int i=0; i<n; i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}