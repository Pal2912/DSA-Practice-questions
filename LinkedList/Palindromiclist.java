public class Palindromiclist {

 public class ListNode {
   int val;
   ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; } 
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode reverse(ListNode head){
    ListNode prev=null;
    ListNode curr=head;
    while(curr!=null){
        ListNode currNext=curr.next;
        curr.next=prev;
        prev=curr;
        curr=currNext;
    }
    return prev;
    }
    public ListNode firstend(ListNode head){
    ListNode hare=head;
    ListNode turtle=head;
    while(hare.next!=null&&hare.next.next!=null){
        hare=hare.next.next;
        turtle=turtle.next;
    } 
    return turtle;
    }
    public boolean isPalindrome(ListNode head) {
       if(head==null||head.next==null){
        return true;
       }
       ListNode firsthalfend=firstend(head);
       ListNode secondStart=reverse(firsthalfend.next);
       ListNode firstStart=head;
       while(secondStart!=null){
        if(firstStart.val!=secondStart.val){
            return false;
        }
        secondStart=secondStart.next;
        firstStart=firstStart.next;
       }
return true;   

    }
}  
}
