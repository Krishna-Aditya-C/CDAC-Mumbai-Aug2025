import java.util.Scanner;
class FibonacciRec {
    static int fib(int n){return n<=1?n:fib(n-1)+fib(n-2);}
    public static void main(String[] args){
        System.out.println(fib(new Scanner(System.in).nextInt()));
    }
}