import java.util.Scanner;
class Palindrome {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt(),t=n,r=0;
        while(t>0){r=r*10+t%10;t/=10;}
        System.out.println(r==n?"Palindrome":"Not Palindrome");
    }
}
