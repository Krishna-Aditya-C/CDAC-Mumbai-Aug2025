import java.util.Scanner;
class NBitBinaryRec {
    static void generate(String s,int n,int ones,int zeros){
        if(s.length()==n){System.out.println(s);return;}
        generate(s+"1",n,ones+1,zeros);
        if(zeros+1<=ones)generate(s+"0",n,ones,zeros+1);
    }
    public static void main(String[] args){
        generate("",new Scanner(System.in).nextInt(),0,0);
    }
}