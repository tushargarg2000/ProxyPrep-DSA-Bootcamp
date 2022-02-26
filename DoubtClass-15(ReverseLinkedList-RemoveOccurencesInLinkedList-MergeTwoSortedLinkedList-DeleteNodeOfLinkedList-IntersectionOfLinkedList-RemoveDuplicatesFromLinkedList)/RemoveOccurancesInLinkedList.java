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
	ListNode removeOccurences(ListNode head, int key) {
		// add your logic here
		if(head == null) {
			return head;
		}
		ListNode prev = head;
		ListNode curr = head.next;
		while(curr != null) {
			if(curr.data == key) {
				prev.next = curr.next;
				curr = curr.next;
			}
			else {
				prev = curr;
				curr = curr.next;
			}
		}
		if(head.data == key) {
			return head.next;
		}
		return head;
	}
}