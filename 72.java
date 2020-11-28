class P72 {
    public int minDistance(String word1, String word2) {
            int len1 = word1.length();
            int len2 = word2.length();
            
            char word1Char[] = word1.toCharArray();
            char word2Char[] = word2.toCharArray();
            
            if( len1==0 ) {
                return len2;
            }   
            
            if( len2==0 ) {
                return len1;
            }
            
            int dp[][] = new int[2][len2];
            
            for( int i=0, row=0; row<len1 ; i = (i+1)%2 , row++ ) {
                for( int col=0; col<len2; col++ ) {
                    if( i == 0 || col == 0 ) {
                        dp[i][col]=0;
                    }
                    else {
                        
                        if( word1Char[row]==word2Char[col])
                        dp[i][col]=1+dp[i-1][col-1];
                        else
                        dp[i][col]=1+Math.min(Math.min(dp[i][col-1],dp[i-1][col]),dp[i-1][col-1]);
                    
                    }
                }
            }
            return dp[1][len2-1];
        }
}