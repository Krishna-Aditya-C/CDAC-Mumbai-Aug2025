import java.util.*;
class CountInversions{
    static long mergeSort(int[] a,int l,int r){
        if(l>=r) return 0;
        int m=(l+r)/2;
        long inv=mergeSort(a,l,m)+mergeSort(a,m+1,r);
        int[] t=new int[r-l+1];
        int i=l,j=m+1,k=0;
        while(i<=m&&j<=r){
            if(a[i]<=a[j]) t[k++]=a[i++];
            else{t[k++]=a[j++];inv+=m-i+1;}
        }
        while(i<=m)t[k++]=a[i++];
        while(j<=r)t[k++]=a[j++];
        for(i=0;i<t.length;i++) a[l+i]=t[i];
        return inv;
    }
    public static void main(String[] args){
        int[] a={1,20,6,4,5};
        System.out.println(mergeSort(a,0,a.length-1));
    }
}