class P70 {
    public int climbStairs(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        int dp[] = new int[n+1];
        dp[0]=1;
        dp[1]=2;
        for(int i=2;i<dp.length;i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];

    }
}