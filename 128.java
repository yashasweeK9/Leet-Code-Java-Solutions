import java.util.TreeSet;
import java.util.SortedSet;
class P128 {
    public int longestConsecutive(int[] nums) {
        SortedSet <Integer> set = new TreeSet<Integer>();
        for( int index=0;index<nums.length;index++ ) {
            set.add(nums[index]);
        }
        int globalCount = 0;
        int count = 0;
        for( int index=0; index<nums.length; index++ ) {
            int n = nums[index];
            boolean check = false;
            for(count=0;set.contains(n+1);count++) {
                if( check==false && set.contains(n-1) )
                break;
                check = true;
                n = n + 1;
            }
        if(count>globalCount)
        globalCount = count;
    }
    return globalCount;    
}
}