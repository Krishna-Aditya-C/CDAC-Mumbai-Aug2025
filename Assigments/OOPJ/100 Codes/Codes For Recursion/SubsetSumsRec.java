import java.util.Scanner;
class SubsetSumsRec {
    static void subsetSums(int[] arr,int n,int i,int sum){
        if(i==n){System.out.print(sum+" ");return;}
        subsetSums(arr,n,i+1,sum+arr[i]);
        subsetSums(arr,n,i+1,sum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        subsetSums(arr,n,0,0);
    }
}