import java.util.Scanner;
class SmallestRec {
    static int smallest(int[] a,int n){return n==1?a[0]:Math.min(a[n-1],smallest(a,n-1));}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int[] arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        System.out.println(smallest(arr,n));
    }
}