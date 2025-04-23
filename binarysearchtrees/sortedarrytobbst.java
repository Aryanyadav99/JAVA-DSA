// convert the sorted array to binary search tree and make the balanced bst of min height 
//thinking the inorder seq of bst formed by inorder sequencs is is same as sorted array
// for min height we set leftsubtree and righttree of same or likely same no for a root
//find middle in sorted array and left all elemt goes to left subtre and right for right subtree for all

package binarysearchtrees;

public class sortedarrytobbst {
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
    public static Node formbst(int array[],int lp,int rp){
       if(lp>rp){
        return null;
       }
            int mid =(lp+rp)/2;
            Node root=new Node(array[mid]);
            root.left=formbst(array, lp, mid-1);
            root.right=formbst(array, mid+1, rp);
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
        int array[]={3,5,6,8,10,11,12};
       Node root= formbst(array,0,array.length-1);
        inorder(root);
    }
}
