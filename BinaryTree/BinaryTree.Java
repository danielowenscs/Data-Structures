Class BinaryTree<T> {
    Class Node<T> {
        T data;
        Node <T> left;
        Node <T> right;

        public Node (T obj ) {
            this.data = obj;
            this.left = null;
            this.right = null;
        }
    }

    private Node <E> root;
	private int size;

    public BinaryTree () {
        root = null;
        size = 0;
    }

    public void addElement(Object obj) {
        // check empty tree
        Node <T> node = new Node<T>(obj);
        if (root == null) {
            root = node;
            return;
        }
        
    }
}