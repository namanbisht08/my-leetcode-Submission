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

//############################# {COME BACK AGAIN} Brute Force approach TC O(n+nlog(n)) SC 0(n) #########################

class Solution {
  
    public void helper(ArrayList<Integer> a, ListNode head)
    {
      while(head!=null)
      {
        a.add(head.val);
        head=head.next;
      }
    }
  
    public ListNode insert(int item, ListNode root)
{
    ListNode temp = new ListNode();
    ListNode ptr;
    temp.val = item;
    temp.next = null;
 
    if (root == null)
        root = temp;
    else
    {
        ptr = root;
        while (ptr.next != null)
            ptr = ptr.next;
        ptr.next = temp;
    }
    return root;
}
  
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> a = new ArrayList<>();
        helper(a, list1); helper(a, list2);
      
        Collections.sort(a);
      
        ListNode head = null;      
        for(int i=0; i<a.size(); i++)
          head = insert(a.get(i),head);
     return head;
    }
}