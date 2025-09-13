import java.util.Scanner;
class GCD {
    static int gcd(int a,int b){return b==0?a:gcd(b,a%b);}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(gcd(sc.nextInt(),sc.nextInt()));
    }
}