class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even=0, odd=1;
        int newArr[]=new int[nums.length];
        for(int i=0; i<nums.length; i++)   
        {
            if(nums[i]%2==0)
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