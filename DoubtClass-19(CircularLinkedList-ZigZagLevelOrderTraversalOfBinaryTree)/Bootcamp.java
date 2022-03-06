import java.util.*;
public class Bootcamp {
	public static void main(String[] args) {
		LinkedListNode head = new LinkedListNode(1);
		LinkedListNode second = new LinkedListNode(2);
		LinkedListNode third = new LinkedListNode(3);
		head.next = second;
		second.next = third;
		third.next = head;
		System.out.print("Initial: ");
		printCLL(head);
		//head = insertAtStart(head, 4);
		//insertBeforeGivenNode(second, 4);
		//insertAfterGivenNode(second, 4);
		//head = deleteHead(head);
		deleteNode(second);
		System.out.print("After: ");
		printCLL(head);
	}

	static private void printCLL(LinkedListNode head) {
		if(head == null) {
			return;
		}
		LinkedListNode temp = head;
		do {
			System.out.print(head.data + " ");
			head = head.next;
		}while(head != temp);
		System.out.println();
	}

	static private LinkedListNode insertAtStart(LinkedListNode head,int data) {
		if(head == null) {
			LinkedListNode newNode = new LinkedListNode(data);
			newNode.next = newNode;
			return newNode;
		}
		LinkedListNode temp = head;
		LinkedListNode last = null;
		do {
			last = head;
			head = head.next;
		}while(head != temp);
		LinkedListNode newNode = new LinkedListNode(data);
		last.next = newNode;
		newNode.next = head;
		return newNode;
	}
	static private void insertBeforeGivenNode(LinkedListNode node, int data) {
		LinkedListNode temp = node;
		LinkedListNode prev = null;
		do {
			prev = node;
			node = node.next;
		}while(node != temp);
		LinkedListNode newNode = new LinkedListNode(data);
		prev.next = newNode;
		newNode.next = node;
	}
	static private void insertAfterGivenNode(LinkedListNode node,int data) {
		LinkedListNode newNode = new LinkedListNode(data);
		newNode.next = node.next;
		node.next = newNode;
	}
	static private LinkedListNode deleteHead(LinkedListNode head) {
		if(head == null || head == head.next) {
			return null;
		}
		LinkedListNode temp = head;
		LinkedListNode prev = null;
		do {
			prev = head;
			head = head.next;
		}while(head != temp);
		prev.next = temp.next;
		return temp.next;
	}
	static private void deleteNode(LinkedListNode node) {
		LinkedListNode temp = node;
		LinkedListNode prev = null;
		do {
			prev = node;
			node = node.next;
		}while(node != temp);
		prev.next = temp.next;
	}
}

class LinkedListNode {
	int data;
	LinkedListNode next;
	LinkedListNode(int data) {
		this.data = data;
		next = null;
	}
}