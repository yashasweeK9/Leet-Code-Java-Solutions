import java.util.HashMap;
class P217 {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer,Integer> o = new HashMap<>();
        for( int i=0;i<nums.length;i++) {
            if(o.get(i)>1)
            return false;
            o.put(i,o.getOrDefault(i,0)+1);
        }
        return true;
    }    
}