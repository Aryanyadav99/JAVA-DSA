// objective :- for deletion of a node 
// concept:-- there are three cases 
//1.. leaf node(no child)   2..single child  3.. two childerns
// step 1.. is to search node 
//step 2.. deletion 
// case 1 .. No  child (leaf Node)  
// first delete Node and retrun null to parent thats nnull connect to it and the garbage collector delete it 
// case 2 .. one child 
//first delelte the node then replace with child Node (retrun child Node)
//case 3 .. two children 
// firstly find out the inorrder successor
// inorder succesor? == in inorder seq the next node to that node which you want to delete 
// why we find? ==because it always maintain the propety(sorted sequence) of bst after deletion
//s2.. delete the node and return inorder sucessor and then delete inorder sucessor 
//inorder sucessor-- left most node in right subtree
package binarysearchtrees;
public class deletenode {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node inordersucc(Node root){
      while(root.left!=null){
        root=root.left;
      }
      return root;
    }
    public static Node delete(Node root,int val){
    // search 
    if(root.data>val){
        root.left=delete(root.left, val);
    }
    else if(root.data<val){
        root.right=delete(root.right, val);
    }
    else{//root.data===val
       //case 1 leaf node 
       if(root.left==null && root.right==null){
        return null;
       }
       //case 2 single child
       else if(root.left==null){
        return root.right;
       }
       else if(root.right==null){
        return root.left;
       }
       //case 2 : balanced node 
      Node is= inordersucc(root.right);
      root.data=is.data;
      root.right=delete(root.right, is.data);
    }
    return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[]args){
        Node root=new Node(8);
        root.left=new Node(5);
        root.right=new Node(10);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right.right=new Node(11);
        root.left.left.left=new Node(1);
        root.left.left.right=new Node(4);
        root.right.right.right=new Node(14);
        inorder(root);
        System.out.println();
        delete(root, 10);
        inorder(root);
    }
}
