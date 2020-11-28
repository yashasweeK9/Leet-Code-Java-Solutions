class P338 {
    public int[] countBits(int num) {
       int arr[] = new int [num+1];
       for( int index=0;index<arr.length;index++) {
           int save = index;
           int count = 0;
           while(save>0) {
            count += (save&1);
            save = save>>1;
           }
           arr[index]=count;
       }
       return arr; 
    }
}