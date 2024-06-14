class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int newArr[]=new int[n];
        int even = 0, odd=1;
        for(int i=0; i<n; i++)
        {
            if(nums[i]>=0)
            {
                newArr[even] = nums[i];
                even+=2;
            }
            else
            {
                newArr[odd] = nums[i];
                odd+=2;
            }
        }
        return newArr;
    }
}