import java.util.Scanner;
class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),p=1;
        for(int i=0;i<b;i++) p*=a;
        System.out.println(p);
    }
}
