import java.util.Scanner;
class SubsetsRec {
    static void subsets(int[] arr,int i,String ans){
        if(i==arr.length){System.out.println(ans);return;}
        subsets(arr,i+1,ans+arr[i]+" ");
        subsets(arr,i+1,ans);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        subsets(arr,0,"");
    }
}