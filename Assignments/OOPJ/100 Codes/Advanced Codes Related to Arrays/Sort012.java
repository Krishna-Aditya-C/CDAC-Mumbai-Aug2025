import java.util.*;
class Sort012{
    static void sort(int[] a){
        int l=0,m=0,h=a.length-1;
        while(m<=h){
            if(a[m]==0){int t=a[l];a[l]=a[m];a[m]=t;l++;m++;}
            else if(a[m]==1)m++;
            else{int t=a[h];a[h]=a[m];a[m]=t;h--;}
        }
    }
    public static void main(String[] args){
        int[] a={2,0,1,2,1,0,0,2,1};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}