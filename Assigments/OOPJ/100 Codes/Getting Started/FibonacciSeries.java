import java.util.Scanner;
class FibonacciSeries {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt(),a=0,b=1;
        for(int i=1;i<=n;i++){System.out.print(a+" ");int c=a+b;a=b;b=c;}
    }
}
