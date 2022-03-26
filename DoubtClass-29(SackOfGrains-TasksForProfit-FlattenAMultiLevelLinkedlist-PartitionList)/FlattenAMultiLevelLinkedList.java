/** This is the ListNode class definition

class ListNode {
	int data;
	ListNode next;
	ListNode down;

	ListNode(int data) {
		this.data = data;
		this.next = null;
		this.down = null;
	}
}
**/

class Solution {
	ListNode flattenTheLinkedList(ListNode root) {
		// add your logic here
		ListNode temp = root.next;
		while(temp != null) {
			root = merge(root,temp);
			temp = temp.next;
		}
		ListNode copy = root;
		while(root != null) {
			root.next = root.down;
			root = root.next;
		}
		return copy;
	}
	ListNode merge(ListNode A,ListNode B) {
		ListNode temp = new ListNode(0);
		ListNode copy = temp;
		while(A != null && B != null) {
			if(A.data < B.data) {
				temp.down = A;
				A = A.down;
				temp = temp.down;
			}
			else {
				temp.down = B;
				B = B.down;
				temp = temp.down;
			}
		}
		while(A != null) {
			temp.down = A;
			A = A.down;
			temp = temp.down;
		}
		while(B != null) {
			temp.down = B;
			B = B.down;
			temp = temp.down;
		}
		return copy.down;
	}
}