package heaps;

import java.util.PriorityQueue;

public class nearbycars  {
  static class points implements Comparable<points>{
     int x;
     int y;
     int dis;
     int idx;
     points(int x,int y, int dis,int idx){
        this.x=x;
        this.y=y;
        this.dis=dis;
        this.idx=idx;
     }
     @Override
     public int compareTo(points p2){
        return this.dis-p2.dis;
     }
  }
    public static void main(String[]args){
        int pts[][]={{3,3},{5,-1},{-2,4}};
        int k=2;
       PriorityQueue<points>pq=new PriorityQueue<>();
       for(int i=0;i<pts.length;i++){
        int dis=pts[i][0]*pts[i][0]+pts[i][1]+pts[i][1];
        pq.add(new points (pts[i][0],pts[i][1],dis,i));
       }
       //nearest k cars
       for(int i=0;i<k;i++){
        System.out.println("C"+pq.remove().idx);
       }
        }
    }

