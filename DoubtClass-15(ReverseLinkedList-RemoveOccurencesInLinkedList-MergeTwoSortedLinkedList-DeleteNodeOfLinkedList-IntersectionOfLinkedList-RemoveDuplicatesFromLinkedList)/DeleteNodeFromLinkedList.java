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
	void deleteNode(ListNode node) {
	    // add your logic here
		int temp = node.data;
		node.data = node.next.data;
		node.next.data = temp;
		node.next = node.next.next;
	}
}