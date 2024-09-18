class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-1; j++)
            {
                if( nums[j]>nums[j+1])
                {
                    int temp=nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        int prod1 = nums[0]*nums[1]*nums[n-1];
        int prod2 = nums[n-1]*nums[n-2]*nums[n-3];
        
        return (prod1>prod2 ? prod1: prod2);
    }
}