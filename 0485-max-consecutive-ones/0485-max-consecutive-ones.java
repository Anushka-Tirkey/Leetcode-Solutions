class Solution 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int n=nums.length;
        int max=0, k=0;
        for(int i=0; i<n; i++)        
        {
            if(nums[i]==1)
                k++;
            if(k>max)
                max=k;
            if(nums[i]!=1)
                k=0;
        }
        return max;
    }
}