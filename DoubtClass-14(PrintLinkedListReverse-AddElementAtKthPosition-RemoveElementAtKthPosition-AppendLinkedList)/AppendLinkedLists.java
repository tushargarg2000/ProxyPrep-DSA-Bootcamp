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
	ListNode appendLists (ListNode list1, ListNode list2) {
	    // add your logic here
		ListNode copy = list1;
		while(copy.next != null) {
			copy = copy.next;
		}
		copy.next = list2;
		return list1;
	}
}