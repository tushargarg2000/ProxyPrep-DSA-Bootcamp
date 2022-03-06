import java.util.*;
public class Bootcamp {
	public static void main(String[] args) {
		DoublyLinkedListNode head = new DoublyLinkedListNode(1);
		DoublyLinkedListNode second = new DoublyLinkedListNode(2);
		DoublyLinkedListNode third = new DoublyLinkedListNode(3);
		head.next = second;
		second.next = third;
		second.prev = head;
		third.prev = second;
		System.out.print("Initial list: ");
		printDLL(head);
		head = insertAtStart(head, 4);
		//insertAfterGivenNode(second, 4);
		//insertBeforeGivenNode(second, 4);
		//head = deleteNode(head, head);
		//head = deleteNode(head, second);
		//head = deleteNode(head, third);
		System.out.print("After Insertion: ");
		printDLL(head);
	}

	static private void printDLL(DoublyLinkedListNode head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	static private DoublyLinkedListNode insertAtStart(DoublyLinkedListNode head,int data) {
		DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
		newNode.next = head;
		if(head != null) {
			head.prev = newNode;
		}
		return newNode;
	}

	static private void insertAfterGivenNode(DoublyLinkedListNode node, int data) {
		DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
		newNode.next = node.next;
		newNode.prev = node;
		if(node.next != null) {
			node.next.prev = newNode;
		}
		node.next = newNode;
	}

	static private void insertBeforeGivenNode(DoublyLinkedListNode node, int data) {
		DoublyLinkedListNode prevNode = node.prev;
		insertAfterGivenNode(prevNode, data);
	}

	static private DoublyLinkedListNode deleteNode(DoublyLinkedListNode head, DoublyLinkedListNode node) {
		if(head == null || node == null) {
			return head;
		}
		if(head == node) {
			if(head.next != null) {
				head.next.prev = null;
			}
			return head.next;
		}
		node.prev.next = node.next;
		if(node.next != null) {
			node.next.prev = node.prev;
		}
		return head;
	}
}

class DoublyLinkedListNode {
	int data;
	DoublyLinkedListNode next;
	DoublyLinkedListNode prev;
	DoublyLinkedListNode(int data) {
		this.data = data;
		next = null;
		prev = null;
	}
}