import java.math.*;
class LargeFactorial{
    static BigInteger fact(int n){
        BigInteger r=BigInteger.ONE;
        for(int i=2;i<=n;i++) r=r.multiply(BigInteger.valueOf(i));
        return r;
    }
    public static void main(String[] args){
        System.out.println(fact(100));
    }
}