import java.util.Scanner;
class Strong {
    static int fact(int n){return n==0?1:n*fact(n-1);}
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt(),t=n,s=0;
        while(t>0){s+=fact(t%10);t/=10;}
        System.out.println(s==n?"Strong":"Not Strong");
    }
}
