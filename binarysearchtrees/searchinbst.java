// we have to search is there is that element is comes under   binary tree
// compare root with and acc to comdition goes to left or right subtree
// similar to the binary search here root is our mid value
//tc=0(h);for balaced its logn for skewwed it is n
package binarysearchtrees;

public class searchinbst {
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
    public static boolean search(Node root,int key){
             if(root==null){
                return false;
             }
             if(root.data==key){
                return true;
             }
             if(root.data>key){
                boolean lf=search(root.left, key);
                return lf;// ye parent ko batega ki left me mili ya nhi mili
             }
             else{
                boolean rf=search(root.right,key);
                return rf;
             }
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
        System.out.println(search(root, 16));

    }
}
