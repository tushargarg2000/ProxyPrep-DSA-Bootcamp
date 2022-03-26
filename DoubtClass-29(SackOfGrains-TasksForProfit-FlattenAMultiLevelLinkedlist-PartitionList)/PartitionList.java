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
	ListNode partitionList(ListNode head, int key) {
		// add your logic here
		ListNode list1 = new ListNode(-1);
		ListNode list2 = new ListNode(-1);
		ListNode list3 = new ListNode(-1);
		ListNode copy1 = list1;
		ListNode copy2 = list2;
		ListNode copy3 = list3;
		while(head != null) {
			if(head.data < key) {
				list1.next = head;
				list1 = list1.next;
			}
			else if(head.data == key) {
				list2.next = head;
				list2 = list2.next;
			}
			else {
				list3.next = head;
				list3 = list3.next;
			}
			head = head.next;
		} 
		list3.next = null;
		list1.next = copy2.next;
		list2.next = copy3.next;
		return copy1.next;
	}
}