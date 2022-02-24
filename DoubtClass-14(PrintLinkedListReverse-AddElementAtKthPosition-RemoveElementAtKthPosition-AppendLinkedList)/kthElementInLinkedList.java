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
	ListNode kthElement (ListNode head, int k) {
	    // add your logic here
		if(k == 1 || head == null) {
			return head;
		}
		return kthElement(head.next,k-1);
	}
}