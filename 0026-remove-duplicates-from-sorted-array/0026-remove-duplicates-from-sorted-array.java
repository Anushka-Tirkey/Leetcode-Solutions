class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int uniqueIndex = 0; // This is the index where we place the next unique element
        
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[j];
            }
        }
        
        return uniqueIndex + 1;
    }
}
