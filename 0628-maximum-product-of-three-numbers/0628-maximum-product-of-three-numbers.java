class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        // for(int i=0; i<n; i++)
        // {
        //     for(int j=0; j<n-1; j++)
        //     {
        //         if( nums[j]>nums[j+1])
        //         {
        //             int temp=nums[j];
        //             nums[j] = nums[j+1];
        //             nums[j+1] = temp;
        //         }
        //     }
        // }
        // int prod1 = nums[0]*nums[1]*nums[n-1];
        // int prod2 = nums[n-1]*nums[n-2]*nums[n-3];
        
        //Optimised solution
        int maxi= -1000,secMax= -1000, thiMax = -1000;
        int mini= 1000, secMin = 1000;
        for(int i=0; i<n; i++)
        {
            if(nums[i]>maxi)
            {
                thiMax=secMax;
                secMax = maxi;
                maxi=nums[i];
            }
            else if(nums[i]>secMax){
                thiMax = secMax;
                secMax = nums[i];
            }
            else if(nums[i]>thiMax)
            {
                thiMax = nums[i];
            }
            
            if(nums[i]<mini)    //-2<-1(T); -3<-2(T)
            {
                secMin=mini;    //-1, -2
                mini=nums[i];   //-2, -3
            }
            else if(nums[i]<secMin){
                secMin = nums[i];
            }
        }
        int prod1 = mini*secMin*maxi;
        int prod2 = maxi*secMax*thiMax;
        return (prod1>prod2 ? prod1: prod2);
        //there may be cases where secMax and thiMax need to be updated independently, even if the current number is not the new maximum.
    }
}