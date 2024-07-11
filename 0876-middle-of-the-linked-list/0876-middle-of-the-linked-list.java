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
    public ListNode middleNode(ListNode head) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ListNode temp=head;
        while(head!=null)
        {
            list1.add(head.val);
            head=head.next;
        }
        int s= list1.size();
        int i=0;
            while(i<s/2)
            {
                temp=temp.next;
                i++;
            }
            return temp;
    }
}
