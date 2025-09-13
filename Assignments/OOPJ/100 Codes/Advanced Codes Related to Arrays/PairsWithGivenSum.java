import java.util.*;
class PairsWithGivenSum{
    static List<int[]> pairs(int[] a,int k){
        Arrays.sort(a);
        List<int[]> r=new ArrayList<>();
        int i=0,j=a.length-1;
        while(i<j){
            int s=a[i]+a[j];
            if(s==k){r.add(new int[]{a[i],a[j]});i++;j--;}
            else if(s<k)i++;else j--;
        }
        return r;
    }
    public static void main(String[] args){
        int[] a={1,5,7,-1,5};
        for(int[] p:pairs(a,6)) System.out.println(p[0]+" "+p[1]);
    }
}