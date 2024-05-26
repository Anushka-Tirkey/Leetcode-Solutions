class Solution {
    public int removeElement(int[] nums, int val) 
    {
        int l= nums.length, a=0;
        int arr2[]=new int[l];
        for(int i=0; i<l; i++)
        {
            if (nums[i]==val)
                continue;
            else
                arr2[a++] = nums[i];
        }
        for(int j =0; j<l; j++)
        {
            if(j<a)
                nums[j] = arr2[j];
            else
                nums[j] = 0;
        }
        return a;
    }
}