class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
class P237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}