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
	ListNode reverse(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		while(curr != null) {
			ListNode temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}
	ListNode reverseLinkedListRange(ListNode head, int left, int right) {
		ListNode currentNode = head;
		ListNode startNode = null;
		ListNode lastNode = null;
		int i = 1;
		while (currentNode != null) {
			if (i > right) {
				break;
			}
			if (i < left) {
				startNode = currentNode;
			}
			if (i == right) {
				lastNode = currentNode;
			}
			currentNode = currentNode.next;
			i++;
		}
		lastNode.next = null;
		if (left == 1) {
			lastNode = head;
			head = reverse(head);
		} else {
			lastNode = startNode.next;
			startNode.next = reverse(startNode.next);
		}
		lastNode.next = currentNode;
		return head;
	}
}