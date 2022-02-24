/** This is the ListNode class definition

class ListNode {
	int data;
	ListNode next;

	ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}
**/

class Solution {
	ListNode removekthElement (ListNode head, int k) {
	    // add your logic here
		if(k == 1) {
			return head.next;
		}
		ListNode copy = head;
		while(k > 2) {
			copy = copy.next;
			k--;
		}
		copy.next = copy.next.next;
		return head;
	}
}