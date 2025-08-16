package org.example;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest{

  @org.junit.jupiter.api.Test
  void toStringTest(){
    ListNode l_3 = new ListNode(3);
    ListNode l_2 = new ListNode(2,l_3);
    ListNode l_1 = new ListNode(1,l_2);
    assertEquals(l_1.toString(),"321");
  }

  @org.junit.jupiter.api.Test
  void equalTest(){
     ListNode l1_3 = new ListNode(3);
     ListNode l1_2 = new ListNode(2,l1_3);
     ListNode l1_1 = new ListNode(1,l1_2);

     ListNode l2_3 = new ListNode(3);
     ListNode l2_2 = new ListNode(2,l2_3);
     ListNode l2_1 = new ListNode(1,l2_2);
    
     assertEquals(l1_1,l2_1);
  }

  @org.junit.jupiter.api.Test
  void idenTest(){
    ListNode l1_3 = new ListNode(3);
    ListNode l1_2 = new ListNode(2,l1_3);
    ListNode l1_1 = new ListNode(1,l1_2);
       
      
    assertEquals(l1_1,l1_1);
  }  

}
