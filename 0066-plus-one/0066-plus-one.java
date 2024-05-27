class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
	if (digits[i] < 9) {
		digits[i]++;
		return digits;
	}
	digits[i] = 0;
}

digits = new int[digits.length + 1];
digits[0] = 1;
return digits;
//        int nines=0;
        /*for(int i=0; i<digits.length; i++)
        {
            if(digits[i]==9)
                nines++;
            
        }
        if(nines==digits.length)
        {
            arr=new int [nums.length+1];
            for(int j = 0; j<digits.length+1; j++)
            {
                if(j==0)
                    arr[0]==1;
                else
                    arr[j] = 0;
            }
        }
        return arr;*/
    }
}