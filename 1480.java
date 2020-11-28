class P1480 {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        if(len==0) return nums;
        
        int arr[]= new int [len];
        arr[0]=nums[0];
        for(int i=1; i<len; i++) {
            arr[i]=nums[i]+arr[i-1];
        }
        return arr;
    }    
}