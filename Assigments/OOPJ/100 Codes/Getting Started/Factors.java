import java.util.Scanner;
class Factors {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        for(int i=1;i<=n;i++) if(n%i==0) System.out.print(i+" ");
    }
}
