import java.util.Arrays;
class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1)
        return stones[0];

        int i = stones.length-1;
        int j = stones.length-2;
        
        while(true) {
            Arrays.sort(stones);
            if(i==0)
            if(stones[i]==stones[j]) {
                i-=2;
                j-=2;
            }
            else {
                stones[j]=stones[i]-stones[j];
                i--;
                j--;
            }

        }
    }
}