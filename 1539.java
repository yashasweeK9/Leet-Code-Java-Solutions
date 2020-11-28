/*

Link: https://leetcode.com/problems/kth-missing-positive-number/
Question) 1539. Kth Missing Positive Number
Complexity) O(n)
Ds) Arrays
Solution Status) Accepted

*/
class P1539 {
    public int findKthPositive(int[] arr, int k) {
        int n=1;
        int i=0;
        for(int index=0;index<arr.length;n++)
        {
            if(arr[index]!=n)
                i++;
            else
                index++;
            if(i==k)
                return n;
        }
        while(true)
        {
            i++;
            if(i==k)
                return n;
            n++;
        }
    }
}