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
		ListNode prev = null;
		ListNode curr = head;
		while(curr != null) {
			ListNode temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}
}