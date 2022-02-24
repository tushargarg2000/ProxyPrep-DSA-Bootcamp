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
	List<Integer> linkedListToArray (ListNode head) {
	    // add your logic here
		List<Integer> ans = new ArrayList<>();
		while(head != null) {
			ans.add(head.data);
			head = head.next;
		}
		return ans;
	}
}