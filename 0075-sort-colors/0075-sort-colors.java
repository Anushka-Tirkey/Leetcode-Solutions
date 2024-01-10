class Solution 
{
    public void sortColors(int[] nums) 
    {
        int count0=0, count1=0, count2=0, n=nums.length;
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            if(nums[i]==0)
                count0++;
            else if(nums[i]==1)
                count1++;
            else
                count2++;
        }
        for(int i=0; i<n; i++)
        {
            if(i>=0 && i<count0)
                arr[i]=0;
            else if(i>=count0 && i<(count0+count1))
                arr[i]=1;
            else //if(i>=(count1+count0))
                arr[i]=2;
        }
        for(int i=0; i<n; i++)
        {
            nums[i]=arr[i];
            System.out.println(nums[i]);
        }
    }
}