import java.util.Scanner;
class Permutation {
    static int fact(int n){return n<=1?1:n*fact(n-1);}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),r=sc.nextInt();
        System.out.println(fact(n)/fact(n-r));
    }
}