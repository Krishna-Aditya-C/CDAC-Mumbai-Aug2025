import java.util.*;
class MinimizeHeights{
    static int minimize(int[] a,int k){
        Arrays.sort(a);
        int n=a.length;
        int ans=a[n-1]-a[0];
        int small=a[0]+k, big=a[n-1]-k;
        if(small>big){int t=small;small=big;big=t;}
        for(int i=1;i<n-1;i++){
            int subtract=a[i]-k, add=a[i]+k;
            if(subtract>=small||add<=big) continue;
            if(big-subtract<=add-small) small=subtract;
            else big=add;
        }
        return Math.min(ans,big-small);
    }
    public static void main(String[] args){
        int[] a={1,15,10};int k=6;
        System.out.println(minimize(a,k));
    }
}