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
	ListNode removeDuplicates(ListNode head) {
		// add your logic here
		ListNode temp = head;
		if(head == null) {
			return temp;
		}
		while(head.next != null) {
			if(head.data == head.next.data) {
				head.next = head.next.next;
			}
			else {
				head = head.next;
			}
		}
		return temp;
	}
}