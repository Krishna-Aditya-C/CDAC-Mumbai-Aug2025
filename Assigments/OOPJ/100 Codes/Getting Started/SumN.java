import java.util.Scanner;
class SumN{
    public static void main(String[] args){
        int n=new Scanner(System.in).nextInt(),s=0;
        for(int i=1;i<n;i++) s+=1;
        System.out.println(s);
    }
}