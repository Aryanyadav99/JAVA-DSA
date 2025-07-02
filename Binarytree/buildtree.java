// objective -> we have a build a tree 
// given -> A preorder sequence thats consist of all data about nodes and -1 represent null data
//  sequence  -- in copy
// first-- node data   second -- left subtree data  third--right subtree thts the process done recursivily 
package Binarytree;
   
public class buildtree {
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
        public  Node buildTree(int sequence[],int idx){ // this function is used to return nodes (root node) and also form, the entire tree
           if(sequence[idx]==-1){ //base case of recursion
               return null;
           }  
           // if node is null then there is no left and right child
           // if there is no -1 so make a node and store value on it
           Node newnode=new Node(sequence[idx]);
           newnode.left=buildTree(sequence,idx+1);// fromed left subtree
           newnode.right=buildTree(sequence,idx+1);// formed right subtree
           return newnode;
        }
    }
    public static void main(String[]args){
        int sequence[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; //preorder sequence
        binarytree bt=new binarytree();
        Node root=bt.buildTree(sequence,0);
        System.out.println(root.data);
    }
}
// tc0(n);
