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
	ListNode reorderList(ListNode head) {
		// add your logic here
		if(head == null) {
			return head;
		}
		ListNode list = head;
		ListNode slow = list;
		ListNode fast = list.next;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode curr = slow.next;
		ListNode prev = null;
		while(curr != null) {
			ListNode temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		ListNode copy = list;
		ListNode prevCopy = null;
		while(copy.next != null) {
			prevCopy = copy;
			copy = copy.next;
		}
		if(prevCopy != null) {
			prevCopy.next = null;
		}
		while(prev != null) {
			ListNode temp2 = list.next;
			ListNode temp3 = prev.next;
			list.next = prev;
			prev.next = temp2;
			prev = temp3;
			list = temp2;
		}
		return head;
	}
}