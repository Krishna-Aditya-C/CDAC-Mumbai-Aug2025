import java.util.Scanner;
class SumDigits {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt(),s=0;
        while(n>0){s+=n%10;n/=10;}
        System.out.println(s);
    }
}
