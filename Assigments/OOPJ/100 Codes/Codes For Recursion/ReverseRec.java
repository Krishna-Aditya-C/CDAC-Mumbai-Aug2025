import java.util.Scanner;
class ReverseRec {
    static int rev(int n,int r){return n==0?r:rev(n/10,r*10+n%10);}
    public static void main(String[] args){
        int n=new Scanner(System.in).nextInt();
        System.out.println(rev(n,0));
    }
}