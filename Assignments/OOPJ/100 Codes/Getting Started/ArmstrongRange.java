import java.util.Scanner;
class ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        for(int i=a;i<=b;i++){
            int t=i,s=0,d;
            while(t>0){d=t%10;s+=d*d*d;t/=10;}
            if(s==i) System.out.print(i+" ");
        }
    }
}
