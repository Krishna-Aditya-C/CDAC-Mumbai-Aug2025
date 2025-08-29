import java.util.Scanner;
class SumTwoPrimes {
    static boolean prime(int n){if(n<2)return false;for(int i=2;i<=n/2;i++)if(n%i==0)return false;return true;}
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        for(int i=2;i<=n/2;i++) if(prime(i)&&prime(n-i)){System.out.println(i+"+"+(n-i));return;}
        System.out.println("Not Possible");
    }
}