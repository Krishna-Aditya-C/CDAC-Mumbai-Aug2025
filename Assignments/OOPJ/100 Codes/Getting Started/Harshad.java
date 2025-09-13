import java.util.Scanner;
class Harshad {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt(),t=n,s=0;
        while(t>0){s+=t%10;t/=10;}
        System.out.println(n%s==0?"Harshad":"Not Harshad");
    }
}
