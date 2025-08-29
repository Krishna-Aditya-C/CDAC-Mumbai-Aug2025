import java.util.Scanner;
class PerfectSquare {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        int r=(int)Math.sqrt(n);
        System.out.println(r*r==n?"Perfect Square":"Not Perfect Square");
    }
}
