class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int k=0;
        int ar[]=new int[]{-1,-1};
        int i=0, j=nums.length-1;
        while(i<nums.length)
        {
            int sum = nums[i] + nums[j];
            if (sum == target) 
            {
                ar[0]=i;
                ar[1]=j;
                return ar;
            }
            else if (sum < target) i++;
            else j--;
        }
        return ar;
    }
}