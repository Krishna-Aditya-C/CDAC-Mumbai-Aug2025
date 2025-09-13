import java.util.Scanner;
class Armstrong {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt(),t=n,s=0,d;
        while(t>0){d=t%10;s+=d*d*d;t/=10;}
        System.out.println(s==n?"Armstrong":"Not Armstrong");
    }
}
