import java.util.*;
class RearrangeAlternatingPosNeg{
    static void rearrange(int[] a){
        int n=a.length,i=-1;
        for(int j=0;j<n;j++) if(a[j]<0){i++;int t=a[i];a[i]=a[j];a[j]=t;}
        int pos=i+1,neg=0;
        while(pos<n&&neg<pos&&a[neg]<0){int t=a[neg];a[neg]=a[pos];a[pos]=t;pos++;neg+=2;}
    }
    public static void main(String[] args){
        int[] a={-5,-2,5,2,4,7,1,8,0,-8};
        rearrange(a);
        System.out.println(Arrays.toString(a));
    }
}