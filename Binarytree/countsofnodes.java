package Binarytree;

public class countsofnodes {
    static class Node{ //node class for node creation
        int data;
        Node left;
        Node right;
        Node(int data){
           this.data=data;
           this.left=null;
           this.right=null;
        }
    }
    static class binarytree{ // for the tree formation
        static int idx=-1; // static  because in every recursion we can update it
        public  Node buildTree(int sequence[]){ // this function is used to return nodes (root node) and also form, the entire tree;
           idx++; 
           if(sequence[idx]==-1){ //base case of recursion
               return null;
           }  
           // if node is null then there is no left and right child
           // if there is no -1 so make a node and store value on it
           Node newnode=new Node(sequence[idx]);
           newnode.left=buildTree(sequence);// fromed left subtree
           newnode.right=buildTree(sequence);// formed right subtree
           return newnode;
        }
        public int count(Node root){
            if(root==null){
                return 0;
            }
            int lc=count(root.left);
            int rc=count(root.right);
            return (lc+rc+1);
        }
    }
    public static void main(String[]args){
        int sequence[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; //preorder sequence
        binarytree bt=new binarytree();
        Node root=bt.buildTree(sequence);
        System.out.println(bt.count(root));
}
}
