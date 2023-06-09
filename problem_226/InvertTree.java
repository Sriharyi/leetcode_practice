class InvertTree{
    private class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    private Node root;
    public void invertTree(){
        invertTree(root);
    }
    // going to invert the tree
    private void invertTree(Node root){
        if(root == null){
            return;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
    }
    public void insert(int data)
    {
        // insert code
        if(root == null){
            root = new Node(data);
            return;
        }
        Node temp = root;
        while(true){
            if(data <= temp.data){
                if(temp.left == null){
                    temp.left = new Node(data);
                    return;
                }
                temp = temp.left;
            }
            else{
                if(temp.right == null){
                    temp.right = new Node(data);
                    return;
                }
                temp = temp.right;
            }
        }
    }
    public void inorder(){
        inorder(root);
        System.out.println();
    }
    private void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main(String... args)
    {
        InvertTree bst = new  InvertTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);
        bst.inorder();
        bst.invertTree();
        bst.inorder();
    }
    
}