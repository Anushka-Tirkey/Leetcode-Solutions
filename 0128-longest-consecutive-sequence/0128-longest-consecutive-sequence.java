class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        Arrays.sort(nums);
        int max=1, sum=1;
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return 1;
        for(int i=0; i<nums.length-1; i++)
        {
            int n1 = nums[i], n2 = nums[i+1];
            if( n2 == ( n1 + 1 ))
            {
                sum++;
                if(sum>max)
                    max=sum;
            }
            else if(n2==n1)
                continue;
            else
            {
                sum=1;
            }        
        }
        return max;
    }
}