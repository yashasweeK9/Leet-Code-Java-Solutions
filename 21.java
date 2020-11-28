class P21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       return mergeList(l1,l2,null);     
    }
    public ListNode mergeList( ListNode l1, ListNode l2, ListNode sorted ) {
        if(l1==null)
        return l2;
       if(l2==null)
        return l1;
        if(l1.val<l2.val) {
            sorted.next = l1;
            mergeList(l1.next, l2, sorted);
        }
        else {
            sorted.next = l2;
            mergeList(l1, l2.next, sorted);
        }
        return sorted;
    }   
}