import java.util.Scanner;

public class ListNode {
  int val;
  ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; } 
    }
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      
      StringBuilder value=new StringBuilder();
      StringBuilder value2=new StringBuilder();
      
      while(l1!=null){
        int x=l1.val;
        value.append(Integer.toString(x));
        l1=l1.next;
      }
      while(l2!=null){
        int x1=l2.val;
        value2.append(Integer.toString(x1));
        l2=l2.next;
      }

      String reversedValue1= value.reverse().toString();
      String reversedValue2= value2.reverse().toString();
      Long answer=(Long.valueOf(reversedValue1)+Long.valueOf(reversedValue2));
     
      ListNode result=null;
      ListNode current=null;
      if(answer==0){
        return new ListNode(0);
      }
      while(answer!=0){
        int digit=(int)(answer%10);
        answer/=10;
        System.out.print(digit+" ");
        ListNode temp=new ListNode(digit);
        if(result==null){
            result=temp;
            current=temp;
        }else{
            current.next=temp;
            current=current.next;
        }
      }
    //   System.out.print(result);
    return result;
    }
}