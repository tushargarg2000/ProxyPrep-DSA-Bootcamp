// class ListNode {
// 	int data;
// 	ListNode next;

// 	ListNode (int data) {
// 		this.data = data;
// 	}
// }

class Solution {
	ListNode reverseLinkedList (ListNode head) {
		// add your logic here
		if(head == null || head.next == null) {
			return head;
		}
		ListNode temp = reverseLinkedList(head.next);
		head.next.next = head;
		head.next = null;
		return temp;
	}
}