import java.util.Scanner;
class Automorphic {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        int sq=n*n;
        System.out.println(sq%((int)Math.pow(10,String.valueOf(n).length()))==n?"Automorphic":"Not Automorphic");
    }
}
