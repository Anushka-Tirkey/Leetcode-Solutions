class Solution 
{
    public void rotate(int[] nums, int k) 
    {
        int n = nums.length;
        int arr[] = new int[k];
        int b = k - 1;
        for(int i = 1; i<=k; i++)
        {
            arr[b--] = nums[n-i];
        }
        for(int i = n-1; i > k-1; i--)
        {
            nums[i] = nums[i-k];
        }
        for(int i = 0; i<k; i++)
        {
            nums[i] = arr[i];
        }
    }
}