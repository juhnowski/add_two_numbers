package org.example;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  /*
  l1=[2,4,3]
  l2=[5,6,4]
  expRes = [7,0,8]
  */
  @org.junit.jupiter.api.Test
  void positiveTest1(){
    ListNode l1_3 = new ListNode(3);
    ListNode l1_2 = new ListNode(4,l1_3);
    ListNode l1   = new ListNode(2,l1_2);

    ListNode l2_3 = new ListNode(4);
    ListNode l2_2 = new ListNode(6,l2_3);
    ListNode l2   = new ListNode(5,l2_2);

    ListNode l3_3 = new ListNode(8);
    ListNode l3_2 = new ListNode(0,l3_3);
    ListNode l3   = new ListNode(7,l3_2);

    Solution s = new Solution();
    ListNode rl = s.addTwoNumbers(l1,l2);
    assertEquals(rl,l3);
  }
}
