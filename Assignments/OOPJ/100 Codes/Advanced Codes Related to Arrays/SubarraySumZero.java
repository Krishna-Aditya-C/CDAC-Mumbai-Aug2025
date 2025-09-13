import java.util.*;
class SubarraySumZero{
    static boolean hasZeroSum(int[] a){
        Set<Integer> set=new HashSet<>();
        int s=0;set.add(0);
        for(int x:a){s+=x;if(set.contains(s)) return true;set.add(s);}
        return false;
    }
    public static void main(String[] args){
        int[] a={4,2,-3,1,6};
        System.out.println(hasZeroSum(a));
    }
}