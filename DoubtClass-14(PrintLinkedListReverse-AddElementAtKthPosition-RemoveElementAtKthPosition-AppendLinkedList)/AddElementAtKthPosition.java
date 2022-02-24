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
	ListNode addAtkthElement (ListNode head, int k, ListNode newElement) {
	    // add your logic here
		if(k == 1) {
			newElement.next = head;
			return newElement;
		}
		ListNode copy = head;
		while(k-- > 2) {
			copy = copy.next;
		}
		newElement.next = copy.next;
		copy.next = newElement;
		return head;
	}
}