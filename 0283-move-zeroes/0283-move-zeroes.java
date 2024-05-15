class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int k = 0; 
        for(int i = 0; i<nums.length; i++)    
        {
            if(nums[i]==0)
                k++;
        }
        int a = 0;
        for(int j = 0; j<nums.length; j++)
        {
            if(nums[j]!=0)
                nums[a++] = nums[j];
        }
        for(int m = a; m <nums.length; m++)
        {
            nums[m] = 0;
        }
    }
}