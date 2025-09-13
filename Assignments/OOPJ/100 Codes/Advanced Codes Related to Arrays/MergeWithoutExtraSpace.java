import java.util.*;
class MergeWithoutExtraSpace{
    static void merge(int[] a,int[] b){
        int n=a.length,m=b.length;
        int gap=(n+m+1)/2;
        while(gap>0){
            int i=0,j=gap;
            while(j<n+m){
                int ai=i<n?a[i]:b[i-n];
                int aj=j<n?a[j]:b[j-n];
                if(ai>aj){
                    if(i<n&&j<n){int t=a[i];a[i]=a[j];a[j]=t;}
                    else if(i<n&&j>=n){int t=a[i];a[i]=b[j-n];b[j-n]=t;}
                    else{int t=b[i-n];b[i-n]=b[j-n];b[j-n]=t;}
                }
                i++;j++;
            }
            if(gap==1) gap=0; else gap=(gap+1)/2;
        }
    }
    public static void main(String[] args){
        int[] a={1,4,7,8,10};int[] b={2,3,9};
        merge(a,b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}