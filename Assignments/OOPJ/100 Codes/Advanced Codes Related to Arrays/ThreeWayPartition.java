import java.util.*;
class ThreeWayPartition{
    static void partition(int[] a,int k){
        int l=0,m=0,h=a.length-1;
        while(m<=h){
            if(a[m]<k){int t=a[l];a[l]=a[m];a[m]=t;l++;m++;}
            else if(a[m]==k)m++;
            else{int t=a[h];a[h]=a[m];a[m]=t;h--;}
        }
    }
    public static void main(String[] args){
        int[] a={1,2,3,3,4,2,1,3,5};
        partition(a,3);
        System.out.println(Arrays.toString(a));
    }
}