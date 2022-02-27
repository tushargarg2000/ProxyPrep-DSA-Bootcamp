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
	ListNode reverseLinkedList (ListNode head) {
		ListNode previous = null;
		ListNode current = head;
		ListNode next;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
	
	ListNode addOneToList(ListNode head) {
		head = reverseLinkedList(head);
		ListNode currNode = head;
		ListNode prev = null;
		int carry = 1;
		while (currNode != null) {
			currNode.data = currNode.data + carry;
			carry = (currNode.data) / 10;
			currNode.data = (currNode.data) % 10;
			prev = currNode;
			currNode = currNode.next;
		}
		if (carry != 0) {
			ListNode newNode = new ListNode(carry);
			prev.next = newNode;
		}

		return reverseLinkedList(head);
	}
}