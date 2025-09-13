import java.util.Scanner;
class XDivisors {
    static int divCount(int n){int c=0;for(int i=1;i<=n;i++)if(n%i==0)c++;return c;}
    public static void main(String[] args) {
        int x=new Scanner(System.in).nextInt();
        for(int i=1;i<=1000;i++) if(divCount(i)==x) System.out.print(i+" ");
    }
}