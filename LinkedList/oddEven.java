public ListNode oddEvenList(ListNode head){
  if(head == null || head.next == null) return head;
  ListNode odd = head, evenHead = head.next;
  ListNode even = evenHead;
  while(even!=null && even.next !=null){
    odd.next = even.next;
    odd = odd.next;
    even.next = odd.next;
    even = even.next;
  }
  odd.next = evenHead;
  return head;
}
