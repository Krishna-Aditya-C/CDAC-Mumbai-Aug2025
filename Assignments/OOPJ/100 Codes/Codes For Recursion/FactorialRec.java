import java.util.Scanner;
class FactorialRec {
    static int fact(int n){return n<=1?1:n*fact(n-1);}
    public static void main(String[] args){
        System.out.println(fact(new Scanner(System.in).nextInt()));
    }
}