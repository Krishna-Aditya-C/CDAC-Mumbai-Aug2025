import java.util.Scanner;
class PrimeRec {
    static boolean prime(int n,int i){
        if(n<2)return false;
        if(i*i>n)return true;
        if(n%i==0)return false;
        return prime(n,i+1);
    }
    public static void main(String[] args){
        int n=new Scanner(System.in).nextInt();
        System.out.println(prime(n,2)?"Prime":"Not Prime");
    }
}