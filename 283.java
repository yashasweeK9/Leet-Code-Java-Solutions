class P283 {
    public void moveZeroes(int[] nums) {
        // 2 Ptr. Approach
        for( int left=0, right=0; right<nums.length; right++) {
            if(nums[right]!=0) {
                int temp    = nums[left];
                nums[left]  = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }    
}