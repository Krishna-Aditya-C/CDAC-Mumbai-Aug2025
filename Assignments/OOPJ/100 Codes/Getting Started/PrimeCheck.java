import java.util.Scanner;
class PrimeCheck {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt(),c=0;
        for(int i=2;i<=n/2;i++) if(n%i==0){c=1;break;}
        System.out.println((c==0 && n>1)?"Prime":"Not Prime");
    }
}
