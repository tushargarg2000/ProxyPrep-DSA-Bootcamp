/** This is the ListNode class definition

class ListNode {
	int data;
	ListNode next;
    ListNode random;

	ListNode (int data) {
        this.data = data;
        this.next = null;
        this.random = null;
    }
}
**/
class Solution {
	ListNode cloneTheLinkedList(ListNode head) {
		ListNode copy = null;
		ListNode a = head;
		ListNode b = null;
		HashMap<ListNode, ListNode> hashMap = new HashMap<ListNode, ListNode>();
		while(a != null) {
			ListNode temp = new ListNode(a.data);
			if(b == null) {
				copy = b = temp;
			}
			else {
				b.next = temp;
				b = b.next;
			}
			hashMap.put(a, temp);
			a = a.next;
		}
		a = head;
		b = copy;
		while(b != null) {
			b.random = hashMap.get(a.random);
			a = a.next;
			b = b.next;
		}
		return copy;
	}
}