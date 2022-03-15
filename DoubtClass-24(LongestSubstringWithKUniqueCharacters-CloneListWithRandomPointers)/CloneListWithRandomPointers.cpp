/* This is the ListNode class definition

class ListNode {
    public:
    int data;
    ListNode *next;
    ListNode* random;
    ListNode (int data) {
        this->data = data;
        this->next = NULL;
        this->random = NULL;
    }
};
*/

ListNode* cloneTheLinkedList (ListNode* head) {
    // add your logic here
	ListNode* a = head;
	ListNode* copy = NULL;
	ListNode* b = NULL;
	map<ListNode*, ListNode*> ump;
	while(a != NULL) {
		ListNode* temp = new ListNode(a->data);
		if(copy == NULL) {
			copy = b = temp;
		}
		else {
			b->next = temp;
			b = b->next;
		}
		ump[a] = temp;
		a = a->next;
	}
	b = copy;
	a = head;
	while(b != NULL) {
		b->random = ump[a->random];
		a = a->next;
		b = b->next;
	}
	return copy;
}