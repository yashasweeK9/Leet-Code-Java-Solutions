class P198 {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len==0)
            return 0;
        if(len==1)
            return nums[0];
        if(len==2)
            return Math.max(nums[0],nums[1]);
        
        int dp[] = new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        
        for( int index=2; index<len; index++ ) {
            dp[index]=Math.max(nums[index]+dp[index-2],dp[index-1]);
        }
        
        return dp[len-1];
    }
}