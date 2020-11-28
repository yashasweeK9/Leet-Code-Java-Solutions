import java.util.Arrays;
class P581 {
        public int findUnsortedSubarray(int[] nums) {
        int len = nums.length; 
        int copy[] = nums;
         Arrays.sort(copy);
         int left = 0;
         int right = len-1;
         for( int i=0; i<copy.length; i++ ) {
             if(nums[i]!=copy[i])
             left++;
         }
        }
}