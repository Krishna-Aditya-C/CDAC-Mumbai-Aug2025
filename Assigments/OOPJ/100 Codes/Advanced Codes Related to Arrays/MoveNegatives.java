import java.util.*;
class MoveNegatives{
    static void move(int[] a){
        int j=0;
        for(int i=0;i<a.length;i++) if(a[i]<0){int t=a[i];a[i]=a[j];a[j]=t;j++;}
    }
    public static void main(String[] args){
        int[] a={-1,2,-3,4,5,-6};
        move(a);
        System.out.println(Arrays.toString(a));
    }
}