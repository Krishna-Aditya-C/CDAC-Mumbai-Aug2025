import java.util.Scanner;
class LargestRec {
    static int largest(int[] a,int n){return n==1?a[0]:Math.max(a[n-1],largest(a,n-1));}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int[] arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        System.out.println(largest(arr,n));
    }
}