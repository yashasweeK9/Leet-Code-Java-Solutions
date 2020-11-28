import java.util.List;
import java.util.ArrayList;
class P448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        for(int index=0;index<len;index++) {
            int curr = Math.abs(nums[index]);
            nums[curr-1]=-(Math.abs(nums[curr-1]));
        }
        List <Integer> list = new ArrayList<>();
        for(int index=0;index<len;index++) {
            if(nums[index]>0)
            list.add(index+1);
        }
    return list;
    }
}