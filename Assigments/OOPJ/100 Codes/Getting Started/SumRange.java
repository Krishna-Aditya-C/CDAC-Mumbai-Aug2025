import java.util.Scanner;
class SumRange{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),s=0;
        for(int i=a;i<=b;i++) s+=1;
        System.out.println(s);
    }
}