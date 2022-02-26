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
	ListNode mergeTwoSortedList (ListNode firstList, ListNode secondList) {
	    // add your logic here
		ListNode temp = new ListNode(0);
		ListNode head = temp;
		while(firstList != null && secondList != null) {
			if(firstList.data < secondList.data) {
				temp.next = firstList;
				firstList = firstList.next;
			}
			else {
				temp.next = secondList;
				secondList = secondList.next;
			}
			temp = temp.next;
		}
		if(firstList != null) {
			temp.next = firstList;
		}
		if(secondList != null) {
			temp.next = secondList;
		}
		return head.next;
	}
}