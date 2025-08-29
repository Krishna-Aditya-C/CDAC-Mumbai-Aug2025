import java.util.Scanner;
class ReverseNum {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt(),r=0;
        while(n>0){r=r*10+n%10;n/=10;}
        System.out.println(r);
    }
}
