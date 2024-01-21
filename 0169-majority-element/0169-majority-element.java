//import java.util.*;
class Solution {
    public int majorityElement(int[] nums) 
    {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            //selected element is v[i]
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                // counting the frequency of v[i]
                if (nums[j] == nums[i]) {
                    cnt++;
                }
            }

            // check if frquency is greater than n/2:
            if (cnt > (n / 2))
                return nums[i];
        }

        return -1;
        /*int n=nums.length; //thres=n/2;
        int max=0;
        int arr1[]=new int[n];
        for(int i=0; i<n; i++)
        {
            int k=0;
            //if(nums[i]=nums[i-1])
                //continue;
            for(int j=0; j<n; j++)
            {
                if(nums[j]==nums[i])
                {
                    k++;
                }
            }
            if(k>max/2)
                    max=nums[i];
        }
        return max;*/
    }
}