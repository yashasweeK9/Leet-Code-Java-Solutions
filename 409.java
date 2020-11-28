class P409 {
    public int longestPalindrome(String s) {
        int len = s.length();  
        if(len<1)
            return 0;
        
        int lit[] = new int [26];
        int cap[] = new int [26];
        char arr[] = s.toCharArray();
        for( int index=0; index<len; index++ ) {
            if(arr[index]-97 < 0)
                cap[index-65]++;
            else
                arr[index-97]++;
        }
        boolean fisrtOdd=false;
        int ans = 0;
        for( int index=0; index<26; index++ ) {
            if((lit[index]&1)==0)
                ans+=lit[index];
            else {
                if(!fisrtOdd)
                    ans+=lit[index];
                else
                    ans+=(lit[index]-1);
            }            
        }
        
        for( int index=0; index<26; index++ ) {
            if((cap[index]&1)==0)
                ans+=cap[index];
            else {
                if(!fisrtOdd)
                    ans+=cap[index];
                else
                    ans+=(cap[index]-1);
            }
        }
    return ans;
    }
}