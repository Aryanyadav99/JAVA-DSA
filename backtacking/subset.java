package backtacking;

public class subset {
    public static void subsetfinder(String str,String ans,int i){
         if(str.length()==i){
            System.out.println(ans);
            return;
         }
           // yes choice 
           subsetfinder(str, ans+str.charAt(i), i+1);
           // no choose on taking backtrack
           subsetfinder(str, ans, i+1);
         
    }
    public static void main(String[] args) {
        subsetfinder("abc", "", 0);
    }
}
