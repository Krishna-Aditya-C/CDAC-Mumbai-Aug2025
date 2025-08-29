import java.util.Scanner;
class LastNonZeroFactRec {
    static int fact(int n){return n<=1?1:n*fact(n-1);}
    static int lastNonZero(int n){
        int f=fact(n);
        while(f%10==0)f/=10;
        return f%10;
    }
    public static void main(String[] args){
        System.out.println(lastNonZero(new Scanner(System.in).nextInt()));
    }
}