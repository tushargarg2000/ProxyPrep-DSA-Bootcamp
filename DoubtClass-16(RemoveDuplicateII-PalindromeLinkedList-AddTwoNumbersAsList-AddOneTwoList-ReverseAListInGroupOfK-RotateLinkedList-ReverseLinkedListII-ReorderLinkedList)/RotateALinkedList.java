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
	ListNode rotateListByK(ListNode head, int k) {
		// add your logic here
		int len = getLength(head);
		if(len == 0) {
			return head;
		}
		k = k%len;
		if(k == 0) {
			return head;
		}
		k = len-k;
		ListNode temp = head;
		ListNode temp2 = null;
		while(k-- > 0) {
			temp2 = temp;
			temp = temp.next;
		}
		ListNode copy = temp;
		ListNode prev = null;
		while(copy != null) {
			prev = copy;
			copy = copy.next;
		}
		temp2.next = null;
		prev.next = head;
		return temp;
	}
	private int getLength(ListNode head) {
		int len = 0;
		while(head != null) {
			len++;
			head = head.next;
		}
		return len;
	}
}