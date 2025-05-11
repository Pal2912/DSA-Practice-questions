
  public class DeleteMiddle {
      int val;
      DeleteMiddle next;
      DeleteMiddle() {}
      DeleteMiddle(int val) { this.val = val; }
      DeleteMiddle(int val, DeleteMiddle next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public DeleteMiddle deleteMiddle(DeleteMiddle head) {
      DeleteMiddle curr=head;
      int size=0;
    
      if(head==null||head.next == null){
        return null;
      }
      while(curr!=null){
        curr=curr.next;
        size++;
      }


      curr=head; 
      int middle=size/2;
  
      for(int i=0;i<middle-1;i++){
      curr=curr.next;
      }

      curr.next=curr.next.next;
      return head;

    }

}