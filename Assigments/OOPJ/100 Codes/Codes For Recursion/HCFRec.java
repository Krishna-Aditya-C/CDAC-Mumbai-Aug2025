import java.util.Scanner;
class HCFRec {
    static int hcf(int a,int b){return b==0?a:hcf(b,a%b);}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(hcf(sc.nextInt(),sc.nextInt()));
    }
}