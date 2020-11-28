/*

Link: https://leetcode.com/problems/subarray-sum-equals-k/
Question) 560. Subarray Sum Equals K
Complexity) O(n)
Ds) HashMap
Solution Status) Accepted

*/

import java.util.Map;
import java.util.HashMap;
class P560 {
    public int subarraySum(int[] nums, int k){
        int n = 0;
        int s = 0;
        Map <Integer,Integer> preSum = new HashMap<>();
        preSum.put(0,1);
        for( int index=0; index<nums.length; index++ ) {
            s=s+nums[index];
            if(preSum.containsKey(s-k))
            n += preSum.get(s-k);
            preSum.put(s,preSum.getOrDefault(s, 0)+1);
        }
        return n;
    }
}