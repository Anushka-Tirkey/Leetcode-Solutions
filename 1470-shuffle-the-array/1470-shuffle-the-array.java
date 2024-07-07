class Solution {
    public int[] shuffle(int[] nums, int n) {
        int j=0;
        int n1[]=new int[2*n];
        for(int i=0; i<n ;i++)
        {
            n1[j++] = nums[i];
            n1[j++] = nums[n+i];
        }
        return n1;
    }
}