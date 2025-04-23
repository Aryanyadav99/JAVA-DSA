//Given-> a value array 
// operation ->to create bst 
//aproach -> we have to get a value forn array and compare with root if greater insert in right if less insert in left 
package binarysearchtrees;

public class buildbst {
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
    
      public static Node  insert(Node root,int val){
        
         if(root==null){
            root=new Node (val);
            return root;
         }
        if(root.data>val){
            root.left=insert(root.left, val);
        }
        if(root.data<val){
            root.right=insert(root.right, val);
        }
        return root ;
      }

      
      public static void inorder(Node root){
        if(root==null){
            return;
        }
        
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);

      
      }
      public static void main(String[]args){
        int values[]={5,1,3,4,2,7};
        Node root=null;
       for(int i=0;i<values.length;i++){
        root=insert(root, values[i]);
       }
        // for verification we form a inorder traversal 
        inorder(root);
      }
}
