package org.example;

class Solution{
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    return sum (0,l1,l2);  
  }

  private ListNode sum(int razr, ListNode l1, ListNode l2) {
    int razr1 = 0;
    int tval = 0;
    tval = l1.val + l2.val + razr; 
    if (tval > 9) { 
      razr1 = 1;
      l1.val = tval - 10;
    } else { 
      l1.val = tval;
    }

    if (l1.next==null) { 
      if (l2.next==null) {
        if (razr1==1) {
          l1.next = new ListNode(1); 
        }  
        return l1;     
      } else {
        // l2.next != null
        l2.val = l1.val;
        l2.next = sum1(razr1, l2.next);
        return l2;
      }      
    } else {
      if (l2.next == null) {
        l1.next = sum1(razr1, l1.next);
        return l1;
      } else {
        l1.next = sum(razr1,l1.next,l2.next);
        return l1;
      }
    }
  }

  private ListNode sum1(int razr, ListNode l) {
    int razr1 = 0;
    int tval = l.val + razr;
    if (tval > 9) {
      l.val = tval - 10;
    } else {
      l.val = tval;
    }
    if (l.next==null){
      if (razr == 1) {
        l.next = new ListNode(1);
      }
    } else {
      l.next = sum1(razr1, l.next);
    }
    return l;
  }  
}
