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

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }

        return dummy.next;
    }
}



















 /*❌ Your current idea still has a fundamental limitation

Even after changing int → long, this will still fail for large inputs because:

long max = 9,223,372,036,854,775,807 (~19 digits)

LeetCode can give 100+ digit numbers

👉 So this approach is not reliable, even if your current test passes.

✅ But yes — we can FIX your approach (within limits)

Instead of using int or long, use:

👉 BigInteger*/


/*class Solution {
    public static ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next;
         while (curr != null) {

            // Store next
            next = curr.next;

            // Reverse current node's next pointer
            curr.next = prev;

            // Move pointers one position ahead
            prev = curr;
            curr = next;
        }

        return prev;

    }
    public static long digit(ListNode head)
    {
        ListNode temp=head;
        long num=0;
        while(temp!=null)
        {
            long rem = temp.val;
            num = (num*10)+ rem;
            temp=temp.next;
        }
 return num;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 =reverse(l1);
        long num1=digit(t1);
        ListNode t2 =reverse(l2);
        long num2=digit(t2);

  long sum=num1+num2;

        if (sum == 0) 
        return new ListNode(0);
       
      ListNode dummy = new ListNode(0);
        ListNode t = dummy;

        while (sum != 0) {
            t.next = new ListNode(sum % 10);
            t = t.next;
            sum = sum / 10;
        }

        return dummy.next;
        
    }
}*/