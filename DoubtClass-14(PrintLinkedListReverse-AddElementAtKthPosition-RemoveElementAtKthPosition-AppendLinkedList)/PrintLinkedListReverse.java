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
	void printLinkedListReverse (ListNode head) {
	    // add your logic here
		if(head != null) {
			printLinkedListReverse(head.next);
			System.out.print(head.data + " ");
		}
	}
}