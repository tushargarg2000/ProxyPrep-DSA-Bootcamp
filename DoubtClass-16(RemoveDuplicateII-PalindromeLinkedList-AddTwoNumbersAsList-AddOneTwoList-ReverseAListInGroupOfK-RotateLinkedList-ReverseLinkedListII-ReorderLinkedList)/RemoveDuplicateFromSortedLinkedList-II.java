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
		ListNode temp = new ListNode(0);
		temp.next = head;
		ListNode prev = temp;
		boolean flag = false;
		while(head != null && head.next != null) {
			if(head.data == head.next.data) {
				flag = true;
				head.next = head.next.next;
			}
			else {
				if(flag) {
					prev.next = head.next;
					head = head.next;
					flag = false;
				}
				else {
					prev = head;
					head = head.next;
				}
			}
		}
		if(flag) {
			prev.next = null;
		}
		return temp.next;
	}
}