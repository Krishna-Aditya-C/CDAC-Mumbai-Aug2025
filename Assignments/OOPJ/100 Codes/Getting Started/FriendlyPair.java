import java.util.Scanner;
class FriendlyPair {
    static int sumDiv(int n){int s=0;for(int i=1;i<=n/2;i++) if(n%i==0) s+=i;return s;}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.println((sumDiv(a)/a)==(sumDiv(b)/b)?"Friendly Pair":"Not Friendly Pair");
    }
}
