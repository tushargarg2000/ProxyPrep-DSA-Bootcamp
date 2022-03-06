#include<bits/stdc++.h>
using namespace std;
class node
{
public:
	int data;
	struct node* next;
	struct node* prev;
	node(int data) {
		this->data = data;
		next = prev = NULL;
	}
};
void printDLL(struct node* head) {
	while(head != NULL) {
		cout << (head->data) << " ";
		head = head->next;
	}
	cout << endl;
}
struct node* insertAtStart(struct node* head,int data) {
	struct node* newNode = new node(data);
	newNode->next = head;
	if(head != NULL) {
		head->prev = newNode;
	}
	return newNode;
}
void insertAfterGivenNode(struct node* temp,int data) {
	struct node* newNode = new node(data);
	newNode->next = temp->next;
	newNode->prev = temp;
	if(temp->next != NULL) {
		temp->next->prev = newNode;
	}
	temp->next = newNode;
}
void insertBeforeGivenNode(struct node* temp, int data) {
	struct node* prevNode = temp->prev;
	insertAfterGivenNode(prevNode, data);
}
struct node* deleteNode(struct node* head, struct node* temp) {
	if(head == NULL || temp == NULL) {
		return head;
	}
	if(head == temp) {
		if(head->next != NULL) {
			head->next->prev = NULL;
		}
		return head->next;
	}
	temp->prev->next = temp->next;
	if(temp->next != NULL) {
		temp->next->prev = temp->prev;
	}
	return head;
}
int main() {
	struct node* head = new node(1);
	struct node* second = new node(2);
	struct node* third = new node(3);
	head->next = second;
	second->next = third;
	second->prev = head;
	third->prev = second;
	cout << "Initially: ";
	printDLL(head);
	head = insertAtStart(head, 4);
	//insertAfterGivenNode(second, 4);
	//insertBeforeGivenNode(second, 4);
	//head = deleteNode(head, head);
	//head = deleteNode(head, second);
	//head = deleteNode(head, third);
	cout << "After: ";
	printDLL(head);
	return 0;
}