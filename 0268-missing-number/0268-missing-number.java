class Solution 
{
    public int missingNumber(int[] nums) 
    {
        int n = nums.length;
        int s1=(n*(n+1))/2, s2=0;
        for(int i =0; i<n; i++)        
        {
            s2+=nums[i];
        }
        return s1-s2;

        /*int n = nums.length, temp;
        for(int i = 0; i<n; i++)
        {
            for(int j=0; j<n-2; j++)
            {
                if(nums[j]<nums[j+1])
                {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for(int i = 0; i<n-1; i++)
            {
                if(nums[i]!=i)
                    return nums[i];
            }
            return nums[n-1];*/
    }
}