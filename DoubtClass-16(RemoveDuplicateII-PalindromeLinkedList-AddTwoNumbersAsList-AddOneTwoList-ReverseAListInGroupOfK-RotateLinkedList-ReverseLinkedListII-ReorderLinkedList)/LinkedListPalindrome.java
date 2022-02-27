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
	
	boolean isPalindrome(ListNode list) {
	    // add your logic here
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
		while(prev != null) {
			if(prev.data != list.data) {
				return false;
			}
			prev = prev.next;
			list = list.next;
		}
		return true;
	}
}