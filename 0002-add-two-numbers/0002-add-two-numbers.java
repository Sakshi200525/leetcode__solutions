/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
///Program 1
 class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null ){
            return l2 ;
        }else if ( l2 == null){
            return l1 ;
        }

        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy ;
        ListNode ptr1 = l1 ;
        ListNode ptr2 = l2 ;

        int carry = 0 ;

        while(ptr1!=null || ptr2!=null){
            int val1 = ptr1!=null? ptr1.val : 0;
            int val2 = ptr2!=null? ptr2.val : 0 ;
            int sum = val1 + val2 + carry ;
            int d = sum%10 ;
            carry = sum/10 ;

            ListNode temp = new ListNode(d);

            dummy.next = temp ;
            dummy = dummy.next ;

            ptr1 = ptr1!=null ? ptr1.next : null;
            ptr2 = ptr2!=null ? ptr2.next : null;
        }

        if(carry>0){
             ListNode temp = new ListNode(carry);
            dummy.next = temp ;
            dummy = dummy.next ;
        }
        return ans.next;
    }
}

///Program 2
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode dummyNode = new ListNode(-1);
//         ListNode head = dummyNode;
//         int sum;
//         int carry;
//         ListNode next;
//         while(dummyNode != null){
       

//      System.out.println(dummyNode.val);
//             // dummyNode.next = dummyNode;
//             head = head.next;
//             if (head != null) {
//                 head.next = dummyNode;
//             }
//             dummyNode = head;
//             head = next;
//         }
//         sum = l1.val + l2.val;
//         carry = sum % 10;

//         ListNode number = new ListNode(sum / 10);
        
//          if (sum == carry) {
//             sum += carry;
//             return new ListNode(carry);
//          }
//          return number;
//     }
// }

///Program 3
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode dummy = new ListNode(0);
//         ListNode current = dummy;
//         int carry = 0;

//         while (l1 != null || l2 != null || carry != 0) {
//             int sum = carry;
// //othr
//             //    if(l1!=null)   l1 = l1.next;
//             //    if(l2!=null)   l2 = l2.next

//             // if(carry != 0){

//             // }
// //othr

//             if (l1 != null) {
//                 sum += l1.val;
//                 l1 = l1.next;
//             }

//             if (l2 != null) {
//                 sum += l2.val;
//                 l2 = l2.next;
//             }

//             carry = sum / 10;
//             current.next = new ListNode(sum % 10);
//             current = current.next;
//         }

//         return dummy.next;
//     }
// }


