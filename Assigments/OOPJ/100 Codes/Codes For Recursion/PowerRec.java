import java.util.Scanner;
class PowerRec {
    static int power(int a,int b){return b==0?1:a*power(a,b-1);}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(power(sc.nextInt(),sc.nextInt()));
    }
}