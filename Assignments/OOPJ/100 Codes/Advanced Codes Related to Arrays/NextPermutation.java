import java.util.*;
class NextPermutation{
    static void next(int[] a){
        int n=a.length,i=n-2;
        while(i>=0&&a[i]>=a[i+1]) i--;
        if(i>=0){int j=n-1;while(a[j]<=a[i]) j--;int t=a[i];a[i]=a[j];a[j]=t;}
        for(int l=i+1,r=n-1;l<r;l++,r--){int t=a[l];a[l]=a[r];a[r]=t;}
    }
    public static void main(String[] args){
        int[] a={1,2,3};
        next(a);
        System.out.println(Arrays.toString(a));
    }
}