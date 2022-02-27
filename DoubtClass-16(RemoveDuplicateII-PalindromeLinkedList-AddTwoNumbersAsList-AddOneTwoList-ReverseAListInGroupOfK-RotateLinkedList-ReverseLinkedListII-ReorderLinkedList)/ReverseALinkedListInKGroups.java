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
	ListNode reverseLinkedListKGroup(ListNode head, int k) {
		// add your logic here
		int len = getLength(head);
		int left = 1;
		while(left+k-1 <= len) {
			head = reverseLinkedListRange(head,left,left+k-1);
			left += k;
		}
		return head;
	}
	int getLength(ListNode head) {
		int len = 0;
		while(head != null) {
			head = head.next;
			len++;
		}
		return len;
	}
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