import java.util.Scanner;
class PascalRowRec {
    static int comb(int n,int r){return (r==0||r==n)?1:comb(n-1,r-1)+comb(n-1,r);}
    public static void main(String[] args){
        int n=new Scanner(System.in).nextInt();
        for(int i=0;i<=n;i++)System.out.print(comb(n,i)+" ");
    }
}