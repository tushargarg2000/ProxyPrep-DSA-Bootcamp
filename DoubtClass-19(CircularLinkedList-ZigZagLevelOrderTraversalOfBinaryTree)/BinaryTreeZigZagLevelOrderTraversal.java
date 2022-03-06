class Solution {
    /* This is the Node class definition
    
    class Node {
        public Node left;
        public Node right;
        public int data;

        public Node(int data) {
            this.data = data;
        }
    }
    */
    
    int[] zigzagLevelOrderTraversal(Node root) {
        // add your logic here
        Deque<Node> deque = new LinkedList<Node>();
        List<Integer> ans = new ArrayList<Integer>();

        deque.add(root);
        ans.add(root.data);
        Node temp;

        int level = 1;

        while (!deque.isEmpty()) {
            int n = deque.size();

            for (int i = 0; i < n; i++) {
                if (level%2 == 0) {
                    temp = deque.peekLast();
                    deque.removeLast();
                    if (temp.left != null) {
                        deque.addFirst(temp.left);
                        ans.add(temp.left.data);
                    }
                    if (temp.right != null) {
                        deque.addFirst(temp.right);
                        ans.add(temp.right.data);
                    }
                } else {
                    temp = deque.peekFirst();
                    deque.removeFirst();
                    if (temp.right != null) {
                        deque.addLast(temp.right);
                        ans.add(temp.right.data);
                    }
                    if (temp.left != null) {
                        deque.addLast(temp.left);
                        ans.add(temp.left.data);
                    }
                }
            }
            level++;
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }
}