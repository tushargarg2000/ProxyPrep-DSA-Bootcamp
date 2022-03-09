Node* findLCA(Node* root,Node* p,Node* q){
	
	if(root==NULL)
		return NULL;
	
	
	
	if(p->data<root->data&&q->data<root->data){
		return findLCA(root->left,p,q);
	}
	
	else if(p->data>root->data&&q->data>root->data){
		return findLCA(root->right,p,q);
	}
	
	
	else if(p->data>=root->data&&q->data<=root->data)
	return root;
	
	else if(p->data<=root->data&&q->data>=root->data)	
		return root;
	
	
}

Node* lowestCommonAncestor(Node* root, Node* p, Node* q) {
    // add your logic here
	
	return findLCA(root,p,q);
}