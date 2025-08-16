package org.example;

public class ListNode {
  int val;
  ListNode next;
  
  ListNode() {}
  
  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
// -----------------------------------------------

  @Override
  public String toString() {
    if (next==null) {
      return ""+val;
    } else {
      return next.toString()+val;
    }
  } 
  
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj == null || !(obj instanceof ListNode)) {
      return false;
    }

    ListNode other = (ListNode) obj;
    
    return this.toString().equals(other.toString());
  }

  @Override
  public int hashCode() {
    return this.toString().hashCode();
  }

}
