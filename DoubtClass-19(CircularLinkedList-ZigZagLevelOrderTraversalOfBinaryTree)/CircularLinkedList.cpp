#include<bits/stdc++.h>
using namespace std;
class node
{
public:
	int data;
	struct node* next;
	node(int data) {
		this->data = data;
		next = NULL;
	}
};
void printCLL(struct node* head) {
	if(head == NULL) {
		return;
	}
	struct node* temp = head;
	do{
		cout << (head->data) << " ";
		head = head->next;
	}while(temp != head);
	cout << "\n";
}
struct node* insertAtStart(struct node* head,int data) {
	if(head == NULL) {
		struct node* newNode = new node(data);
		newNode->next = newNode;
		return newNode;
	}
	struct node* temp = head;
	struct node* last = NULL;
	do{
		last = head;
		head = head->next;
	}while(temp != head);
	struct node* newNode = new node(data);
	last->next = newNode;
	newNode->next = head;
	return newNode;
}
void insertAfterGivenNode(struct node* curr,int data) {
	struct node* newNode = new node(data);
	newNode->next = curr->next;
	curr->next = newNode;
}
void insertBeforeGivenNode(struct node* curr,int data) {
	struct node* temp = curr;
	struct node* prev = NULL;
	do{
		prev = curr;
		curr = curr->next;
	}while(temp != curr);
	struct node* newNode = new node(data);
	prev->next = newNode;
	newNode->next = curr;
}
struct node* deleteHead(struct node* head) {
	if(head == NULL || head->next == head) {
		return NULL;
	}
	struct node* temp = head;
	struct node* prev = NULL;
	do {
		prev = head;
		head = head->next;
	}while(head != temp);
	prev->next = temp->next;
	return temp->next;
}
void deleteNode(struct node* curr) {
	struct node* temp = curr;
	struct node* prev = NULL;
	do {
		prev = curr;
		curr = curr->next;
	}while(curr != temp);
	prev->next = temp->next;
} 
int main() {
	struct node* head = new node(1);
	struct node* second = new node(2);
	struct node* third = new node(3);
	head->next = second;
	second->next = third;
	third->next = head;
	cout << "Initially: ";
	printCLL(head);
	//head = insertAtStart(head, 4);
	//insertAfterGivenNode(second, 4);
	//insertBeforeGivenNode(second, 4);
	//head = deleteHead(head);
	deleteNode(second);
	cout << "After: ";
	printCLL(head);
}