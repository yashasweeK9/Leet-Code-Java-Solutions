class LC14A{
    public String longestCommonPrefix(String[] strs) {
        int arrLen = strs.length;
        if(arrLen==0)
            return "";
        String ans = strs[0];
        int j=0;
        while(j<ans.length()) {
            for(int i=0;i<arrLen;i++) {
                String pick = strs[i]; 
                int pickLen = pick.length(); 
                if(j>=pickLen)
                    return ans.substring(0,j);
                char ch1 = pick.charAt(j);
                char ch2 = ans.charAt(j);
                if(ch1!=ch2)
                    return ans.substring(0,j);
            }
            j++;
        }
        return ans;
        }
    }