
// depth of a nodes is basocally the distance of node from root node 
package Binarytree;


public class printnodesatdepth {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    static class Binarytree{
        public void depth(Node root,int k){
            if(root==null){
                return ;
            }
            if(k==0){
                System.out.println(root.data);
            }
            depth(root.left, k-1);
            depth(root.right, k-1);
        }
    }
    public static void main(String[] args) {
        Binarytree bt=new Binarytree();
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.right.right=new Node(5);
        bt.depth(root, 2);
    }
}
