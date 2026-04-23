public class DeletionInBinarySearchTree{
    static class Node{
        int data;
        Node right, left;
        Node(int data){
            this.data=data;
            right=left=null;
        }
    }
    static Node findMin(Node node){
        while(node.left!=null) node=node.left;
        return node;
    }
    public static Node insert(Node node, int value){
        if(node==null) return new Node(value);
        if(value<node.data){
            node.left=insert(node.left,value);
        }
        else if(value>node.data){
            node.right=insert(node.right,value);
        }
        return node;
    }
    public static void inorder(Node node){
        if(node==null) return;
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }
    public static Node delete(Node node, int key){
        if(node==null) return null;
        if(key<node.data){
            node.left=delete(node.left,key);
        }
        else if(key>node.data){
            node.right=delete(node.right,key);
        }
        else {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;
            Node successor = findMin(node.right);
            node.data = successor.data;
            node.right = delete(node.right, successor.data);
        }
        return node;
    }
    public static void main(String[] args){
        int[] items = {50, 30, 70, 20, 40, 60, 80};
        Node root = null;
        for(int fr:items)
            root=insert(root,fr);
        System.out.print("Inorder Traversal before deletion: "); inorder(root);
        System.out.println();
        int key =50;
        root = delete(root,key);
        System.out.print("Inorder Traversal after deletion: "); inorder(root);
        System.out.println();

    }
}