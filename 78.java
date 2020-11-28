import java.util.*;
class P78 {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> ans = new ArrayList<List<Integer>>();
       List<Integer> curr = new LinkedList<Integer>(); 
       forSets(nums,ans,curr,0);
       return ans;
    }
    
    public void forSets( int arr[], List<List<Integer>> ans, List<Integer> curr, int index ) {
        if( index == arr.length ) {
            ans.add(curr);
            return;
        }
        curr.add(arr[index]);
        forSets(arr, ans, curr, index+1);
        curr.remove(curr.size()-1);
        forSets(arr, ans, curr, index+1);
    }
}