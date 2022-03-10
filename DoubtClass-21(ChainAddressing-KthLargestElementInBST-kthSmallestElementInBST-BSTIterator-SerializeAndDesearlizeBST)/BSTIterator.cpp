/* This is the Node class definition

class Node {
public:
    Node* left;
    Node* right;
    int data;

    Node(int data) {
        this->left = NULL;
        this->right = NULL;
        this->data = data;
    }
};
*/

/* This is the Node class definition

class Node {
public:
    Node* left;
    Node* right;
    int data;

    Node(int data) {
        this->left = NULL;
        this->right = NULL;
        this->data = data;
    }
};
*/

class BSTIterator {
public:
	vector<Node*> treeNodes;
	void insertLeftNodes(Node* root) {
		while (root != NULL) {
			treeNodes.push_back(root);
			root = root->left;
		}
	}
    BSTIterator(Node* root) {
		insertLeftNodes(root);
    }
    
    bool hasNext() {
		return !treeNodes.empty();
    }
    
    Node* next() {
		int last = treeNodes.size() - 1;
		Node* currNode = treeNodes[last];
		treeNodes.pop_back();
		insertLeftNodes(currNode->right);
		return currNode;
    }
};