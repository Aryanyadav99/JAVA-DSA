//find the largest size of bst in a bt
//approach :-check is valid bst and finf height compare 
package binarysearchtrees;

public class largestbstinbt {
    static class Node{
        int data;
        Node left ;
        Node right;
        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    // for storing all info make a info calss 
    static class info{
        boolean isbst;
        int size;
        int min;
        int max;
        info(boolean isbst,int size,int min,int max){
            this.isbst=isbst;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }
    public static int maxbst=0;
    public static info largestbst(Node root){
        if(root==null){
            return new info(true, 0, Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        info linfo=largestbst(root.left);
        info rinfo=largestbst(root.right);
        // ab root ki info nikalo 
        int size=linfo.size+rinfo.size+1;
        int min=Math.min(root.data,Math.min(linfo.min,rinfo.min));
        int max=Math.max(root.data,Math.max(linfo.max,rinfo.max));
        //check validity 
        if(root.data<linfo.max || root.data>rinfo.min){
            return new info(false, size, min, max);
        }
        if(linfo.isbst &&rinfo.isbst){ // true condtion
            maxbst=Math.max(maxbst,size);
            return new info(true, size, min, max);
        }
        //otherwise false
        return new info(false, size, min, max);
    }
    public static void main(String[]args){
        Node root=new Node (50);
        root.left=new Node(30);
        root.left.left=new Node(5);
        root.left.right=new Node(20);
        root.right=new Node (60);
        root.right.left=new Node(45);
        root.right.right=new Node(70);
        root.right.right.left=new Node(65);
        root.right.right.right=new Node(80);
         largestbst(root);
         System.out.println(maxbst);
    }
}
