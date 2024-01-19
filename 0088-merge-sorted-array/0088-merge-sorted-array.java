class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int add=m+n, con=0;
        for(int i=0; i<add; i++)      
        {
            if (i<m)   
                continue;
            else
                nums1[i]= nums2[con++];
        }
        /*for (int i=0; i<add; i++)
        {
            System.out.println(nums1[i]);
        }*/
        Arrays.sort(nums1);
     }
}