import java.util.Scanner;
class PrimeRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        for(int i=a;i<=b;i++){
            int f=0;
            for(int j=2;j<=i/2;j++) if(i%j==0){f=1;break;}
            if(f==0 && i>1) System.out.print(i+" ");
        }
    }
}
