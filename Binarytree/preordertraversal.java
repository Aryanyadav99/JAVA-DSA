// how to traverse in a tree 
// we can travse tree through recursion ways most famous three are 
//..preorder, postorder,inorder
// traverse itervatively by level order 
//1... preorder   --called because root print first
//reules -- first print root then left subtree then right subtree
package Binarytree;

public class preordertraversal {
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
    static class binarytree{
       static int idx=-1;
        public Node buildtree(int sequence[]){
            idx++;
             if(sequence[idx]==-1){
                  return null;
             }  
             Node n1=new Node(sequence[idx]);
             n1.left=buildtree(sequence);
             n1.right=buildtree(sequence);
             return n1;
        }
        //function for the preorder traverse  tc 0(n);
        public  void preorder(Node root){  
            if(root==null){ 
                System.out.print("-1 ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);

        }
    }
    public static void main(String[]args){
        int sequence[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree bt=new binarytree();
        Node root =bt.buildtree(sequence);
       // System.out.println(root.data);
        bt.preorder(root);
    }
}
