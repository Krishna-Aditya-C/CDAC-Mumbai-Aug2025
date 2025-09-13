import java.util.*;
class KthMinMax{
    static int kthMin(int[] a,int k){int[] b=a.clone();Arrays.sort(b);return b[k-1];}
    static int kthMax(int[] a,int k){int[] b=a.clone();Arrays.sort(b);return b[b.length-k];}
    public static void main(String[] args){
        int[] a={7,10,4,3,20,15};
        System.out.println(kthMin(a,3));
        System.out.println(kthMax(a,3));
    }
}