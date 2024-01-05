class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int l=nums.length;
        int min=0;
        for(int i=0; i<l; i++)
        {
            if(nums[i]<min)
                min=nums[i];
        }
        int sum=0, max=min;
        for(int i=0; i<l; i++)        
        {
            sum+=nums[i];
            if(sum>max)
                max=sum;
            if(sum<0)
                sum=0;
        }
        return max;
    }
}