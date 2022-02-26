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
	ListNode getIntersectionNode(ListNode A, ListNode B) {
		// add your logic here
		int lenA = getLength(A);
		int lenB = getLength(B);
		int diff = lenA-lenB;
		if(diff >= 0) {
			while(diff-->0) {
				A = A.next;
			}
		}
		else {
			diff = -diff;
			while(diff-->0) {
				B = B.next;
			}
		}
		while(A != null) {
			if(A == B) {
				return A;
			}
			A = A.next;
			B = B.next;
		}
		return null;
	}
	private int getLength(ListNode list) {
		int len = 0;
		while(list != null) {
			len++;
			list = list.next;
		}
		return len;
	}
}