package Binarytree;


public class largestNode{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
   static class Binarytree{
    static int  i=-1;
    public Node buildtrees(int seq[])
    {
         i++;
        if(seq[i]==-1){
            return null;
        }
           Node n1=new Node(seq[i]);
           n1.left=buildtrees(seq);
           n1.right=buildtrees(seq);
           return n1;
    }
    public int large=-1;
    public int largest(Node root){
        if(root==null){
            return large;
        }
        if(root.data>large){
            large=root.data;
        }
        int ld=largest(root.left);
        int rd=largest(root.right);
        if(ld>rd){
            return ld;
        }
        else{
            return rd;
        }
    }
   }



    public static void main(String[] args) {
        int sequence[]={11,2,4,-1,-1,5,-1,-1,3,-1,-1};
        Binarytree bt=new Binarytree();
        Node root=bt.buildtrees(sequence);
       
        int ht=bt.largest(root);
        System.out.println(ht);

    }
}