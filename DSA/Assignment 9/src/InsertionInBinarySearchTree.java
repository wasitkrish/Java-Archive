public class InsertionInBinarySearchTree{
    static class Node{
        int data;
        Node right,left;
        Node(int data){
            this.data=data;
            right=left=null;
        }
    }
    public static Node insert(Node node,int value){
        if(node==null) return new Node(value);
        if(value>node.data){
          node.right = insert(node.right,value);
        }
        if(value<node.data){
            node.left = insert(node.left,value);
        }
        return node;
    }
    public static void inorder(Node node){
        if(node==null) return;
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }
    public static void main(String[] args){
        int[] items = {50, 30, 70, 20, 40, 60, 80};
        Node root = null;
        for(int every : items){
            root = insert(root,every);
        }
        System.out.print("Inorder: "); inorder(root);
        System.out.println();
    }
}