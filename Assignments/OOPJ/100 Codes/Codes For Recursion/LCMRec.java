import java.util.Scanner;
class LCMRec {
    static int hcf(int a,int b){return b==0?a:hcf(b,a%b);}
    static int lcm(int a,int b){return a*b/hcf(a,b);}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(lcm(sc.nextInt(),sc.nextInt()));
    }
}