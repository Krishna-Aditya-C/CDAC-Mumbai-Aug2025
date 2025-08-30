import java.util.*;
class LongestConsecutiveSubsequence{
    static int longest(int[] a){
        Set<Integer> s=new HashSet<>();
        for(int x:a)s.add(x);
        int best=0;
        for(int x:s) if(!s.contains(x-1)){int y=x,len=1;while(s.contains(y+1)){y++;len++;}if(len>best)best=len;}
        return best;
    }
    public static void main(String[] args){
        int[] a={1,9,3,10,4,20,2};
        System.out.println(longest(a));
    }
}