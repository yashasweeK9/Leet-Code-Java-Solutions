/*

Link: https://leetcode.com/problems/path-sum-iii/
Question) 437. Path Sum III
Complexity) O(n)
Ds) HashMap
Solution Status) 

*/
import java.util.Map;
import java.util.HashMap;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

  class P437 {
    int n = 0;
    public int pathSum(TreeNode root, int sum) {
        if (root==null)
        return 0;

        Map <Integer,Integer> preSum = new HashMap<>();
        preSum.put(0,1);
        
        findPathSum(root,0,sum,preSum);
        
        return n;
    }

    public void findPathSum( TreeNode curr, int sum, int target, Map <Integer,Integer> preSum ) {
        if(curr==null)
        return;

        sum+=curr.val;

        if(preSum.containsKey(sum-target))
        n += preSum.get(sum-target);
        
        preSum.put(sum, preSum.getOrDefault(sum, 0)+1);
        
        findPathSum(curr.left, sum, target, preSum);
        findPathSum(curr.right, sum, target, preSum);
        
        preSum.put(sum,preSum.get(sum)-1);
        
        return;
    }
}