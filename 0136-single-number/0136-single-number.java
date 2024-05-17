class Solution 
{
    public int singleNumber(int[] nums) 
    {
        int n = nums.length;
        for(int i=0; i<n; i++)
        {
            int k=0;
            for(int j = 0; j<n; j++)
            {
                if (nums[i] == nums[j])
                    k=k+1;
            }
            if(k==1)
                return(nums[i]);
        }
        return nums[nums.length];
    }
}