public class SearchInBinaryTree{
    static class Node{
        int data;
        Node right,left;
        Node(int data){
            this.data=data;
            right=left=null;
        }
    }
    public static boolean search(Node node, int key){
        if(node==null) return false;
        if(node.data==key) return true;
        return search(node.left,key)||search(node.right,key);
    }
    public static void main(String[] args){
        Node root = new Node(8);
        root.left=new Node(3);
        root.right=new Node(10);
        int key =10;
        if(search(root,key)){
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}