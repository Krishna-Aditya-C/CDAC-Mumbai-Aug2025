import java.util.Scanner;
class FractionAdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt(),d1=sc.nextInt(),n2=sc.nextInt(),d2=sc.nextInt();
        int num=n1*d2+n2*d1,den=d1*d2,g=gcd(num,den);
        System.out.println((num/g)+"/"+(den/g));
    }
    static int gcd(int a,int b){return b==0?a:gcd(b,a%b);}
}