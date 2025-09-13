import java.util.*;
class ChocolateDistribution{
    static int minDiff(int[] a,int m){
        Arrays.sort(a);
        if(m==0||m>a.length) return 0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i+m-1<a.length;i++) ans=Math.min(ans,a[i+m-1]-a[i]);
        return ans;
    }
    public static void main(String[] args){
        int[] a={7,3,2,4,9,12,56};
        System.out.println(minDiff(a,3));
    }
}