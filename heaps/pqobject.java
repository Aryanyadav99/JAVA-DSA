package heaps;
import java.util.*;
public class pqobject {
    static class Student implements Comparable<Student>{
        // in this class me have name and rank so how to find which have to gave prioroity by pq
        // for the priority in class we have to definr a special interface name s as comparable 
        //comparable gaves the power to class to priority any on one its data
        // use the fun overriding menas fubnction inplement by child class for parent 
        String name;
        int rank;
        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s2){// s2 is second object of student class 
            return this.rank-s2.rank;//this compares on the bases of rank
            // return s1.rank-s2.rank gave a + or -or 0 value
            // if it return 0 so element equal +ve first grstater -second greater
        }
    }
    public static void main(String[]args){
      PriorityQueue<Student>pq=new PriorityQueue<>();
      pq.add(new Student("A", 4));
      pq.add(new Student("b",5 ));
      pq.add(new Student("c", 2));
      pq.add(new Student("d", 12));
      while(!pq.isEmpty()){
        System.out.println(pq.peek().name+"->"+pq.peek().rank);
        pq.remove();
      }
    }
}
