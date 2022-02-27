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
	
	ListNode addTwoNumbers(ListNode firstList, ListNode secondList) {
		// add your logic here
		ListNode ans = new ListNode(0);
		ListNode copy = ans;
		int carry = 0;
		while(firstList != null & secondList != null) {
			int sum = firstList.data + secondList.data + carry;
			carry = sum/10;
			sum = sum%10;
			firstList = firstList.next;
			secondList = secondList.next;
			ListNode temp = new ListNode(sum);
			ans.next = temp;
			ans = ans.next;
		}
		while(firstList != null) {
			int sum = firstList.data + carry;
			carry = sum/10;
			sum = sum%10;
			firstList = firstList.next;
			ListNode temp = new ListNode(sum);
			ans.next = temp;
			ans = ans.next;
		}
		while(secondList != null) {
			int sum = secondList.data + carry;
			carry = sum/10;
			sum = sum%10;
			secondList = secondList.next;
			ListNode temp = new ListNode(sum);
			ans.next = temp;
			ans = ans.next;
		}
		if(carry > 0) {
			ListNode temp = new ListNode(carry);
			ans.next = temp;
		}
		return copy.next;
	}
}