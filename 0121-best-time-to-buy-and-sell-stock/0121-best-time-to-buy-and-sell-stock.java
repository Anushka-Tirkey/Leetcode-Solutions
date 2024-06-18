class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int min=prices[0];
        int buy = 0, sell = 0, diff = 0, n=prices.length;
        for(int i=0; i<n; i++)
        {
            if(min>prices[i])
            {
                min=prices[i];
                buy=i;
            }
            if(diff<(prices[i]-prices[buy]))
            {
                diff = prices[i]-prices[buy];
                sell=i;
            }
        }
        if(diff>0)
            return diff;
        return 0;

        /*int l=prices.length,mini=prices[0],profit=0,maxi=0, ind1=0, ind2=0; 
        for(int i=0; i<l; i++)
        {
            if(prices[i]<mini)
            {
                mini=prices[i];
                ind1=i; 
                if(i==l-1)
                    return 0;   
                maxi=prices[i+1];
            }
        }
        for(int j=ind1+1; j<l; j++)
        {
            if(prices[j]>maxi)
                maxi=prices[j];
        }
        if(maxi>mini)
            return maxi-mini;
        else
            return 0;*/
    }
}